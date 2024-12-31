package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprogram_3 {
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
      Alert a= driver.switchTo().alert();
      String actualtext=a.getText();
      if(actualtext.equals("hello I am an alert box"))
      {
    	  System.out.println("pass");
    	  
      }
      else
      {
    	  System.out.println("fail");
    	  
      }
      a.accept();
      driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Arunima");
      driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("Seva");
      
}
}