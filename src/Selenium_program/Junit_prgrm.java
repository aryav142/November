package Selenium_program;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_prgrm {
	
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void test()
{
	String title=driver.getTitle();
	 String expectedtitle="Facebook";
		System.out.println(title);
		if(title.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
}
@After
public void browserclose()
{
	
	driver.quit();
}
}
