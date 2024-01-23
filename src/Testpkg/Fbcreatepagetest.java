package Testpkg;

import org.testng.annotations.Test;

import pagepkg.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass {
	
	@Test
	public void test()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.createpageclick();
		ob.textverificatin();
		ob.getstartbutton();
	}
	

}
