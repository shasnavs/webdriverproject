package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.ebay.com");
		String actualtitle=driver.getTitle();
		String exp="Ebay.com";
		if(exp.equals(actualtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		driver.findElement(By.xpath("//button[@id='gh-shop-a']")).click();
		driver.findElement(By.xpath("//*[@id='gh-sbc']/tbody/tr/td[1]/ul[1]/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@class='b-img']")).click();
		driver.findElement(By.xpath("//*[@class='gh-cart-icon']")).click();
		driver.findElement(By.xpath("//*[@class='fake-btn action start-shop fake-btn--secondary fake-btn--fluid']")).click();
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("books",Keys.ENTER);

	}
		@After
		public void tearDown()
		{
			driver.quit();
		}
	}


