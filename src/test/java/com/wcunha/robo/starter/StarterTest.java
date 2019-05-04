package com.wcunha.robo.starter;


import com.wcunha.robo.util.SuporteAutomato;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:Features",
        glue = {"com.wcunha.robo.steps"},
        plugin = { "pretty", "html:target/cucumber-reports" })
public class StarterTest {
    static SuporteAutomato sup = new SuporteAutomato();


}