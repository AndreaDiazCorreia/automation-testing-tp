package com.Tests.Front;

import com.Pages.AccountsOverview;
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

public class AccountsOverviewTest {
    WebDriver driver;
    Register register;
    AccountsOverview accountsOverview;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeEach

    public void setUp () throws InterruptedException {
        accountsOverview = new AccountsOverview(driver);
        driver = accountsOverview.chromeDriverConnection();
        accountsOverview.link("https://parabank.parasoft.com/parabank/index.htm");
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
    @Tag("EjecucionRegresion")
    public void test01 () throws InterruptedException {
        test = report.startTest("Resumen de cuentas");
        test.log(LogStatus.INFO, "Se inicia test");
        accountsOverview.AccountsOverview();
        test.log(LogStatus.PASS, "Test finalizado correctamente");
    }

}
