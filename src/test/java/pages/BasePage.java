package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;
    public Actions actions;

   public BasePage(WebDriver webDriver){
       this.driver = webDriver;
       wait = new WebDriverWait(webDriver, 100);
       actions = new Actions(webDriver);

   }

   public  void navigateToUrl(String url){
       driver.navigate().to(url);
   }

   public void clickOnElement(WebElement element){
       wait.until(ExpectedConditions.elementToBeClickable(element));
       //wait.until(ExpectedConditions.visibilityOf(element));
       element.click();
   }

   public void moveToWebElement(WebElement element){
       actions.moveToElement(element).perform();
   }

   public void clickToNthElement(By select, int n){
       List <WebElement> products =  driver.findElements(select);
       WebElement product = products.get(n-1);
       wait.until(ExpectedConditions.elementToBeClickable(product));
       product.click();
    }
}
