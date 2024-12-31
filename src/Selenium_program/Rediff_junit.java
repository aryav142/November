

package Selenium_program;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_junit {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rediffmail.com");
		
	}
	@Test
	public void test()
	{
		String title=driver.getTitle();
		System.out.println(title);
        String expectedtitle="Rediff mail";
		
		if(title.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
		String pageSource = driver.getPageSource();	
		
			if (pageSource.contains("Password"))
					{
				System.out.println("Pass");
				
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






