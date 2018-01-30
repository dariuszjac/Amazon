package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public class BasePage {

    public WebDriver driver;
    public Actions actions;

   public BasePage(WebDriver webDriver){
       this.driver = webDriver;
   }

   public navigateToUrl(String url){
       driver.navigate().to(url);
   }
}
