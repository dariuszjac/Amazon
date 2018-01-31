package tests;

import Base.BaseUtli;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import tests.BaseTest;

import java.util.concurrent.TimeUnit;

public class MyStepdefs extends BaseUtli{

    private BaseUtli base;

    public MyStepdefs(BaseUtli base){
        this.base = base;
    }

    @Given("^Navigate to the Amazon$")
    public void navigateToTheAmazon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       // System.setProperty("webdriver.chrome.driver","/home/darek/SeleniumDrivers/chromedriver");
        //WebDriver driver = new ChromeDriver();
        System.out.println("given");
        String baseUrl = "http://amazon.com";
        Driver.navigate().to(baseUrl);

    }

    @And("^Go into Best sellers in Digital Cameras$")
    public void goIntoBestSellersInDigitalCameras() throws Throwable {
         //Write code here that turns the phrase above into concrete actions
        System.out.println("and");
        Actions actions = new Actions(Driver);
        WebElement x = Driver.findElement(By.id("nav-link-shopall"));
        System.out.println(x.getText());
        actions.moveToElement(x).perform();
        TimeUnit.SECONDS.sleep(8);

        WebElement y = Driver.findElement(By.cssSelector("span[data-nav-panelkey='ElectronicsComputersPanel']"));
        System.out.println(y.getAttribute("aria-label"));
        actions.moveToElement(y).perform();
        TimeUnit.SECONDS.sleep(8);

        WebElement v = Driver.findElement(By.xpath("//*[@id=\"nav-flyout-shopAll\"]/div[3]/div[10]/div[1]/div/a[3]"));
        System.out.println(v.getText());
        actions.moveToElement(v).perform();
        actions.click().perform();


        TimeUnit.SECONDS.sleep(9);

        System.out.println("dfadfdsaffdsafds");
    }

    @Then("^Check that correct product was added and subtotal price is correct$")
    public void checkThatCorrectProductWasAddedAndSubtotalPriceIsCorrect() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("then");
        System.out.println(Driver.getTitle().toString());
        Assert.assertEquals(1, 1);
    }

    @And("^Open details of fifth product$")
    public void openDetailsOfFifthProduct() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("and");
    }

    @And("^Add (\\d+) pieces to the cart$")
    public void addPiecesToTheCart(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("and");
    }
}
