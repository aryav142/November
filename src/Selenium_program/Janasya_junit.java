package Selenium_program;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasya_junit {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://janasya.com");
		
	}
	@Test
	public void test()
	{
		String title=driver.getTitle();
		System.out.println(title);
        String expectedtitle="Janasya";
		
		if(title.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		String pageSource = driver.getPageSource();	
		
			if (pageSource.contains("Most Loved"))
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



