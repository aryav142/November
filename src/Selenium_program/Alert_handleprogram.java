package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handleprogram {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Arya%20Venugopal/OneDrive/Desktop/alertpage/alert.html");
		
	}
	@Test
	public void test()
	{
      driver.findElement(By.xpath("/html/body/input[1]")).click();
      driver.switchTo().alert().accept();
      driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Arunima");
      driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Seva");
}}