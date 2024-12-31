package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprogram4 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
	}
	@Test
	public void test() throws InterruptedException
	{
      driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
       driver.switchTo().alert().accept();
      driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
      driver.switchTo().alert().dismiss();
      driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
      Alert a= driver.switchTo().alert(); 
      a.sendKeys("Abc");
     
      a.accept();
	}}
      
       
