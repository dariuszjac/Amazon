package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends BasePage{

    @FindBy(how = How.ID, using = "nav-link-shopall")
    public WebElement DEPARTMENTS;

    @FindBy(how = How.CSS, using = "span[data-nav-panelkey='ElectronicsComputersPanel']")
    public WebElement ELECTRONICT_COMPUTERS_OFFICE;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[10]/div[1]/div/a[3]" )
    public WebElement CAMERAS_PHOTOS_VIDEOS;

    public void goToDepartments(){
        moveToWebElement(DEPARTMENTS);
    }

    public void goToEcelctronicsComputersOffice(){
        moveToWebElement(ELECTRONICT_COMPUTERS_OFFICE);
    }

    public void gotoCamerasPhotosVideos(){
        moveToWebElement(CAMERAS_PHOTOS_VIDEOS);
    }
    public void clickOnCamerasPhotosVideos(){
        clickOnElement(CAMERAS_PHOTOS_VIDEOS);
    }

    public AmazonHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
}
