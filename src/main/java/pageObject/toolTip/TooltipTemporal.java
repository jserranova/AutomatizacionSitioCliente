package pageObject.toolTip;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wrapClass.WrapClass;

public class TooltipTemporal {

    private static final int SHORT_WAIT = 2000;
    private static final int LONG_WAIT = 8000;
    private int AVERAGE_WAIT = 5000;

    private WebDriver driver;
    private JavascriptExecutor jsExecutor;

    public TooltipTemporal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    @CacheLookup
    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/ul[1]/button[1]/li[1]/a[1]/span[1]")
    private WebElement barraInicio;

    //Tooltip Seguro Pensionado
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[2]/div[1]/div[1]/div[2]/span[2]/i[1]")
    private WebElement toolPoliza_SP;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-modal-info/section/div[3]/button")
    private WebElement cerraTool_SP;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]")
    private WebElement tooltipUltimoPago_SP;
    @FindBy(xpath = "/html/body/app-root/app-index-pages-home/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home/div/app-master-card/div/app-card/div[2]/div/div[3]/div[1]/div[1]/span[2]")
    private WebElement tooltipResumenPago_SP;
    @FindBy(xpath ="/html/body/app-root/app-index-pages-home/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home/div/app-master-card/div/app-card/div[2]/div/div[3]/div[2]/button")
    private WebElement masInformaciones_SP;

    //Tooltip CorpSalud Integral
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[1]/div[2]/span[2]/i[1]")
    private WebElement tooltipPoliza_CSI;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]")
    private WebElement tooltipUltimoPago_CSI;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[1]/div[1]/span[2]")
    private WebElement tooltipResumenPagos_CSI;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[2]/div[1]/span[2]")
    private WebElement tooltipDatosPoliza_CSI;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-modal-info/section/div[3]/button")
    private WebElement cerrarTooltip_CSI;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[1]/div[1]/div[3]/div[3]/button[1]")
    private WebElement btnMasInformacion_CSI;

    public void SeguroPensionado() throws InterruptedException{
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(toolPoliza_SP);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerraTool_SP);
        jsExecutor.executeScript("window.scrollBy(0, 300);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipUltimoPago_SP);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerraTool_SP);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipResumenPago_SP);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerraTool_SP);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(masInformaciones_SP);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.backPage(driver);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", barraInicio);
    }

    public void CorpSaludIntegral() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipPoliza_CSI);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CSI);
        jsExecutor.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipUltimoPago_CSI);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CSI);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipResumenPagos_CSI);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CSI);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipDatosPoliza_CSI);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CSI);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnMasInformacion_CSI);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.backPage(driver);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", barraInicio);
    }

}
