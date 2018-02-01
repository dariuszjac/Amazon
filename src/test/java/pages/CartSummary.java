package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CartSummary extends BasePage {

    @FindBy(how = How.CSS, using = ".a-size-medium.sc-product-title.a-text-bold")//*[@id="activeCartViewForm"]/div[2]/div/div[4]/div[2]/div[1]/div/div/div[2]/ul/li[1]/span/a/span
    private WebElement productTitleSummary;

    @FindBy(how = How.ID, using = "sc-subtotal-amount-activecart")
    private WebElement summaryPrice;

    //private final By productTitleSummary =  By.("a-size-medium sc-product-title a-text-bold");

    public CartSummary(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public String readNameOfProduct() {
        return readText(productTitleSummary);
    }

    public double readSubtotalPrice(){
        double price;
        String a = readText(summaryPrice).replaceAll("[^\\d.]+", "");
        price = Double.parseDouble(a);
        return price;
    }

}