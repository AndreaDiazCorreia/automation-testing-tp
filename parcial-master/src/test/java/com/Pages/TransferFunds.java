package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Base64;

public class TransferFunds extends BasePage {


    By buttonTransferFunds = By.xpath("//*[@id=\"leftPanel\"]/ul/li[3]/a");
    By resultMessage = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");
    By amount = By.xpath("//*[@id=\"amount\"]");
    By fromAccount = By.xpath("//*[@id=\"fromAccountId\"]");
    By account = By.xpath("//*[@id=\"fromAccountId\"]/option[1]");
    By toAccount = By.xpath("//*[@id=\"toAccountId\"]");
    By accountReceptor = By.xpath("//*[@id=\"fromAccountId\"]/option[2]");
    By buttonTransfer = By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div[2]/input");
    By result = By.xpath("//*[@id=\"rightPanel\"]/div/div/h1");

    public TransferFunds(WebDriver driver) { super();}

    public void transferFunds () throws InterruptedException {
        keyDown(buttonTransferFunds);
        Thread.sleep(2000);
        compare(resultMessage, "Transfer Funds");
        writeText("10", amount);
        Thread.sleep(2000);
        keyDown(fromAccount);
        Thread.sleep(2000);
        keyDown(account);
        Thread.sleep(2000);
        keyDown(toAccount);
        Thread.sleep(2000);
        keyDown(accountReceptor);
        Thread.sleep(2000);
        keyDown(buttonTransfer);
        Thread.sleep(2000);
        compare(result, "Transfer Complete!");
    }

}
