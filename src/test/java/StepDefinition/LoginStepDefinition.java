package StepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import Base.TestBase;
import Pages.LoginPage;
import Utility.readExcel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition extends TestBase{
	LoginPage pg;
	readExcel rd;
	HashMap<String, String> data= new HashMap<String, String>();
	public LoginStepDefinition() throws FileNotFoundException {
		super();
		Initialization();
		pg=new LoginPage();
		// TODO Auto-generated constructor stub
	}
	
	

	@SuppressWarnings("deprecation")
	@Given("User is on facebook landing page")
	public void user_is_on_facebook_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    String title=driver.getTitle();
	    Assert.assertEquals(title,"Facebook – log in or sign up" );
	}

	@When("user enters username and password and clicks on login")
	public void user_enters_username_and_password_and_clicks_on_login() throws IOException, InterruptedException {
		rd=new readExcel();
		data=rd.readExcel();
		for (Map.Entry<String,String> entry : data.entrySet())  
		{
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue());
           // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            pg.login(entry.getKey(), entry.getValue());
		
		}
		
	    // Write code here that turns the phrase above into concrete actions
	   // String u=
	}
	/*
	 * @Then("Home page is populated") public void home_page_is_populated() { //
	 * Write code here that turns the phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */


	
	

}
