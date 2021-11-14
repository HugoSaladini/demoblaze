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

public class AddprodutoSteps {
	
	WebDriver driver = null;
	LoginPages login;
	
	@Given("abre a pagina")
	public void abre_a_pagina() throws InterruptedException {
		System.out.println("Passo - Abre a pagina");
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path is : " + projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		Thread.sleep(2000);
	}

	@And("user realiza o login")
	public void user_realiza_o_login() throws InterruptedException {
		System.out.println("Passo - Realiza o login no site");
		
		login = new LoginPages(driver);
		driver.findElement(By.id("login2")).click();
		
		login.efetuaLogin("saladini", "0123");
		Thread.sleep(2000);
	}

	@When("user seleciona o produto")
	public void user_seleciona_o_produto() throws InterruptedException {
		System.out.println("Passo - Seleciona o produto disposnível");
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		Thread.sleep(2000);
		
	}

	@And("user clica em add produto")
	public void user_clica_em_add_produto() throws InterruptedException {
		System.out.println("Passo - Clica em add produto ao carrinho");
		
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);
	}

	@Then("user valida produto popup de produto adicionado")
	public void user_valida_produto_popup_de_produto_adicionado() {
		System.out.println("Passo - Validar mensgagem de produto adicionado ao carrinho");
		
		driver.switchTo().alert().accept();
		
		driver.close();
		driver.quit();
		
	}

}
