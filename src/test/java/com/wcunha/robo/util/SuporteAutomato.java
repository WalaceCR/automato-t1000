package com.wcunha.robo.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SuporteAutomato {

    private static SuporteAutomato instance = null;
    WebDriver driver;

    /*construtor necessário para utilizar o Singleton*/
    private SuporteAutomato(){

    }

    /*iniciar o ChromeDriver*/
    public void setarChrome(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    /*retorna o chromedriver iniciado*/
    public WebDriver getDriver(){
        return this.driver;
    }

    /*aguardar carregamento da página*/
    public void waitForPageLoad(WebDriver driver) throws Exception {
        try {
            ExpectedCondition<Boolean> pageLoadCondition = new
                    ExpectedCondition<Boolean>() {
                        public Boolean apply(WebDriver driver) {
                            return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                        }
                    };
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(pageLoadCondition);
        } catch (Exception e) {
            throw e;
        }
    }

    /*aguardar o elemento ser clicável*/
    public boolean isClickable(WebElement webe){
        try {

            WebDriverWait wait = new WebDriverWait(this.driver, 10);
            wait.until(ExpectedConditions.elementToBeClickable(webe));
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    /*Fecho o chrome no final de todos os testes*/
    public void fecharChrome() {
        this.driver.close();
    }

    /*Método responsável pela captura da instância da classe
    * para que esta seja chamada apenas uma vez e então em tempo
    * de execução ao invés de criar novas instâncias com new utilizo
    * a mesma instância criada (Singleton)*/
    public static SuporteAutomato getInstance() {
        if (instance == null) {
            instance = new SuporteAutomato();
        }

        return instance;
    }

    /*Maximizar a janela*/
    public void maximizarJanela(){
        this.driver.manage().window().maximize();
    }

    /*Limpar cookies*/
    public void limparCookies(){
        this.driver.manage().deleteAllCookies();
    }

}
