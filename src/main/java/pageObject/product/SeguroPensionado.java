package pageObject.product;

import com.beust.ah.A;
import wrapClass.WrapClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.XMLFormatter;

public class SeguroPensionado {

    private int SHORT_WAIT = 2000;
    private int AVERAGE_WAIT = 5000;
    private WebDriver driver;
    private JavascriptExecutor jsExecutor;

    public SeguroPensionado(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    @CacheLookup
    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/ul[1]/button[1]/li[1]/a[1]/span[1]")
    private WebElement barraInicio;

    // Inicio para realizar la ejecucion del producto
    @FindBy(xpath = "//a[@id='navbarDropdownMenuLink']")
    private WebElement btnProduct;
    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/ul[1]/button[2]/li[1]/div[1]/div[2]/span[1]/span[1]")
    private WebElement btnSeguroPensionado;



    //Resumen de mis Pagos
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[2]/div[1]/app-summary-payments[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement botonResumenPagos;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-summary-payments/div/div/div/div/form/div/div[1]/input")
    private WebElement fechaDesde;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-summary-payments/div/div/div/div/form/div/div[2]/input") private WebElement fechaHasta;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-summary-payments/div/div/div/div/form/div/div[3]") private WebElement btnVer;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-summary-payments/div/div/div/div/form/div/div[4]/button")
    private WebElement btnPagoLinea;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-summary-payments/div/div/div/div/div[2]/div/div/div/div/table/tbody/tr[2]/td[7]/span/em")
    private WebElement btnCuponPago;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-summary-payments/div/div/div/div/form/div/div[5]/div")
    private WebElement suscripcionPat;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-generic-modal/section/div[1]/button") private WebElement cerrar;

    //Medio Pago
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[3]/div[1]/app-payment-method[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnMedioPago;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[3]/div/app-payment-method/div/div/div/div/div[1]/div[3]/div/span")
    private WebElement pat;

    //Datos de la Poliza
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[1]/div[1]/app-data-policy-vi[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement botonDatosPoliza;
    @FindBy(xpath = "//button[contains(text(),'Solicitar')]")
    private WebElement btnSolicitar;
    @FindBy(xpath = "//tbody/tr[1]/td[3]/a[1]")
    private WebElement btnVerContratante;
    @FindBy(xpath = "//tbody/tr[2]/td[3]/a[1]")
    private WebElement btnVerAsegurado;
    @FindBy(xpath = "//tbody/tr[3]/td[3]/a[1]")
    private WebElement btnVerPagador;
    @FindBy(xpath = "//*[@id=\"data-policy\"]/div/div[3]/div/div[1]/div[2]/div[2]/div/table/tbody/tr/td[1]/em")
    private WebElement btnVerBeneficiario;
    @FindBy(xpath = "//tbody/tr[1]/td[3]/em[1]")
    private WebElement tooltipReembolso;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-info-data-policy/div/div[3]/button")
    private WebElement btnCerrarCobertura;
    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-data-person[1]/div[1]/div[1]/button[1]")
    private WebElement btnClose;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-request-copy-policy/div/div[2]/div[3]/table/tbody/tr[3]/td[2]/span[2]")
    private WebElement modificarDatos;
    @FindBy(xpath = "/html/body/ngb-modal-window[2]/div/div/app-modify-email-info/div/div[2]/div[3]/button")
    private WebElement continuar;


    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-request-copy-policy[1]/div[1]/div[1]/button[1]")
    private WebElement btnClose1;


    public void initProducts() throws InterruptedException {
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.click(btnProduct);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnSeguroPensionado);
        Thread.sleep(AVERAGE_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 400);");

    }

    public void datosPolizaSeguroPensionado() throws InterruptedException {
        Thread.sleep(SHORT_WAIT); // Espera 1 segundos
        WrapClass.click(botonDatosPoliza);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipReembolso);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.click(btnCerrarCobertura);
        Thread.sleep(SHORT_WAIT); // Espera 2 segundos
        WrapClass.click(btnSolicitar);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(modificarDatos);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(continuar);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnClose1);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnVerContratante);
        Thread.sleep(SHORT_WAIT); // Espera 5 segundos
        WrapClass.click(btnClose);
        Thread.sleep(SHORT_WAIT); // Espera 2 segundos
        WrapClass.click(btnVerAsegurado);
        Thread.sleep(SHORT_WAIT); // Espera 5 segundos
        WrapClass.click(btnClose);
        Thread.sleep(SHORT_WAIT); // Espera 2 segundos
        WrapClass.click(btnVerPagador);
        Thread.sleep(SHORT_WAIT); // Espera 5 segundos
        WrapClass.click(btnClose);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnVerBeneficiario);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnClose);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(botonDatosPoliza);

    }

    public void resumenPagos() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(botonResumenPagos);
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(fechaDesde, "01062024");
        Thread.sleep(SHORT_WAIT);
        WrapClass.sendKeys(fechaHasta, "19092024");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnVer);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnPagoLinea);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.click(cerrar);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCuponPago);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.click(cerrar);
        Thread.sleep(SHORT_WAIT);
        System.out.println("pagina = "+driver.getTitle());//titulo de la pagina
        System.out.println("URL= "+ driver.getCurrentUrl());
        WrapClass.click(suscripcionPat);
        Thread.sleep(AVERAGE_WAIT);
        System.out.println("pagina= "+driver.getTitle());  //titulo de la pagina
        System.out.println("URL" +driver.getCurrentUrl());
        WrapClass.backPage(driver);
        Thread.sleep(SHORT_WAIT);


    }

    public void medioPago() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnMedioPago);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(pat);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.backPage(driver);
        Thread.sleep(SHORT_WAIT);

    }

    public void seguroPensionado() throws InterruptedException {
        initProducts();
        datosPolizaSeguroPensionado();
        resumenPagos();
        medioPago();
        jsExecutor.executeScript("window.scrollBy(0, -400);");
    }

}
