package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationExercise {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://automationexercise.com/login");
	}
	
	@Test
	public void titleVerification() 
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void linkCount()
	{
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+linkdetails.size());
	
		driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("shasna");
		driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("shasna988@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();

		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("shasna123");
		
		WebElement day=driver.findElement(By.xpath("//*[contains(@name,'days')]"));
		Select daydetails= new Select(day);
		daydetails.selectByValue("2");
		
		WebElement month=driver.findElement(By.xpath("//*[contains(@name,'months')]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByVisibleText("April");
		
		WebElement year=driver.findElement(By.xpath("//*[contains(@name,'years')]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2002");
		
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("shasna");
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("vs");
		driver.findElement(By.xpath("//*[@name='company']")).sendKeys("Luminar technolab");
		driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("valiyaveetil (H),deshabhimani road ,masjid lane,kaloor");
		driver.findElement(By.xpath("//*[@name='address2']")).sendKeys("valiyaveetil (H),deshabhimani road ,masjid lane,kaloor,karukapilly");
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys("kerala");
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys("Ernakulam");
		driver.findElement(By.xpath("//*[@name='zipcode']")).sendKeys("682017");
		driver.findElement(By.xpath("//*[@name='mobile_number']")).sendKeys("9856235410");
		driver.findElement(By.xpath("//*[@data-qa='create-account']")).click();

	}
}
