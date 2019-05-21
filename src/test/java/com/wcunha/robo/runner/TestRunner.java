package com.wcunha.robo.runner;

import com.wcunha.robo.util.SuporteAutomato;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features",
        glue = {"com.wcunha.robo.steps"},
        plugin = { "pretty", "html:target/cucumber-reports" })
public class TestRunner {

    /*capturo apenas a instância da classe SuporteAutomato*/
    static SuporteAutomato sup = SuporteAutomato.getInstance();

    /*antes de todos os testes*/
    @BeforeClass()
    public static void setUp(){
        sup.setarChrome();

    }

    /*depois de todos os testes*/
    @AfterClass()
    public static void tearDown(){
        sup.fecharChrome();

    }

}