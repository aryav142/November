package TestNg;


import java.awt.AWTException;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class uploadrobot {
    WebDriver driver;

    @BeforeTest
    public void setUp() {
      
        driver = new ChromeDriver();
    }

    @BeforeMethod
    public void loadUrl() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demo.guru99.com/test/upload/");
        
        driver.manage().window().maximize();
    }

    @Test
    public void testFileUpload() throws AWTException {
        // Click on the upload button
    	
        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\\\Users\\\\Arya Venugopal\\\\OneDrive\\\\Documents\\\\newRESUME\\\\Arya_Resume.pdf");

        // Upload the file using Robot class
       // fileUpload("C:\\Users\\Arya Venugopal\\OneDrive\\Documents\\newRESUME\\Arya_Resume.pdf");

        // Accept terms and click on the submit button
    	driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
    }

  /* public void fileUpload(String filePath) throws AWTException {
        // Copy the file path to the clipboard
        StringSelection strSelection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);

        // Use Robot class to handle the file chooser
        Robot robot = new Robot();
        robot.delay(3000); // Slight delay to ensure the file chooser opens

        // Paste the file path
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Press Enter to confirm
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

 */
        
    }




