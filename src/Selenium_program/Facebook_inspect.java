package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_inspect {

	
		  ChromeDriver driver;
		  @Before
		  public void setup()
		  {
			  driver =new ChromeDriver();
			  driver.get("https://www.facebook.com");
			  
		  }
		  @Test
		  public void test()
		  {
			  driver.findElement(By.id("email")).sendKeys("abc@gmk");
			  driver.findElement(By.id("pass")).sendKeys("hgvj");
			  driver.findElement(By.name("login")).click();
			  
		  }
}
