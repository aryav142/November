package Selenium_program;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifytitledrasiocheckboxRediff {
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
		//String title=driver.getTitle();
		
		 WebElement title=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img"));
			
			if(title.isDisplayed())
			{
				System.out.println("pass");
			}
			else 
			{
				System.out.println("fail");
			}
			 WebElement radio1=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
			 WebElement radio2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
			 
			 if(radio1.isSelected()||radio2.isSelected())
			 {
					System.out.println("pass");
				}
				else 
				{
					System.out.println("fail");
				}
			 WebElement check=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input"));
			 if(check.isSelected())
			 {
					System.out.println("pass");
				}
				else 
				{
					System.out.println("fail");
				}}

}
