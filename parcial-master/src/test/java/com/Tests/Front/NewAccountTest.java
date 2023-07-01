package com.Tests.Front;

import com.Pages.NewAccount;
import com.Pages.Register;
import com.Reports.Reports;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class NewAccountTest {
    WebDriver driver;
    Register register;
    NewAccount newAccount;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeEach

    public void setUp () throws InterruptedException {
        newAccount = new NewAccount(driver);
        driver = newAccount.chromeDriverConnection();
        newAccount.link("https://parabank.parasoft.com/parabank/index.htm");
        register = new Register(null);
        register.register();
        report = Reports.getIntance();
        Thread.sleep(200);
    }

    @AfterEach
    public void tearDown (){
        report.endTest(test);
        report.flush();
        driver.quit();
    }
    @Test
    @Tag("Nueva cuenta")
    public void test01 () throws InterruptedException {
        test = report.startTest("Nueva cuenta");
        test.log(LogStatus.INFO, "Se inicia test");
        newAccount.NewAccount();
        test.log(LogStatus.PASS, "Test finalizado correctamente");
    }
}
