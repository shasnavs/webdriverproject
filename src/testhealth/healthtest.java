package testhealth;

import org.testng.annotations.Test;

import pagehealth.healthpagee;

public class healthtest extends healthBaseclass
{
	@Test
	public void testing()
	{
		healthpagee ob=new healthpagee(driver);
		ob.healthclick();
		ob.sortby();
		ob.productdetails();
		ob.enquiryy();
		ob.send();
	}

}
