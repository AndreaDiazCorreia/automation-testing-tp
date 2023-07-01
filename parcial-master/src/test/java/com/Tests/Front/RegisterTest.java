package com.Tests.Front;

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

public class RegisterTest {
    WebDriver driver;
    Register register;
    public ExtentReports report;
    public ExtentTest test;

    @BeforeEach

    public void setUp () throws InterruptedException {
        register = new Register(driver);
        driver = register.chromeDriverConnection();
        register.link("https://parabank.parasoft.com/parabank/index.htm");
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
    @Tag("Process of registry")
    public void test01 () throws InterruptedException {
        test = report.startTest("Registro correcto");
        test.log(LogStatus.INFO, "Se inicia test");
        register.register();
        test.log(LogStatus.PASS, "Test finalizado correctamente");
    }

}
