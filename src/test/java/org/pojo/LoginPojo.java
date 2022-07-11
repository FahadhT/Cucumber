package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {

	// 1.Non-parametrized constructor

	public LoginPojo() {
		PageFactory.initElements(driver, this);

	}

	// 2.private webelement
	@CacheLookup
	@FindBys({

			@FindBy(xpath = "//input[@id='email']"), // True
			@FindBy(xpath = "//input[@name='email']")// True

	})

	private WebElement txtEmail;

	@CacheLookup
	@FindAll({ @FindBy(xpath = "//input[@id='pass']"), // True
			@FindBy(xpath = "//input[@name='password']")// False
	})

	private WebElement txtPass;

	@FindBy(name = "login")
	private WebElement btnLogin;

	// 3.Getters to access those webelements outside of the class

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

}
