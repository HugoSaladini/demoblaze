package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("abre o navegador")
	public void abre_o_navegador() {
		System.out.println("Passo - abre o navegador");
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : " + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

	}

	@And("user valida pagina do google")
	public void user_valida_pagina_do_google() {
		System.out.println("Passo - user entra na home do google");

		driver.navigate().to("https://www.google.com");

	}

	@When("user interage na area de texto")
	public void user_interage_na_area_de_texto() {
		System.out.println("Passo - user entra com o texto na area de pesquisa");

		driver.findElement(By.name("q")).sendKeys("keeggo");
	}

	@And("user clica em pesquisar")
	public void user_clica_em_pesquisar() {
		System.out.println("Passo - user clica em pesquisar");

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user navega pelo resultado")
	public void user_navega_pelo_resultado() throws InterruptedException {
		System.out.println("Passo - user navega pelo resultado");

		driver.getPageSource().contains("Keeggo - Keeggo");

		driver.close();
		driver.quit();
	}

}
