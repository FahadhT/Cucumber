package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgottenPassPojo extends BaseClass {
	
	public ForgottenPassPojo() {
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//a[text()='Forgotten password']")
	private WebElement forgottenpass;
	
	@FindBy(xpath="//input[@placeholder=\"Email address or mobile number\"]")
	private WebElement txtSerchBox;
	
	@FindBy(xpath="//button[text()='Search']")
	private WebElement btnSearch;

	public WebElement getForgottenpass() {
		return forgottenpass;
	}

	public WebElement getTxtSerchBox() {
		return txtSerchBox;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
	
	
	
	
	
	
	

}
