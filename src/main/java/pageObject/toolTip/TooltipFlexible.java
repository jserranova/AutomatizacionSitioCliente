package pageObject.toolTip;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import wrapClass.WrapClass;

public class TooltipFlexible {

    private static final int SHORT_WAIT = 2000;
    private static final int LONG_WAIT = 8000;
    private int AVERAGE_WAIT = 5000;

    private WebDriver driver;
    private JavascriptExecutor jsExecutor;

    public TooltipFlexible(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.jsExecutor = (JavascriptExecutor) driver;
    }

    //Home Page Locators Barra Superior
    @FindBy(xpath = "//header/nav[1]/div[1]/div[1]/ul[1]/button[1]/li[1]/a[1]/span[1]")
    private WebElement barraInicio;

    // Tooltip CorpFuturo
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[2]/div[1]/div[1]/div[2]/span[2]/i[1]")
    private WebElement tooltipPolizaCF;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]/i[1]")
    private WebElement tooltipValorPolizaCF;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[2]/div[1]/div[3]/div[1]/div[1]/span[2]")
    private WebElement tooltipResumenPagosCF;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[2]/div[1]/div[3]/div[2]/div[1]/span[2]")
    private WebElement tooltipModalidadInversionCF;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[2]/div[1]/div[3]/div[3]/div[1]/span[2]")
    private WebElement tooltipCartyMovValorPolizaCF;
    @FindBy(xpath = "//body/app-root[1]/app-index-pages-home[1]/div[2]/div[2]/div[1]/div[2]/app-bottom-cover-home[1]/div[1]/app-master-card[1]/div[1]/app-card[1]/div[2]/div[1]/div[3]/div[4]/button[1]")
    private WebElement btnMasInformacionCF;
    @FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-modal-info/section/div[3]/button")
    private WebElement cerrarTooltip_CF;

    public void corpFuturo() throws InterruptedException {
        Thread.sleep(SHORT_WAIT);
        jsExecutor.executeScript("window.scrollBy(0, 200);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipPolizaCF);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CF);
        jsExecutor.executeScript("window.scrollBy(0, 400);");
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipValorPolizaCF);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CF);

        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipResumenPagosCF);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CF);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipModalidadInversionCF);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CF);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(tooltipCartyMovValorPolizaCF);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(cerrarTooltip_CF);
        Thread.sleep(SHORT_WAIT);
        WrapClass.click(btnMasInformacionCF);
        Thread.sleep(AVERAGE_WAIT);
        WrapClass.backPage(driver);
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", barraInicio);
    }
}
