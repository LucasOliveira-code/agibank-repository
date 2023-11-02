package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AgibankPage {

    WebDriver driver;
    public AgibankPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarAgibank() {
        driver.get("https://blogdoagi.com.br/");
        driver.findElement(By.xpath("//button[@id='search-open']"));
    }
    public void clickBtn() {
        driver.findElement(By.xpath("//button[@id='search-open']")).click();
    }
    public void campoPesquisar() {
        driver.findElement(By.xpath("(//input[@placeholder='Pesquisar …'])[1]"));
    }
    public void validarBtnPesquisar() {
        driver.findElement(By.xpath("(//input[@class='search-submit'])[1]"));
    }
}
