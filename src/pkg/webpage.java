package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage {
	
	ChromeDriver driver;
	
	@Before
	public void Setup()
{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/webpage.html");
}
	@Test
	public void test() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@value='Display alert box']")).click();
		Alert a=driver.switchTo().alert();  //to handle alert
		String alerttext=a.getText();
		a.accept();          //foe accepting the alert 
		System.out.println("alert text=" +alerttext);
		//a.dismiss() -for cancel alert
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abs");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("68j");
		Thread.sleep(3000);
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
}
