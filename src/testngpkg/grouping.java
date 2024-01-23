package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class grouping {
ChromeDriver driver;
	
	@BeforeTest(alwaysRun = true)
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod(alwaysRun = true)
	public void urlloading()
	{
		System.out.println("url details");
	}

	@Test(priority = 2,groups = {"smoke","sanity"})
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test(priority = 1,groups = {"sanity"})
	public void test2()
	{
		
		System.out.println("test2");
	}
	@Test(priority = 3,groups = {"regression"})
	public void test3()
	{
		System.out.println("test3");
	}
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method details");
	}
	
	@AfterTest
	public void teardowm()
	{
		System.out.println("browser quit");
	}
}


