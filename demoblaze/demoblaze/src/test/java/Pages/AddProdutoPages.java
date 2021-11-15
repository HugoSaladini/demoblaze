package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProdutoPages {

	WebDriver driver;

	public AddProdutoPages(WebDriver driver) {

		this.driver = driver;
	}

	public void selecionaProduto() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/a/img")).click();
		Thread.sleep(2000);

	}

	public void adicionaNoCarrinho() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
		Thread.sleep(2000);

	}

	public void interagePopup() {

		driver.switchTo().alert().accept();

		driver.close();
		driver.quit();

	}

}
