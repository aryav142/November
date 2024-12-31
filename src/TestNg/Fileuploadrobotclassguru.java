package TestNg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobotclassguru {
	WebDriver driver;
	 @BeforeTest
	  public void set() {
		 driver=new ChromeDriver();
	  }

	
	  @BeforeMethod
	  public void urlloading() {
		  driver.get("https://demo.guru99.com/test/upload/");
			driver.manage().window().maximize();

	  }
	  @Test
	  public void test1() throws AWTException {
		 
		driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).click();
		fileUpload("C:\\Users\\Arya Venugopal\\OneDrive\\Documents\\newRESUME\\Arya_Resume.pdf");
		driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
}
	

	public void fileUpload(String r) throws AWTException {
 //to copy path to clipboard
		StringSelection strSelection=new StringSelection(r);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		//to paste into systemwindow
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}


}
