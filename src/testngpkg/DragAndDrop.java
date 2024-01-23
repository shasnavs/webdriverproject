package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	
	ChromeDriver driver;
	@BeforeTest 
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	
	@Test
	public void test() throws InterruptedException
	{
		Actions act=new Actions(driver);
		WebElement amountsource=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement amountdestination=driver.findElement(By.xpath("//*[@id=\"amt7\"]"));
		act.dragAndDrop(amountsource, amountdestination);
		Thread.sleep(3000);
		
		WebElement accountsource=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement accountdestination=driver.findElement(By.xpath("//*[@id=\"bank\"]"));
		act.dragAndDrop(accountsource, accountdestination);
		Thread.sleep(3000);
		act.perform();
	}
}
