package Testpkg;

import org.testng.annotations.Test;

import pagepkg.Fbloginpage;

public class Fblogintest extends Baseclass {


	@Test
	public void testlogin()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setValues("ab@gmail.com", "abcde");
		ob.login();
		
		
	}
}
