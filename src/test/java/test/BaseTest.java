package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;
import pages.LoginPageClass;

public class BaseTest {
	public String baseurl="https://sakshingp.github.io/assignment/login.html";
	public String username="abc@gmail.com";
	public String password="Abc#123";
	static WebDriver driver;
	LoginPageClass lp;
	HomePage hp;
	@BeforeSuite
	public void initbrowser()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@AfterSuite
	public void teardown()
	{
		
		driver.quit();
	}
	@BeforeClass
	public void objectcreation()
	{
		lp=new LoginPageClass(driver);
		hp=new HomePage(driver);
		
	}

}
