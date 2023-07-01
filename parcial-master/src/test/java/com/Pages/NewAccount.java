package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccount extends BasePage {

    By buttonNewAccount = By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a");
    By typeOfAccount = By.xpath("//*[@id=\"type\"]");
    By savings = By.xpath("//*[@id=\"type\"]/option[2]");
    By newAccount = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input");
    By result = By.xpath("//*[@id=\"rightPanel\"]/div/div/p[1]");

    public NewAccount(WebDriver driver) { super();}

    public void NewAccount () throws InterruptedException {
        keyDown(buttonNewAccount);
        Thread.sleep(2000);
        keyDown(typeOfAccount);
        Thread.sleep(2000);
        keyDown(savings);
        Thread.sleep(2000);
        keyDown(newAccount);
        Thread.sleep(2000);
        compare(result, "Congratulations, your account is now open");

    }
}
