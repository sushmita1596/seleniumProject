package Pages;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	public LoginPage() throws FileNotFoundException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="u_0_b")
	WebElement login1;
	
	public void login(String em,String pas) throws InterruptedException
	{
		email.sendKeys(em);
		password.sendKeys(pas);
		
	
		login1.click();
		synchronized (driver)
		{
		    driver.wait(2000);
		}
		driver.navigate().back();
	email.clear();

		//driver.navigate().back();
	}
	

}
