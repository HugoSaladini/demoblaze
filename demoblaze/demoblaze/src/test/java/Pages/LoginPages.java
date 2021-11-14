package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPages {
	
	WebDriver driver;
	
	By txt_username = By.id("loginusername");
	By txt_password = By.id("loginpassword");
	By btn_login = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
	
	public LoginPages(WebDriver driver) {

		this.driver = driver;
	}

	public void enterUsername() {

		driver.findElement(txt_username).sendKeys("saladini");
	}

	public void enterPassword() {

		driver.findElement(txt_password).sendKeys("0123");
	}

	public void clickLogin() {

		driver.findElement(btn_login).click();
	}

	public void validLogin() {

		driver.getPageSource().contains("Welcome saladini");
	}

	public void efetuaLogin(String username, String password) {

		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}

}
