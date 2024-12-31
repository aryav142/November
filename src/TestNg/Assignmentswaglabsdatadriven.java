package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assignmentswaglabsdatadriven {
	WebDriver driver;
	 @BeforeTest
	  public void setup() {
		 driver=new ChromeDriver();
	  }

	
	  @BeforeMethod
	  public void urlloading() {
		  driver.get("https://www.saucedemo.com/");
	  }
   @Test
   public void main() throws IOException
   {
   	File f=new File("C:\\Users\\Arya Venugopal\\OneDrive\\Desktop\\apachexl\\saucedemo.xlsx");
   	FileInputStream fi=new FileInputStream(f);
   	XSSFWorkbook wb=new XSSFWorkbook(fi);
   	XSSFSheet sh=wb.getSheet("Sheet1");
   	System.out.println(sh.getLastRowNum());
   	for(int i=1;i<=sh.getLastRowNum();i++)
   	{
   		String username=sh.getRow(i).getCell(0).getStringCellValue();
   		System.out.println("username"+username);
   		String pswd=sh.getRow(i).getCell(0).getStringCellValue();
   		System.out.println(pswd);
   		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).clear();
   		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(username);
   		driver.findElement(By.xpath("//*[@id=\"password\"]")).clear();
   		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(pswd);
   		driver.findElement(By.name("login-button")).click();
   	 String expectedTitle = "Swag Labs";
     String actualTitle = driver.getTitle();
     System.out.println(actualTitle);
     if(expectedTitle.equals(actualTitle))
     {
    	 System.out.println("Login valid");
    	 
     }
     else 
     {
    	 System.out.println("Login invalid");
     }
   		driver.navigate().refresh();
   		
   	}
   	
   }

}
