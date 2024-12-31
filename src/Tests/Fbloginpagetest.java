package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Fbloginpage;

public class Fbloginpagetest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{//ChromeOptions options=new ChromeOptions();
	//options.addArguments("---remote---allow---origins");
	//driver=new ChromeDriver(options);
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
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc");
		ob.login();
		
	}

}
