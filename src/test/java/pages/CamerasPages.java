package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CamerasPages {

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-subnav\"]/a[3]/span[1]" )
    public WebElement BestSellers;

    @FindBy(how = How.XPATH, using = "//*[@id=\"zg_browseRoot\"]/ul/ul/ul/li[4]/a" )
    public WebElement DigitalCameras;

    public WebDriverWait wait;

    public CamerasPages(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        wait = new WebDriverWait(webDriver,60);
    }

}
