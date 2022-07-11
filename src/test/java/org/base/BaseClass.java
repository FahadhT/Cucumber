package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;

	public static void launchBrowser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void loadUrl(String url) {

		driver.get(url);

	}

	public static void maxBrowser() {
		driver.manage().window().maximize();

	}

	public static void pageTitle() {
		String title = driver.getTitle();
		System.out.println(title);

	}

	public static void pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void fill(WebElement element, String UserText) {
		element.sendKeys(UserText);

	}

	public static void btnClick(WebElement element) {
		element.click();

	}

	public static void toGetText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}

	public static void toQuit() {
		driver.quit();

	}

	public static void toGetAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);

	}

	public static void toPerformMovetoElement(WebElement element) {
		a = new Actions(driver);
		a.moveToElement(element).perform();

	}

	public static void toPerformDragAndDrop(WebElement src, WebElement dest) {
		a.dragAndDrop(src, dest).perform();

	}

	public static void toPerformElement() throws AWTException {
		r = new Robot();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void toPerformTab() {

		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
	}

}
