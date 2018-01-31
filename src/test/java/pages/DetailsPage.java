package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends BasePage{


    @FindBy(how = How.ID, using = "productTitle")
    public WebElement productTitle;

    @FindBy(how = How.ID, using = "priceblock_ourprice")
    public WebElement productPrice;

    @FindBy(how = How.ID, using = "add-to-cart-button")//*[@id="add-to-cart-button"]
    public WebElement ADD_TO_CART;

    @FindBy(how = How.ID, using = "quantity")
    public WebElement quantity;

    @FindBy(how = How.ID, using = "siNoCoverage-announce")
    public WebElement NO_THANKS;

    @FindBy(how = How.XPATH, using ="//*[@id=\"hlb-view-cart-announce\"]")//*[@id="hlb-view-cart-announce"]
    public WebElement NAV_TO_CART;

    public DetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void doNotAcceptOptions(){
        clickOnElement(NO_THANKS);
    }

    public void moveToDoNotAccept(){
        moveToWebElement(NO_THANKS);
    }

    public void clickAddCart(){
        clickOnElement(ADD_TO_CART);
    }

    public void moveToAddToCart(){
        moveToWebElement(ADD_TO_CART);
    }

    public void clickToCart(){
        clickOnElement(NAV_TO_CART);
    }
    public void moveToCart(){
        moveToWebElement(NAV_TO_CART);
    }

    public String readName(){
        return readText(productTitle);
    }

    public String readPrice(){
        return readText(productPrice);
    }
}
