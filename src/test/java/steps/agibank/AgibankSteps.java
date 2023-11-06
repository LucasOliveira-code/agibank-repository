package steps.agibank;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pages.AgibankPage;
import runner.RunCucumberTest;

public class AgibankSteps extends RunCucumberTest {

    AgibankPage agibankpage = new AgibankPage(driver);

    @Dado("^que estou no site Agibank$")
    public void que_estou_no_site_Agibank() {
        agibankpage.acessarAgibank();
    }

    @Quando("clico na lupa de pesquisa")
    public void clicoNaLupaDePesquisa() {
        agibankpage.clickLupa();
    }

    @E("digito no campo de busca {string}")
    public void digitoNoCampoDeBusca(String texto) {
        agibankpage.digitarCampoBusca(texto);
    }

    @E("clico no botao pesquisar")
    public void clicoNoBotaoPesquisar() {
        agibankpage.clickBtnPesquisar();
    }

    @Entao("deve aparecer o blog {string}")
    public void deveAparecerOBlog(String texto) {
        agibankpage.validarBusca(texto);
    }

    @Entao("deve aparecer a mensagem {string}")
    public void deveAparecerAMensagem(String texto) {
        agibankpage.validarMensagem(texto);
    }
}
