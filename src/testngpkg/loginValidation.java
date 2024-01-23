package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginValidation {
	ChromeDriver driver;
	@BeforeTest
	public void SetUp()
	{
		driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}
	@Test
	public void loginvalidation()
	{
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(" student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		String currURL=driver.getCurrentUrl();
		String expURL="https://practicetestautomation.com/logged-in-successfully/";
		//if(expURL.equalsIgnoreCase(currURL))
		//{
		//	System.out.println("pass");
		//}
		//else
		//{
		//	System.out.println("fail");
		//}
		Assert.assertEquals(currURL, expURL);
		
		System.out.println("hello");
	}
}