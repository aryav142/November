package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathdemo {
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
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("acs@ghil");
	   driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("ASD@12");
	   driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
