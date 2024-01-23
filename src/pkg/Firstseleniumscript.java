package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstseleniumscript {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver(); //to launch browser
		driver.get("https://www.facebook.com");
		String actualtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		driver.get("https://www.instagram.com");
		String expectedtitle="instagram";
		
		if (expectedtitle.equals(actualtitle))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		driver.quit();
	}

}
