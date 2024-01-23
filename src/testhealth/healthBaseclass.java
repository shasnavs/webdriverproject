package testhealth;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class healthBaseclass {
	public static WebDriver driver;
	@BeforeClass
	public void Setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

}
