package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastrarUsuarioPages {

	WebDriver driver;

	By txt_username = By.id("sign-username");
	By txt_password = By.id("sign-password");
	By btn_login = By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]");

	public CadastrarUsuarioPages(WebDriver driver) {

		this.driver = driver;
	}

	public void enterUsername() {

		driver.findElement(txt_username).sendKeys("saladini005");
	}

	public void enterPassword() {

		driver.findElement(txt_password).sendKeys("0123");
	}

	public void clickLogin() {

		driver.findElement(btn_login).click();
	}

	public void validLogin() {

		driver.getPageSource().contains("Welcome saladini005");
	}

}
