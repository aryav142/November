package Selenium_program;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonjunit {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
	}
	@Test
	public void test()
	{
		String title=driver.getTitle();
		System.out.println(title);
        String expectedtitle="google";
		
		if(title.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		String pageSource = driver.getPageSource();	
		
			if (pageSource.contains("Cart"))
					{
				System.out.println("Pass");
				
					}
			
			else
			{
				System.out.println("Fail");
			}
		

	}
	@After
	public void browserclose()
	{
		driver.quit();
	}
}
