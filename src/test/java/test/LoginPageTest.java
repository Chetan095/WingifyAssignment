package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
	@Test(priority=1)
	public void verifylogin() 
	{
		driver.get(baseurl);
	    lp.setUsername(username);
	    lp.setPassword(password);
		lp.clickonrememberme();
		lp.clickonlogin();
		
		if(driver.getTitle().equals("Demo App"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		
	}
	
	

}
