package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
	ChromeDriver driver;
	
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test() 
	{
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//*[@id='nav-tools']/a[4]/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		driver.findElement(By.xpath("//*[@class='a-checkbox a-checkbox-fancy aok-float-left apb-browse-refinements-checkbox']/label/i")).click();
		driver.findElement(By.xpath("//*[@id='nav-tools']/a[1]/span")).click();
		driver.findElement(By.xpath("//*[@class='a-icon a-icon-radio']")).click();
		driver.findElement(By.xpath("//*[@class='a-button-input']")).click();
	
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
