package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.Utils;

public class AgibankPage extends Utils {

    WebDriver driver;
    public AgibankPage(WebDriver driver) {
        this.driver = driver;
    }
    public void acessarAgibank() {
        driver.get("https://blogdoagi.com.br/");
        validaElementoNatela(By.xpath("//button[@id='search-open']"));
    }
    public void clickBtn() {
        clicar(By.xpath("//button[@id='search-open']"));
    }
    public void campoPesquisar() {
        validaElementoNatela(By.xpath("(//input[@placeholder='Pesquisar …'])[1]"));
    }
    public void validarBtnPesquisar() {
        validaElementoNatela(By.xpath("(//input[@class='search-submit'])[1]"));
    }
}
