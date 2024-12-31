package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
  ChromeDriver driver;
  @Before
  public void setup()
  {
	  driver =new ChromeDriver();
	  driver.get("https://www.google.com");
	  
  }
  @Test
  public void test()
  {
	  driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	//  driver.findElement(By.name("btnK")).click();
  }
  
}
