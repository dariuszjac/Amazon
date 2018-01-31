package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DetailsPage extends BasePage{


    @FindBy(how = How.ID, using = "productTitle")
    public WebElement productTitle;

    @FindBy(how = How.ID, using = "add-to-cart-button")
    public WebElement addToCart;

    @FindBy(how = How.ID, using = "quantity")
    public WebElement quantity;

    @FindBy(how = How.ID, using = "siNoCoverage-announce")
    public WebElement noThanks;


    public DetailsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void doNotAcceptOptions() {
        clickOnElement(noThanks);
    }

    public void moveToDoNotAccept(){
        moveToElement(noThanks);
    }
    public void clickAddCart() {
        clickOnElement(addToCart);
    }
    public void moveToAddToCart(){
        moveToElement(addToCart);
    }


}
