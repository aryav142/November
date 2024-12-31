package TestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class PatientManagementTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to the WebDriver executable
     //   System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize ChromeDriver
        driver = new ChromeDriver();
       // driver.get("file:///path/to/your/html/file.html"); // Point this to your local HTML file
        driver.get("C:\\Users\\Arya Venugopal\\OneDrive\\Desktop\\alertpage\\patient.html");
    }

    // Test for valid patient record creation
    @Test
    public void testValidPatientRecordCreation() {
        driver.findElement(By.id("name")).sendKeys("John Doe");
        driver.findElement(By.id("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.id("age")).sendKeys("30");
        driver.findElement(By.id("appointment-date")).sendKeys("2024-12-20");
        driver.findElement(By.id("doctor")).sendKeys("Dr. Smith");

        driver.findElement(By.xpath("//button[text()='Create Record']")).click();

        // Wait for the record to be added
        waitForPageLoad();

        // Verify that the patient was added to the table
        List<WebElement> rows = driver.findElements(By.cssSelector("table tbody tr"));
        Assert.assertTrue(rows.size() > 0, "No records were added to the table");
        Assert.assertTrue(rows.get(rows.size() - 1).getText().contains("John Doe"));
    }

    // Test for missing required fields
    @Test
    public void testMissingPatientFields() {
        driver.findElement(By.id("name")).sendKeys("");
        driver.findElement(By.id("email")).sendKeys("");
        driver.findElement(By.id("age")).sendKeys("");
        driver.findElement(By.id("appointment-date")).sendKeys("");

        driver.findElement(By.xpath("//button[text()='Create Record']")).click();

        // Wait for the error messages
        waitForPageLoad();

        // Verify that error messages are shown
        String nameError = driver.findElement(By.id("name")).getAttribute("validationMessage");
        String emailError = driver.findElement(By.id("email")).getAttribute("validationMessage");
        String ageError = driver.findElement(By.id("age")).getAttribute("validationMessage");
        String dateError = driver.findElement(By.id("appointment-date")).getAttribute("validationMessage");

        Assert.assertTrue(nameError.contains("Please fill out this field"));
        Assert.assertTrue(emailError.contains("Please fill out this field"));
        Assert.assertTrue(ageError.contains("Please fill out this field"));
        Assert.assertTrue(dateError.contains("Please fill out this field"));
    }

    // Test for invalid email format
    @Test
    public void testInvalidEmailFormat() {
        driver.findElement(By.id("name")).sendKeys("Jane Doe");
        driver.findElement(By.id("email")).sendKeys("invalid-email");
        driver.findElement(By.id("age")).sendKeys("25");
        driver.findElement(By.id("appointment-date")).sendKeys("2024-12-20");
        driver.findElement(By.id("doctor")).sendKeys("Dr. Johnson");

        driver.findElement(By.xpath("//button[text()='Create Record']")).click();

        // Wait for the error message
        waitForPageLoad();

        // Verify invalid email error message
        String emailError = driver.findElement(By.id("email")).getAttribute("validationMessage");
        Assert.assertTrue(emailError.contains("Please include an '@' in the email address"));
    }

    // Test for valid search by patient name
    @Test
    public void testSearchPatientValid() {
        driver.findElement(By.id("search")).sendKeys("John Doe");
        driver.findElement(By.id("search")).sendKeys(Keys.RETURN);

        // Wait for the search results
        waitForPageLoad();

        // Verify the search result
        List<WebElement> rows = driver.findElements(By.cssSelector("table tbody tr"));
        Assert.assertTrue(rows.size() > 0, "No results found for valid search");
        Assert.assertTrue(rows.get(0).getText().contains("John Doe"));
    }

    // Test for invalid search (nonexistent patient)
    @Test
    public void testSearchPatientInvalid() {
        driver.findElement(By.id("search")).sendKeys("Nonexistent Patient");
        driver.findElement(By.id("search")).sendKeys(Keys.RETURN);

        // Wait for the search results
        waitForPageLoad();

        // Verify no results found
        List<WebElement> rows = driver.findElements(By.cssSelector("table tbody tr"));
        Assert.assertEquals(rows.size(), 0, "Results found for nonexistent search");
    }

    // Test for pagination behavior
    @Test
    public void testPagination() {
        // Create multiple patient records for pagination testing
        for (int i = 0; i < 7; i++) {
            driver.findElement(By.id("name")).sendKeys("Patient " + i);
            driver.findElement(By.id("email")).sendKeys("patient" + i + "@example.com");
            driver.findElement(By.id("age")).sendKeys("30");
            driver.findElement(By.id("appointment-date")).sendKeys("2024-12-20");
            driver.findElement(By.id("doctor")).sendKeys("Dr. Smith");

            driver.findElement(By.xpath("//button[text()='Create Record']")).click();
            waitForPageLoad();
        }

        WebElement nextButton = driver.findElement(By.id("next-page"));
        Assert.assertTrue(nextButton.isEnabled(), "Next button is disabled");
        nextButton.click();

        waitForPageLoad();

        List<WebElement> rows = driver.findElements(By.cssSelector("table tbody tr"));
        Assert.assertTrue(rows.size() > 0, "No records found on the next page");
    }

    // Test for sorting by patient name
    @Test
    public void testSortingByName() {
        driver.findElement(By.xpath("//th[text()='Name']")).click();
        waitForPageLoad();

        // Verify that the names are sorted
        List<WebElement> rows = driver.findElements(By.cssSelector("table tbody tr"));
        String[] names = new String[rows.size()];
        for (int i = 0; i < rows.size(); i++) {
            names[i] = rows.get(i).findElement(By.xpath(".//td[1]")).getText();
        }

        String[] sortedNames = names.clone();
        java.util.Arrays.sort(sortedNames);
        Assert.assertEquals(names, sortedNames, "Names are not sorted correctly");
    }

    // Wait for the page to load after form submissions
    public void waitForPageLoad() {
        try {
            Thread.sleep(1000);  // Simple wait, adjust as needed for real-world tests
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}





