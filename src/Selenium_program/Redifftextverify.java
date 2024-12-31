package Selenium_program;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redifftextverify {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void test()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
    	String actualtext=button.getAttribute("value");
    	String expectedtext="Create my account >>";
    	System.out.println(actualtext);
		if(actualtext.equals(expectedtext))
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}

	}

}



