package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blazedemo_inspect {
ChromeDriver driver;
@Before
 public void setup()
 {
	driver=new ChromeDriver();
	driver.get("https://blazedemo.com/register");
 }
 
   @Test
   public void test()
   {
	   driver.findElement(By.id("name")).sendKeys("ABC");
	   driver.findElement(By.id("company")).sendKeys("Demo");
	   driver.findElement(By.id("email")).sendKeys("asd@hgf");
	   driver.findElement(By.id("password")).sendKeys("asdf@12");
	   driver.findElement(By.id("password-confirm")).sendKeys("asd@12");
   }
}
