package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"reg_pages_msg\"]/a")
	WebElement createpage;
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")
	WebElement getstartbutton;
	
	public Fbcreatepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void createpageclick()
	{
		createpage.click();
	}
	
	public void textverificatin() 
	{
		String exp="Create a page";
		String act=driver.getPageSource(); 
				if(exp.contains(act))
				{
					System.out.println("text is present");
				}
				else
				{
					System.out.println("text not present");
				}
	}
	
	public void getstartbutton()

{
	getstartbutton.click();
}
}