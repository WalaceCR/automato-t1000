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
public class StarterTest {

    static SuporteAutomato sup = SuporteAutomato.getInstance();

    @BeforeClass()
    public static void setUp(){
        sup.setarChrome();

    }

    @AfterClass()
    public static void tearDown(){
        sup.fecharChrome();

    }





}