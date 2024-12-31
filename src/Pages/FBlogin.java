package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBlogin {
	WebDriver driver;//null
	@FindBy(id="email") WebElement fbemail;
	@FindBy(id="pass")
	WebElement fbpassword;
	@FindBy(name="login")
	WebElement Fblogin;
	public FBlogin(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	public void setvalues(String email, String password)
	{
	//	driver.navigate().refresh();
		fbemail.sendKeys(email);
		fbpassword.sendKeys(password);
	}
	public void login()
	{
		Fblogin.click();
	}
	

}
