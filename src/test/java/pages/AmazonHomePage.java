package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage{

    @FindBy(how = How.ID, using = "nav-link-shopall")
    public WebElement departments;

    @FindBy(how = How.CSS, using = "span[data-nav-panelkey='ElectronicsComputersPanel']")
    public WebElement EcelctronicsComputersOffice;


    @FindBy(how = How.XPATH, using = "//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[10]/div[1]/div/a[3]" )
    public WebElement CamerasPhotosVideos;


    public AmazonHomePage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
