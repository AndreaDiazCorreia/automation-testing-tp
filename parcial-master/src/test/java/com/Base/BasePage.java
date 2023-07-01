package com.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasePage {
    protected static WebDriver driver;

    protected WebDriverWait wait;

    public WebDriver chromeDriverConnection() {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\andre\\OneDrive\\Documents\\Cursos\\testing2\\automation-testing-tp\\parcial-master\\src\\test\\resources\\chomedriver\\chromedriver.exe");
        driver = new ChromeDriver(options);
        return driver;
    }

    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public void writeText(String imputText, By locator){
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(imputText);
    }

    public static void keyDown(By locator){
        driver.findElement(locator).click();
    }

    public void link (String url){
        driver.get(url);
    }

    public void key (By locator, String key){
        driver.findElement(locator).sendKeys(Keys.valueOf(key));
    }

    public void getText (By locator){
        String res= driver.findElement(locator).getText();
        System.out.println("Texto : "+ res);
    }

    public void compare (By locator, String text){
        String res = driver.findElement(locator).getText();
        assertTrue(res.contains(text));
    }



}
