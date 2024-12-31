package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.FBlogin;

public class FBlogintest1 {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.facebook.com/");
	}
   @Test
   public void testlogin()
   {
	 FBlogin ob=new FBlogin(driver);
	 ob.setvalues("acs@gmail.com", "asd");
	 ob.login();
   }
}
