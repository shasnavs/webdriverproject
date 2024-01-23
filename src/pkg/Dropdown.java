package pkg;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	ChromeDriver driver;
	
	@Before
	public void setUp() 
	{
		driver =new ChromeDriver();
	}
	
	@Test
	public void dropdown()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("02");
		List<WebElement>countofday=daydetails.getOptions();
		System.out.println("total no of days:" +countofday.size());
		
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("JAN");
		List<WebElement>countofmonth=monthdetails.getOptions();
		System.out.println("total no of days:" +countofmonth.size());
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2004");
		
		
	}

}
