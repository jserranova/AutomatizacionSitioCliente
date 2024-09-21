package test;

import driverClass.DriverSetup;
import globalVariables.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.home.HomePage;
import pageObject.login.LoginPage;
import pageObject.recoverPassword.RecoverPassword;

public class TestQA {


    WebDriver driver = DriverSetup.setupFirefoxDriver();
    private LoginPage loginPage;
    private RecoverPassword recoverPassword;
    private HomePage homePage;

    @BeforeClass
    public void object(){
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        recoverPassword = PageFactory.initElements(driver, RecoverPassword.class);
        homePage = PageFactory.initElements(driver, HomePage.class);

    }

    @Test(priority = 1)
    public void recoverPassword() throws InterruptedException {
        recoverPassword.codeEmail(GlobalVariables.USER_VI);
        recoverPassword.codeSMS(GlobalVariables.USER_VI);
    }

    @Test(priority = 2)
    public void loginUser() throws InterruptedException {
        loginPage.login();
    }

    @Test(priority = 3)
    public void pageHome() throws InterruptedException {
      homePage.home();
      homePage.chatGlia();
    }

    @AfterTest
    public void close(){
        driver.quit();
    }

}
