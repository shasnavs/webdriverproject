package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class fbparameterisation {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com/");
	}
	@Parameters({"email","pswd"})
	@Test
	public void signup(String email,String pswd)
	{
		driver.findElement(By.id("//*[@id=\"email\"]")).sendKeys(email);
		driver.findElement(By.id("//*[@id=\"pass\"]")).sendKeys(pswd);
	}
	
	

}
