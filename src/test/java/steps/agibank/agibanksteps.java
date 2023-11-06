package steps.agibank;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pages.AgibankPage;
import runner.RunCucumberTest;

public class agibanksteps extends RunCucumberTest {

    AgibankPage agibankpage = new AgibankPage(driver);

    @Dado("^que estou no site Agibank$")
    public void que_estou_no_site_Agibank() {
        agibankpage.acessarAgibank();
    }

    @Quando("^clico no botao pesquisar$")
    public void clico_no_botao_pesquisar() {
        agibankpage.clickBtn();
    }

    @Entao("^valido campo de pesquisar$")
    public void valido_botao_pesquisar_na_tela() {
        agibankpage.campoPesquisar();
    }

    @E("^valido botao pesquisar$")
    public void validoBotaoPesquisar() {
        agibankpage.validarBtnPesquisar();
    }
}
