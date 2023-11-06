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

    public void clickLupa() {
        clicar(By.xpath("//button[@id='search-open']"));
        validaElementoNatela(By.xpath("(//input[@placeholder='Pesquisar …'])[1]"));
    }

    public void digitarCampoBusca(String texto) {
        digitar(By.xpath("(//input[@placeholder='Pesquisar …'])[1]"), texto);
    }

    public void clickBtnPesquisar() {
        validaElementoNatela(By.xpath("(//input[@class='search-submit'])[1]"));
        clicar(By.xpath("(//input[@class='search-submit'])[1]"));
    }

    public void validarBusca(String texto) {
        validaElementoNatela(By.xpath("//a[contains(text(), '" + texto + "')]"));
    }

    public void validarMensagem(String texto) {
        validaElementoNatela(By.xpath("//h1[text()='" + texto + "']"));
    }

}
