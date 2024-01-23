package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Arraylist {
	
	ChromeDriver driver;
	
	@Before
	public void setUp() 
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
		List<WebElement>linkdetails=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+linkdetails.size());
		
		
		
		for(WebElement link:linkdetails)
		{
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
	}

}
