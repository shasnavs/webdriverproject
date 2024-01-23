package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class TestngDemo {
	ChromeDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://automationexercise.com/login");
	}

	@Test(priority = 2,invocationCount = 3)
	public void titleVerification()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority = 1,enabled = false)
	public void linkcount()
	{
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+linkdetails.size());
	}
	@Test(priority = 3)
	public void signUp()
	{
		driver.findElement(By.xpath("//*[@data-qa='signup-name']")).sendKeys("shasna");
		driver.findElement(By.xpath("//*[@data-qa='signup-email']")).sendKeys("shasna988@gmail.com");
		driver.findElement(By.xpath("//*[@data-qa='signup-button']")).click();
	}
	
	@AfterTest
	public void teardowm()
	{
		driver.quit();
	}
}



//enabled false -to not to execute that test
//invocationCount -to run multiple times
//dependsOnMethods -followed by any other test