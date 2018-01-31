package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CamerasPages extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-subnav\"]/a[3]/span[1]" )
    public WebElement BEST_SELLERS;

    @FindBy(how = How.XPATH, using = "//*[@id=\"zg_browseRoot\"]/ul/ul/ul/li[4]/a" )
    public WebElement DIGITAL_CAMERAS;

    private final By CAMERA_SELECTOR = By.cssSelector("#zg_centerListWrapper .zg_itemImmersion");

    public void goToBestSellers(){
        moveToWebElement(BEST_SELLERS);
    }

    public void clickBestSellers(){
        clickOnElement(BEST_SELLERS);
    }

    public void goToDigitalCameras(){
        moveToWebElement(DIGITAL_CAMERAS);
    }

    public void clicOnDigitalCameras(){
        clickOnElement(DIGITAL_CAMERAS);
    }

    public CamerasPages(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);
    }

    public void clickToNthCamera(int x){
        clickToNthElement(CAMERA_SELECTOR,x);
    }
}
