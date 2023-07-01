package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountActivity extends BasePage {

    By buttonselectAccount = By.xpath("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a");
    By resultDetails = By.xpath("//*[@id=\"rightPanel\"]/div/div[1]/h1");
    By buttonActivityPeriod = By.xpath("//*[@id=\"month\"]");
    By buttonType = By.xpath("//*[@id=\"transactionType\"]");
    By buttonGo = By.xpath("//*[@id=\"rightPanel\"]/div/div[2]/form/table/tbody/tr[3]/td[2]/input");

    public AccountActivity(WebDriver driver) { super();}

    public void AccountActivity () throws InterruptedException {
        keyDown(buttonselectAccount);
        Thread.sleep(2000);
        compare(resultDetails,"Account Details");
        Thread.sleep(2000);
        keyDown(buttonActivityPeriod);
        Thread.sleep(2000);
        keyDown(buttonType);
        Thread.sleep(2000);
        keyDown(buttonGo);

    }

}
