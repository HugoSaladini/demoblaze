package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = null;
	LoginPages login;
	//LoginPages login = new LoginPages(driver);
	

	@Given("user abre o browser")
	public void user_abre_o_browser() {
		System.out.println("Passo - abre pagina do site");

		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : " + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.navigate().to("https://www.demoblaze.com/index.html");

	}

	@And("user clica em Login")
	public void user_clica_em_Login() throws InterruptedException {
		
		login = new LoginPages(driver);
		
		System.out.println("Passo - clicar em login");

		driver.findElement(By.id("login2")).click();
		Thread.sleep(2000);

	}

	@When("user preenche campo de username e password")
	public void user_preenche_campo_de_username_e_password() throws InterruptedException {
		System.out.println("Passo - preenche campo de username e senha");
		
		login.enterUsername();
		login.enterPassword();

		//driver.findElement(By.id("loginusername")).sendKeys("saladini");
		//driver.findElement(By.id("loginpassword")).sendKeys("0123");

		Thread.sleep(1500);
	}

	@And("user clica em logar")
	public void user_clica_em_logar() throws InterruptedException {
		System.out.println("Passo - clica no botao de login");
		
		login.clickLogin();
		
		//driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();
		Thread.sleep(1500);

	}

	@Then("valida campo de usuario ativo")
	public void valida_campo_de_usuario_ativo() {
		System.out.println("Passo - elemento esperado encontrado");

		
		login.validLogin();
		
		//driver.getPageSource().contains("Welcome saladini");
		driver.close();
		driver.quit();

	}

}
