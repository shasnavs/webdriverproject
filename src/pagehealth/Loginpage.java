package pagehealth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/a/span")
	WebElement myaccount;
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a")
	WebElement loginoption;
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/div[1]/input")
	WebElement email;
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/div[2]/input")
	WebElement pswd;
	@FindBy(xpath = "//*[@id=\"cont-login-with-email\"]/form/button[1]")
	WebElement loginbutton;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void myaccountclick() 
	{
		myaccount.click();
	}
	public void loginclick()
	{
		loginoption.click();
	}
	public void setvalues(String emailid,String pswrd)
	{
		email.sendKeys(emailid);
		pswd.sendKeys(pswrd);
	}
	public void login()
	{
		loginbutton.click();
	}
}