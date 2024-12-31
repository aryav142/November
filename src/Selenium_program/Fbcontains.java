package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbcontains {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ABc");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("SAS");
		driver.findElement(By.xpath("//*[contains(@id,'u_0_5')]")).click();
		
		
	}

}
