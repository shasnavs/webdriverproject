package testhealth;

import org.testng.annotations.Test;

import pagehealth.Loginpage;

public class Logintest extends healthBaseclass{
	
	@Test
	public void testlogin()
	{
		 Loginpage ob=new Loginpage(driver);
		 ob.myaccountclick();
		 ob.loginclick();
		 ob.setvalues("shasnavs17@gmail.com", "MInicooper123");
		 ob.login();
	}

}
