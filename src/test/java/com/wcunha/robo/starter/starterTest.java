package com.wcunha.robo.starter;


import com.wcunha.robo.util.suporteAutomato;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features",
        glue = {"com.wcunha.robo.steps"},
        plugin = { "pretty", "html:target/cucumber-reports" })
public class starterTest {
    static suporteAutomato sup = new suporteAutomato();


}