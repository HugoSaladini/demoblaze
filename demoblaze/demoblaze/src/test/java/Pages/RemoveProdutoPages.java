package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemoveProdutoPages {

	WebDriver driver;

	public RemoveProdutoPages(WebDriver driver) {

		this.driver = driver;
	}

	public void entraNoCarrinho() throws InterruptedException {

		driver.findElement(By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a")).click();
		Thread.sleep(2000);

	}

	public void deletaProduto() {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/tr[1]/td[4]/a")).click();

		driver.close();
		driver.quit();

	}

}
