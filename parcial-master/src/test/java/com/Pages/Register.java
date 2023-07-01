package com.Pages;

import com.Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register extends BasePage {
    By buttonForRegister = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
    By name = By.name("customer.firstName");
    By lastName = By.name("customer.lastName");
    By direction = By.name("customer.address.street");
    By city = By.name("customer.address.city");
    By state = By.name("customer.address.state");
    By zipCode = By.name("customer.address.zipCode");
    By telephone = By.name("customer.phoneNumber");
    By ssn = By.name("customer.ssn");
    By userName = By.name("customer.username");
    By password = By.name("customer.password");
    By passwordConfirm= By.name("repeatedPassword");
    By buttonRegister = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input") ;
    By result = By.xpath("//*[@id=\"rightPanel\"]/p");


    public Register(WebDriver driver) { super();}

    public void register () throws InterruptedException {
        keyDown(buttonForRegister);
        Thread.sleep(2000);
        writeText("Cathleen", name);
        Thread.sleep(2000);
        writeText("Jefferson", lastName);
        Thread.sleep(2000);
        writeText("P.O. Box 218, 6138 Lacus. St.", direction);
        Thread.sleep(2000);
        writeText("Puno", city);
        Thread.sleep(2000);
        writeText("Puno", state);
        Thread.sleep(2000);
        writeText("18161", zipCode);
        writeText("(284) 253-7583", telephone);
        Thread.sleep(2000);
        writeText("test", ssn);
        Thread.sleep(2000);
        writeText("CathJeff5", userName);
        Thread.sleep(2000);
        writeText("Test123", password);
        Thread.sleep(2000);
        writeText("Test123", passwordConfirm);
        Thread.sleep(2000);
        keyDown(buttonRegister);
        compare(result, "You are now logged in");


    }

}
