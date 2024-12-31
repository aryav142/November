package TestNg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoitprogram {
	WebDriver driver;
	 @BeforeTest
	  public void set() {
		 driver=new ChromeDriver();
		 driver.get("https://www.ilovepdf.com/pdf_to_word");
	  }

	
	 
	  @Test
	  public void pdf() throws IOException
	  {
		  driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		  Runtime.getRuntime().exec("C:\\Users\\Arya Venugopal\\OneDrive\\Desktop\\Fileupload.exe");
	  }

}
