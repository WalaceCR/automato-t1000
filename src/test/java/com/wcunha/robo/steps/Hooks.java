package com.wcunha.robo.steps;
import com.wcunha.robo.util.SuporteAutomato;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks {

    /*capturo apenas a instância da classe SuporteAutomato*/
    SuporteAutomato sup = SuporteAutomato.getInstance();

    /*antes de um cenário*/
    @Before
    public void setUp(){
        sup.maximizarJanela();
    }

    /*depois de um cenário*/
    @After
    public void tearDown(){
        sup.limparCookies();
    }
}
