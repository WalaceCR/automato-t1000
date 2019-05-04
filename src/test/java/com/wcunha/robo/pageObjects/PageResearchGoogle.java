package com.wcunha.robo.pageObjects;

import com.wcunha.robo.util.SuporteAutomato;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageResearchGoogle {
    SuporteAutomato suporte = new SuporteAutomato();
    WebElement caixaDePesquisa;
    WebElement botaoDePesquisa;
    WebElement logoDoGoogle;
    WebElement itemdePesquisa;


    public void  navegarateapaginadoGoogle(){
        suporte.setarChrome();
        suporte.getDriver().navigate().to("https://www.google.com.br/");
    }

    public boolean estouNaTelaDoGoogle(){
        logoDoGoogle = suporte.getDriver().findElement(By.id("hplogo"));
        return logoDoGoogle.isDisplayed();
    }

    public void pesquisar(){
        caixaDePesquisa  = suporte.getDriver().findElement(By.name("q"));
        caixaDePesquisa.sendKeys("Luana Steck");
    }

    public void clicarEmPesquisar(){
        botaoDePesquisa = suporte.getDriver().findElement(By.name("btnK"));
        suporte.isClickable(botaoDePesquisa);
        botaoDePesquisa.click();
    }


    public boolean estounateladeresultados(){
        itemdePesquisa = suporte.getDriver().findElement(By.xpath("//*[contains(text(),'Grupo F')]"));
        suporte.isClickable(itemdePesquisa);
        return itemdePesquisa.isDisplayed();
    }



}
