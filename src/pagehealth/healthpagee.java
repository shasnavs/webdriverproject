package pagehealth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class healthpagee {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"menu\"]/ul/li[2]/a")
	WebElement healthoption;
	@FindBy(xpath = "//*[@id=\"input-sort\"]")
	WebElement sortoption;
	@FindBy(xpath = "//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span")
	WebElement product;
	@FindBy(xpath = "//*[@id=\"Enquiry\"]")
	WebElement enquiry;
	@FindBy(xpath = "//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button")
	WebElement sendbutton;
	
	public healthpagee(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void healthclick()
	{
		healthoption.click();
	}
	public void sortby()
	{
		Select ob=new Select(sortoption);
		ob.selectByVisibleText("A-Z alphabetical order"); 
	}
	public void productdetails()
	{
		product.click();
	}
	public void enquiryy()
	{
		enquiry.sendKeys("good product");
	}
	public void send()
	{
		sendbutton.click();
	}

}
