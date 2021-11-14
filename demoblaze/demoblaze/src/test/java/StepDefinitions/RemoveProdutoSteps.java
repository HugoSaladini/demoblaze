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

public class RemoveProdutoSteps {
	
	WebDriver driver = null;
	LoginPages login;
	
	@Given("abre a home")
	public void abre_a_home() throws InterruptedException {
	    System.out.println("Passo - Entra na home");
	    
	    String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : " + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		Thread.sleep(2000);
		
	}

	@And("user efetua o login")
	public void user_efetua_o_login() throws InterruptedException {
		System.out.println("Passo - efetua o login");
		
		login = new LoginPages(driver);
		driver.findElement(By.id("login2")).click();
		
		login.efetuaLogin("saladini", "0123");
		Thread.sleep(2000);
		
	}

	@When("user entra na pagina do carrinho")
	public void user_entra_na_pagina_do_carrinho() throws InterruptedException {
		System.out.println("Passo - Entra na pagina do carrinho");
		
		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		Thread.sleep(2000);
	}

	@Then("user clica em delete produto")
	public void user_clica_em_delete_produto() {
		System.out.println("Passo - Seleciona deletar produto");
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")).click();
		
		driver.close();
		driver.quit();
	}

}
