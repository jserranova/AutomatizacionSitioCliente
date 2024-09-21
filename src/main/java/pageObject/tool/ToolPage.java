package pageObject.tool;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import wrapClass.WrapClass;

public class ToolPage {

    private static final int SHORT_WAIT = 2000;
    private static final int LONG_WAIT = 20000;
    private int AVERAGE_WAIT = 5000;
    private static final String Monto = "1.000.000";
    private WebDriver driver;
    private JavascriptExecutor jsExecutor;

    public ToolPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-index-pages-home[1]/app-navbar[1]/header[1]/nav[1]/div[1]/div[1]/ul[1]/button[3]/li[1]/a[1]")
    private WebElement btnHerramientas;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[1]/div[1]/app-remote-operations[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement terminosyCondiciones;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[2]/div[1]/app-change-password[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement cambioClave;

    @FindBy(xpath = "//h4[contains(text(),'Cambio de Clave')]")
    private WebElement contenidoCambioClave;

    @FindBy(xpath = "//input[@id='currentPass']")
    private WebElement claveActual;

    @FindBy(id = "newPass")
    private WebElement nuevaClave;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[2]/div[1]/app-change-password[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/span[1]/i[1]")
    private WebElement verContraseña;
    @FindBy(xpath = "//input[@id='newPass2']")
    private WebElement confirmarClave;
    @FindBy(xpath = "//button[contains(text(),'Cambiar clave')]")
    private WebElement btnCambiarClave;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[3]/div[1]/app-transactions-summary[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement resumenTransacciones;

    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[6]/div[1]/app-payment-online[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement pagoEnLinea;

    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-browser-modal[1]/section[1]/div[1]/button[1]")
    private WebElement cerrarPagoLinea;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-new-contributions[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement nuevosAportes;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-new-contributions[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[1]/a[1]/i[1]")
    private WebElement tooltipCondiciones;
    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-service-conditions[1]/div[1]/div[1]/button[1]")
    private WebElement cerrarTooltip;
    @FindBy(xpath = "//select[@id='id-policy']")
    private WebElement productosList;
    @FindBy(xpath = "//input[@id='pesosAmount']")
    private WebElement montoAporte;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-new-contributions[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[3]/button[1]")
    private WebElement siguiente;
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-new-contributions[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[7]/td[2]")
    private WebElement totalaPagar;
    @FindBy(xpath = "//button[contains(text(),'Atrás')]")
    private WebElement btnAtras;
    @FindBy(xpath = "//button[contains(text(),'Pagar en Línea')]")
    private WebElement btnPagarenLinea;
    @FindBy(xpath = "//button[contains(text(),'Ver estado de aportes')]")
    private WebElement verEstadoAportes;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[7]/div[1]/app-pat[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement PAT;

    @FindBy (xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[4]/div[1]/app-virtual-agency[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnSucursalVirtual;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-tools[1]/div[2]/div[1]/div[1]/div[2]/app-bottom-cover-tools[1]/div[1]/div[5]/div[1]/app-financial-portability[1]/div[1]/div[1]/h2[1]/button[1]")
    private WebElement btnPortabilidadFinanciera;

    @FindBy(xpath = "//body/ngb-modal-window[1]/div[1]/div[1]/app-modal-info[1]/section[1]/div[1]/button[1]")
    private WebElement closeTolls;

        public void initHerramienta () throws InterruptedException {
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(btnHerramientas);
            Thread.sleep(SHORT_WAIT);
        }

        public void terminosyCondiciones () throws InterruptedException {
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(terminosyCondiciones);
            Thread.sleep(5000);
            WrapClass.click(terminosyCondiciones);
        }
        public void cambiodeClave () throws InterruptedException {
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(cambioClave);
            Thread.sleep(2000);
            WrapClass.compareTexto(contenidoCambioClave,"Cambio de Clave");
             Thread.sleep(SHORT_WAIT);
             WrapClass.sendKeys(claveActual,"123456");
             Thread.sleep(SHORT_WAIT);
             WrapClass.sendKeys(nuevaClave,"12345678");
             Thread.sleep(SHORT_WAIT);
             WrapClass.sendKeys(confirmarClave,"12345678");
             Thread.sleep(SHORT_WAIT);
            WrapClass.click(cambioClave);
        }
        public void resumendeTransacciones () throws InterruptedException {
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(resumenTransacciones);
            Thread.sleep(SHORT_WAIT);
            jsExecutor.executeScript("window.scrollBy(0, 100);");
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(resumenTransacciones);
        }

        public void sucursalVirtual () throws InterruptedException {
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(btnSucursalVirtual);
            jsExecutor.executeScript("window.scrollBy(0, 100);");
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(btnSucursalVirtual);
        }

        public void portabilidadFinanciera () throws InterruptedException {
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(btnPortabilidadFinanciera);
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(btnPortabilidadFinanciera);
        }

        public void pagoenLinea () throws InterruptedException {
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(pagoEnLinea);
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(cerrarPagoLinea);
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(pagoEnLinea);
        }
        public void nuevosAportes () throws InterruptedException {
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(nuevosAportes);
            Thread.sleep(SHORT_WAIT);
            //WrapClass.click(cerrar);
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(tooltipCondiciones);
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(cerrarTooltip);
            Thread.sleep(SHORT_WAIT);
            jsExecutor.executeScript("window.scrollBy(0, 500);");
            Select select = new Select(productosList);
            select.selectByValue("1: CF0464935");
            Thread.sleep(SHORT_WAIT);
            WrapClass.sendKeys(montoAporte, Monto);
            Thread.sleep(5000);
            jsExecutor.executeScript("window.scrollBy(0, 500);");
            Thread.sleep(6000);
            WrapClass.click(siguiente);
            Thread.sleep(6000);
            WrapClass.compareTexto(totalaPagar, "$ " + Monto);
            //WrapClass.btnHabilitado(btnAtras);
            WrapClass.getText(totalaPagar);
            //WrapClass.btnHabilitado(btnPagarenLinea);
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(verEstadoAportes);
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(nuevosAportes);
        }
        public void pAT_InscripcionyEstados () throws InterruptedException {
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(PAT);
            jsExecutor.executeScript("window.scrollBy(0, 200);");
            Thread.sleep(SHORT_WAIT);
            WrapClass.click(PAT);
        }

        public void prueba()throws InterruptedException{
            initHerramienta();
            terminosyCondiciones();
            resumendeTransacciones();
            sucursalVirtual();
            portabilidadFinanciera();
            pagoenLinea();
            pAT_InscripcionyEstados();

        }
    }


