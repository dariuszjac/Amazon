package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends BasePage{

    @FindBy(how = How.ID, using = "nav-link-shopall")
    private WebElement departments;

    @FindBy(how = How.CSS, using = "span[data-nav-panelkey='ElectronicsComputersPanel']")
    private WebElement electronictComputersOffice;

    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[10]/div[1]/div/a[3]" )
    private WebElement camerasPhotosVideos;

    public AmazonHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void goToDepartments(){
        moveToWebElement(departments);
    }

    public void goToEcelctronicsComputersOffice(){
        moveToWebElement(electronictComputersOffice);
    }

    public void gotoCamerasPhotosVideos(){
        moveToWebElement(camerasPhotosVideos);
    }
    public void clickOnCamerasPhotosVideos(){
        clickOnElement(camerasPhotosVideos);
    }
}
