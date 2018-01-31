package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


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
       element.click();
   }

   public void moveToElement(WebElement element){
       actions.moveToElement(element).perform();
   }
}
