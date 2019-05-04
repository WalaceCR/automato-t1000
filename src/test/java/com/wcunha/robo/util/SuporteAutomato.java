package com.wcunha.robo.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class SuporteAutomato {

    WebDriver driver;

    public void setarChrome(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return this.driver;
    }

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

    public void fecharChrome() {
        this.driver.close();
    }

}
