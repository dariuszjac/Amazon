package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CamerasPages extends BasePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-subnav\"]/a[3]/span[1]" )
    public WebElement BestSellers;

    @FindBy(how = How.XPATH, using = "//*[@id=\"zg_browseRoot\"]/ul/ul/ul/li[4]/a" )
    public WebElement DigitalCameras;

    public void goToBestSellers(){
        moveToElement(BestSellers);
    }

    public void clickBestSellers(){
        clickOnElement(BestSellers);
    }

    public void goToDigitalCameras(){
        moveToElement(DigitalCameras);
    }

    public void clicOnDigitalCameras(){
        clickOnElement(DigitalCameras);
    }

    public CamerasPages(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver, this);

    }

}
