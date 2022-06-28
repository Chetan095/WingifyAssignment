package test;



import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
	@Test(priority=2)
	public void verifyamount()
	{
	
		hp.clickonAmount();
		
	}

}
