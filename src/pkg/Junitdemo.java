package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
	ChromeDriver driver;
	
	
//annotations
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleVerification()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	
	@Test
	public void contentVerification()
	{
		String src=driver.getPageSource();
		
		if(src.contains("Gmail"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}
	@After
	public void tearDown()
	
	{
		driver.quit();
	}

}
