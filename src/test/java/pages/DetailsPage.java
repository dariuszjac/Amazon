package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DetailsPage extends BasePage{


    @FindBy(how = How.ID, using = "productTitle")
    public WebElement productTitle;

    @FindBy(how = How.ID, using = "add-to-cart-button")
    public WebElement ADD_TO_CART;

    @FindBy(how = How.ID, using = "quantity")
    public WebElement quantity;

    @FindBy(how = How.ID, using = "siNoCoverage-announce")
    public WebElement NO_THANKS;

    @FindBy(how = How.ID,using ="nav-cart-count")
    public WebElement NAV_TO_CART;

    public DetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void doNotAcceptOptions(){
        clickOnElement(NO_THANKS);
    }

    public void moveToDoNotAccept(){
        moveToElement(NO_THANKS);
    }

    public void clickAddCart(){
        clickOnElement(ADD_TO_CART);
    }

    public void moveToAddToCart(){
        moveToElement(ADD_TO_CART);
    }

    public void clickToCart(){
        clickOnElement(NAV_TO_CART);
    }
    public void moveToCart(){
        moveToElement(NAV_TO_CART);
    }
}
