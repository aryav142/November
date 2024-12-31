package Selenium_program;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentRishiherbalautoss {
	ChromeDriver driver;
	String baseurl="https://rishiherbalindia.linker.store/";
	@Before
	public void set()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();

	}
	@Test
	public void automation() throws InterruptedException, IOException
	{
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[4]/a")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/input")).sendKeys("tester142107@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[2]/input")).sendKeys("Abcd@123");
	  driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
	  driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"register-model-signin-link\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Abcd@123");
	  driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro Growth Booster");
	  driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i")).click();//search click
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[17]/div/div/div[2]/h4/a")).click();//selected
	  driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();//wishlist
	  driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/div[2]/ul/li[4]/a")).click();//skin
	 // driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();//fairness cream wishisted
	  driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img")).click();//cream
	  driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]")).click();
	 
	  driver.findElement(By.xpath("/html/body/div/nav/div/div/div/div[1]/ul/li[1]/a")).click();//all
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();//health
	  driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();//safety
	
	  // Scroll to the bottom of the page
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

      // Wait for the "About Us" link to be visible
      Thread.sleep(2000); // Use explicit waits in a real-world scenario

      // Locate and click the "About Us" link
      WebElement aboutUsLink = driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a"));
      aboutUsLink.click();
      WebElement dayelement=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File src1=dayelement.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1,  new File("./screenshotassign//privacypolicyss.png"));
		//responsecode
		URL ob=new URL(baseurl);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		int responsecode=con.getResponseCode();
		System.out.println(responsecode);
		con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("valid");
				
			}
			else
			{
				System.out.println("invalid");
			}
	  
	}
}
