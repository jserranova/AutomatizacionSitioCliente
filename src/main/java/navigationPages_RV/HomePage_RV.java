package navigationPages_RV;

import wrapClass.WrapClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_RV {

    private WebDriver driver;

    // Define constants for wait times
    private static final int SHORT_WAIT = 3000; // 1 second
    private static final int LONG_WAIT = 10000;  // 5 seconds
    private JavascriptExecutor jsExecutor;

    public HomePage_RV(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    @CacheLookup
    @FindBy(id = "btn-salir")
    private WebElement btnSalir;

    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/app-navbar-welcome[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/button[1]")
    private WebElement miEjecutivo;

    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/app-navbar-welcome[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/button[2]")
    private WebElement misDatos;

    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/app-navbar-welcome[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/button[3]")
    private WebElement contacto;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/app-accordion-card[1]/div[3]/div[1]/div[1]/div[1]/h2[1]/button[1]/div[1]/div[1]/span[1]/span[2]/i[1]")
    private WebElement tooltipPoliza;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/app-accordion-card[1]/div[3]/div[1]/div[1]/div[1]/h2[1]/div[1]/div[1]/div[1]/div[1]/span[1]/i[1]")
    private WebElement tooltipUltimoPago;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/app-accordion-card[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
    private WebElement tooltipResumenDeMisPagos;

    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-modal-info[1]/section[1]/div[1]/button[1]")
    private WebElement cerrarTooltip;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[1]/div[2]/span[2]/i[1]")
    private WebElement tooltipPoliza_RV;



    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[2]")
    private WebElement tooltipMontoDePension;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/app-accordion-card[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]")
    private WebElement tooltipPagosDePension;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[2]/div[1]/span[2]")
    private WebElement tooltipDatosDeMiPoliza;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[1]/span[1]/i[1]")
    private WebElement tooltipPeriodoGarantizado;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[2]/div[5]/div[1]/div[1]/span[1]/i[1]")
    private WebElement tooltipPeriodoDiferido;

    @FindBy(linkText = "Descargar")
    private WebElement linkDescargaLiquidacion;
    // Home Page Locators Chat de Glia
    @FindBy(className = "sm-tab-text")
    private WebElement chatGlia;
    @FindBy(className = "sm-close")
    private WebElement cerraChatGlia;




    public void resumenRentaVitalicia() throws InterruptedException {
        Thread.sleep(4000);
        jsExecutor.executeScript("window.scrollTo(0, 500);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipPoliza_RV);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipMontoDePension);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipDatosDeMiPoliza);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipPeriodoGarantizado);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipPeriodoDiferido);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT);



        /**
        clickAndCloseTooltip(tooltipMontoDePension);
        clickAndCloseTooltip(tooltipPagosDePension);
        clickAndCloseTooltip(tooltipDatosDeMiPoliza);
        clickAndCloseTooltip(tooltipPeriodoGarantizado);
        clickAndCloseTooltip(tooltipPeriodoDiferido);

        //WrapClass.click(linkDescargaLiquidacion);
       // Thread.sleep(LONG_WAIT); // Espera 5 segundos**/
    }



    public void resumenSeguroTemporal() throws InterruptedException {
        clickAndCloseTooltip(tooltipPoliza);
        clickAndCloseTooltip(tooltipUltimoPago);
        clickAndCloseTooltip(tooltipResumenDeMisPagos);
    }



    public void cerrarEncuesta() throws InterruptedException {
        Thread.sleep(LONG_WAIT); // Espera 10 segundos
        WrapClass.click(btnSalir);
    }


    private void clickAndCloseTooltip(WebElement tooltip) throws InterruptedException {
        WrapClass.click(tooltip);
        Thread.sleep(SHORT_WAIT); // Espera 1 segundo
        WrapClass.click(cerrarTooltip);
        Thread.sleep(SHORT_WAIT); // Espera 1 segundo
    }



}