package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsOverview extends BasePage {

    By AccountOverview = By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a");
    By resultado = By.xpath("//*[@id=\"accountTable\"]/tfoot/tr/td");

    public AccountsOverview(WebDriver driver) { super();}

    public void AccountsOverview () throws InterruptedException {
        keyDown(AccountOverview);
        Thread.sleep(2000);
        compare(resultado, "Balance includes deposits that may be subject to holds");

    }

}
