package pkg;


import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class pageScreenshot {
	
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/HP/Documents/webpage.html");
	}
	@Test
	public void test() throws IOException
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("C:\\Users\\HP\\Documents\\screenshot1.png"));
		
		WebElement button=driver.findElement(By.xpath("//input[@value='Display alert box']"));
		File s2=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s2, new File("./Screenshot/displaybutton.png"));
	}

}