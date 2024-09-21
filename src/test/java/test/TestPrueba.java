package test;

import driverClass.DriverSetup;
import globalVariables.GlobalVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.home.HomePage;
import pageObject.login.LoginPage;
import pageObject.product.RentaVitalicia;
import pageObject.product.SeguroPensionado;
import pageObject.recoverPassword.RecoverPassword;
import pageObject.tool.ToolPage;
import pageObject.toolTip.TooltipTemporal;

public class TestPrueba {

    // declara el Webdriver

    WebDriver driver = DriverSetup.setupFirefoxDriver();
    private RecoverPassword recoverPassword;
    private LoginPage loginPage;
    private HomePage homePage;
    private SeguroPensionado seguroPensionado;
    private RentaVitalicia rentaVitalicia;
    private TooltipTemporal tooltipTemporal;
    private ToolPage toolPage;


    @BeforeClass
    public void init() {
        recoverPassword = PageFactory.initElements(driver, RecoverPassword.class);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        seguroPensionado = PageFactory.initElements(driver, SeguroPensionado.class);
        rentaVitalicia = PageFactory.initElements(driver, RentaVitalicia.class);
        tooltipTemporal = PageFactory.initElements(driver, TooltipTemporal.class);
        toolPage = PageFactory.initElements(driver, ToolPage.class);

    }

    @Test(priority = 1)
    public void test1() throws InterruptedException {
        loginPage.loginUsuario(GlobalVariables.USER_VI);
        loginPage.loginPassword(GlobalVariables.PASS_QA);
        loginPage.loginButton();

    }

    @Test(priority = 2)
    private void test2() throws InterruptedException {
        toolPage.prueba();
    }



}


