package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sus@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sus123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
