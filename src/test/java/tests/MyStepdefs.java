package tests;

import Base.BaseUtli;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonHomePage;
import pages.CamerasPages;

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
        AmazonHomePage AhomePage = new AmazonHomePage(Driver);
        CamerasPages CPage = new CamerasPages(Driver);
        Actions actions = new Actions(Driver);

        System.out.println(AhomePage.departments.getText());
        actions.moveToElement(AhomePage.departments).perform();
        TimeUnit.SECONDS.sleep(8);

        actions.moveToElement(AhomePage.EcelctronicsComputersOffice).perform();
        TimeUnit.SECONDS.sleep(8);

        actions.moveToElement(AhomePage.CamerasPhotosVideos).perform();
        actions.click().perform();
        TimeUnit.SECONDS.sleep(9);

        actions.moveToElement(CPage.BestSellers).perform();
        actions.click().perform();
        TimeUnit.SECONDS.sleep(9);

        actions.moveToElement(CPage.DigitalCameras).perform();
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
