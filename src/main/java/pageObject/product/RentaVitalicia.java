package pageObject.product;

import wrapClass.WrapClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RentaVitalicia {

    private int SHORT_WAIT = 2000;
    private int AVERAGE_WAIT = 5000;
    private JavascriptExecutor jsExecutor;
    private WebDriver driver;

    public RentaVitalicia(WebDriver driver) {
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
    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/ul[1]/button[2]/li[1]/div[1]/div[1]/span[1]")
    private WebElement rentabitalicia;


   //Datos de   la poliza
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[1]/div[1]/app-data-policy-rv[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnDatosPoliza;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[1]/div/app-data-policy-rv/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/button")
    private WebElement btnCammbioViaPago;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-change-payment-method/div[1]/button")
    private WebElement btnCerrarPago;
    @FindBy(id = "flexCheckDefault") private WebElement clic;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[1]/div/app-data-policy-rv/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/div/div/div/form/div/button[1]")
    private WebElement cancelar;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[1]/div/app-data-policy-rv/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[5]/div/div/table/tbody/tr/td[2]/div/button")
    private WebElement btnConsulta;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-no-pay-pension/div/div/button")
    private WebElement btncerraConsulta;

    // Certiicados
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[2]/div[1]/app-certificates[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnCertificado;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-certificates/div/div/div/div/div[1]/ul/li[2]/button")
    private WebElement btnCertificadoTributaro;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-certificates/div/div/div/div/div[1]/ul/li[1]/button")
    private WebElement btnCertificadoPensionado;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-product/div[2]/div/div/div[2]/app-bottom-cover-products/div/div[2]/div/app-certificates/div/div/div/div/div[2]/div[2]/div/div/span/h4/em")
    private WebElement certificadoTooltip;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-tax-certificates/section/div[1]/button")
    private WebElement cerrarTooltip;

    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-index-pages-product[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-products[1]/div[1]/div[3]/div[1]/app-pension-payments[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnLiquidacionPension;

    public void initProduct() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnProduct);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(rentabitalicia);
        Thread.sleep(AVERAGE_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 400);");
    }

    public void datosPoliza() throws InterruptedException{
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnDatosPoliza);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCammbioViaPago);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCerrarPago);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(clic);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cancelar);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnConsulta);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btncerraConsulta);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnDatosPoliza);
    }

    public void certificado() throws InterruptedException{
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCertificado);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnCertificadoTributaro);
        WrapClass.click(btnCertificado);
        Thread.sleep(3000);
    }

    public void liquidacionPension() throws InterruptedException {
        Thread.sleep(3000);
        WrapClass.click(btnLiquidacionPension);
        Thread.sleep(3000);
        WrapClass.click(btnLiquidacionPension);
        Thread.sleep(1000);
    }

    public void rentabitalicia()throws InterruptedException{
        initProduct();
        datosPoliza();
        certificado();
        liquidacionPension();
        jsExecutor.executeScript("window.scrollBy(0, -400);");


    }

    }

