package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

/**
 * Classe que contem os metodos de interação com o navegador
 *
 * @Author <a href="mailto:lucas.oliver_85@hotmail.com">Lucas Oliveira</a>
 */

public class Utils extends RunCucumberTest {

    private static final WebDriverWait wait = new WebDriverWait(driver, 30);

    /**
     * Limpa o seletor.
     *
     * @Author <a href="mailto:lucas.oliver_85@hotmail.com">Lucas Oliveira</a>
     */
    protected static void limpar(By seletor) {
        wait.until(ExpectedConditions.elementToBeClickable(seletor)).clear();
    }

    /**
     * Clica no elemento indicado.
     *
     * @Author <a href="mailto:lucas.oliver_85@hotmail.com">Lucas Oliveira</a>
     */
    protected static void clicar (By seletor) {
        wait.until(ExpectedConditions.elementToBeClickable(seletor)).click();
    }

    /**
     * Digita o valor informado no seletor indicado.
     *
     * @Author <a href="mailto:lucas.oliver_85@hotmail.com">Lucas Oliveira</a>
     */
    protected static void digitar (By seletor, String valor) {
        limpar(seletor);
        wait.until(ExpectedConditions.elementToBeClickable(seletor)).sendKeys(valor);
    }

    /**
     * Valida se elemento esta visivel na tela.
     *
     * @Author <a href="mailto:lucas.oliver_85@hotmail.com">Lucas Oliveira</a>
     */
    protected static void validaElementoNatela(By seletor) {
        wait.until(ExpectedConditions.presenceOfElementLocated(seletor));
    }

}
