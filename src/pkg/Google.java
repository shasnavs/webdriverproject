package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize(); //to maximize window
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
		driver.findElement(By.id("input")).sendKeys("books",Keys.ENTER);//direct search 
		
	}
}
