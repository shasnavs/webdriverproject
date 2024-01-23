package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class guru99FileUploading {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}

	
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\HP\\Documents\\amazon.pdf");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		WebElement button=driver.findElement(By.xpath("//*[@id=\"submitbutton\"]"));
		button.click();
		String title=button.getText();
		System.out.println("title:" +title);
		if(title.equals("Submit File"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
}
