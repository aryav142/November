package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentchildLocatorRediff {
  ChromeDriver driver;
  @Before
  public void setup()
  {
	  driver=new ChromeDriver();
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
  }
  @Test
  public void test()
  {
	  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Abc");
	//*[@id="tblcrtac"]/tbody/tr[3]/td[3]/input
	  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[1]")).sendKeys("avdsmailbox");
	//*[@id="tblcrtac"]/tbody/tr[7]/td[3]/input[1] by right click code> copy >copyxpath
	  driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[7]/td[3]/input[2]")).click();
	//*[@id="tblcrtac"]/tbody/tr[7]/td[3]/input[2]
	  driver.findElement(By.xpath("//input[@id='newpasswd']")).sendKeys("abc@12345");
	//*[@id="newpasswd"]
	  driver.findElement(By.xpath("//input[@id='newpasswd1']")).sendKeys("abc@12345");
	//*[@id="newpasswd1"]
	  driver.findElement(By.xpath("//div[@id='div_altemail']/table/tbody/tr/td[3]/input")).sendKeys("acb@gmil.com");
	//*[@id="div_altemail"]/table/tbody/tr[1]/td[3]/input
	  driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("35897699444");
	//*[@id="mobno"]
  }
}
