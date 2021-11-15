package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CadastrarUsuarioPages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastrarUsuarioSteps {
	
	WebDriver driver = null;
	CadastrarUsuarioPages cadastrar;
	
	
	@Given("abre a pagina inicial")
	public void abre_a_pagina_inicial() {
	    System.out.println("Passo - abre home page");
	    
	    String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : " + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.navigate().to("https://www.demoblaze.com/index.html");
	}

	@And("clica em signup")
	public void clica_em_signup() throws InterruptedException {
		
		cadastrar = new CadastrarUsuarioPages(driver);
		
		System.out.println("Passo - clica em Cadastrar");
		
		driver.findElement(By.id("signin2")).click();
		Thread.sleep(2000);
		
	}

	@When("coloca username")
	public void coloca_username() {
		System.out.println("Passo - prenche campo username");
		
		cadastrar.enterUsername();
	}

	@And("coloca password")
	public void coloca_password() throws InterruptedException {
		System.out.println("Passo - preenche campo password");
		
		cadastrar.enterPassword();
		Thread.sleep(2000);
	}

	@When("clica no botao cadastrar")
	public void clica_no_botao_cadastrar() throws InterruptedException {
		System.out.println("Passo - clica em botao cadastrar");
		
		cadastrar.clickLogin();
		Thread.sleep(2000);
	}

	@Then("valida popup")
	public void valida_popup() {
		System.out.println("Passo - valida mengagem do popup");
		
		driver.switchTo().alert().accept();
		
		driver.close();
		driver.quit();
	}

	
}
