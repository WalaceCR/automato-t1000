package com.wcunha.robo.steps;

import com.wcunha.robo.pageObjects.PageResearchGoogle;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

public class StepDefintions {

    PageResearchGoogle pagina = new PageResearchGoogle();

    @Dado("^que acessei o Google$")
    public void que_acessei_o_Google() throws Throwable {
        pagina.navegarateapaginadoGoogle();
    }

    @Dado("^que estou na tela de pesquisa$")
    public void que_estou_na_tela_de_pesquisa() throws Throwable {
        Assert.assertTrue(pagina.estouNaTelaDoGoogle());
    }


    @Quando("^digito Luana na pesquisa$")
    public void digito_Luana_na_pesquisa() throws Throwable {
        pagina.pesquisar();
    }

    @Quando("^clico no botão Pesquisar$")
    public void clico_no_botão_Pesquisar() throws Throwable {
        pagina.clicarEmPesquisar();
    }

    @Então("^são exibidos os resultados da busca$")
    public void são_exibidos_os_resultados_da_busca() throws Throwable {
        Assert.assertTrue(pagina.estounateladeresultados());
    }
}
