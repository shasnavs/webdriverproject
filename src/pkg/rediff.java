package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {
	
	ChromeDriver driver;

	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void logodisplay()
	{
		//driver.findElement(By.xpath("//*[@src='/register/pix/redifflogo1.gif']")).isDisplayed();
		//if(src.contains)
	}

}
