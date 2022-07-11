package org.stepDefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.ForgottenPassPojo;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition extends BaseClass {
	
	@Given("User have to enter facebook application through chrome browser")
	public void user_have_to_enter_facebook_application_through_chrome_browser() {
		
	    loadUrl("https://en-gb.facebook.com/");
	    
	   	}
	@Given("User have to click the forgotten password")
	public void user_have_to_click_the_forgotten_password() throws InterruptedException {
	   
		ForgottenPassPojo f=new ForgottenPassPojo();
		
		btnClick(f.getForgottenpass());
		
		Thread.sleep(3000);
		
		
	}

	@When("User have to enter emailid or phone number")
	public void user_have_to_enter_emailid_or_phone_number() {
		
		ForgottenPassPojo f=new ForgottenPassPojo();
		
		fill(f.getTxtSerchBox(),"987654780");
	   
	}

	@Then("User have to click search button")
	public void user_have_to_click_search_button() {
		
		ForgottenPassPojo f=new ForgottenPassPojo();
		
		btnClick(f.getBtnSearch());
	    
	}



	@When("User have to enter invalid username and valid password")
	public void user_have_to_enter_invalid_username_and_valid_password(io.cucumber.datatable.DataTable d) {
		
		List<String> li = d.asList();
		String email = li.get(2);
		String pass = li.get(1);
		
		
		LoginPojo l=new LoginPojo();
		
		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), pass);
	}
	@When("User have to enter invalid username and invalid password")
	public void user_have_to_enter_invalid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		
		List<List<String>> allData = d.asLists();
		String email = allData.get(1).get(1);
	    String pass = allData.get(0).get(2);
	    
		LoginPojo l=new LoginPojo();
		
		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), pass);
	}

	@When("User have to enter username and valid password")
	public void user_have_to_enter_username_and_valid_password(io.cucumber.datatable.DataTable d) {
		
		Map<String, String> asMap = d.asMap(String.class, String.class);
		String email = asMap.get("email");
		String pass = asMap.get("password");
	    
        LoginPojo l=new LoginPojo();
		
		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(), pass);
	}

	@When("User have to enter valid username and invalid password")
	public void user_have_to_enter_valid_username_and_invalid_password(io.cucumber.datatable.DataTable d) {
		
		List<Map<String,String>> asMaps = d.asMaps();
		String email = asMaps.get(1).get("email");
		String pass = asMaps.get(0).get("password");
	   
		LoginPojo l=new LoginPojo();
		
		fill(l.getTxtEmail(), email);
		fill(l.getTxtPass(),pass);
	}

	@When("User have to enter {string} and {string}")
	public void user_have_to_enter_and(String email, String pass) {
		
        LoginPojo l=new LoginPojo();
		
		fill(l.getTxtEmail(),email);
		fill(l.getTxtPass(),pass);
	}

	@When("User have to click login button")
	public void user_have_to_click_login_button() throws InterruptedException {
		
		LoginPojo l=new LoginPojo();
		
		btnClick(l.getBtnLogin());
		
		Thread.sleep(3000);
	}

	@Then("User should be in a invalid credential page")
	public void user_should_be_in_a_invalid_credential_page() {
	    
		String url = driver.getCurrentUrl();
	    
		Assert.assertTrue("To check the url of the webpage", url.contains("https://en-gb.facebook.com/"));
		
	}

}
