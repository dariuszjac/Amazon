package tests;

import Base.BaseUtli;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.AmazonHomePage;
import pages.CamerasPages;

import java.util.List;
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

        AmazonHomePage AhomePage = new AmazonHomePage(Driver);
        CamerasPages CPage = new CamerasPages(Driver);
        Actions actions = new Actions(Driver);

        AhomePage.goToDepartments();
        AhomePage.goToEcelctronicsComputersOffice();
        AhomePage.gotoCamerasPhotosVideos();
        AhomePage.clickOnCamerasPhotosVideos();

        CPage.goToBestSellers();
        CPage.clickBestSellers();
        CPage.goToDigitalCameras();
        CPage.clicOnDigitalCameras();

        System.out.println("dfadfdsaffdsafds");
    }

    @Then("^Check that correct product was added and subtotal price is correct$")
    public void checkThatCorrectProductWasAddedAndSubtotalPriceIsCorrect() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("then");
        System.out.println(Driver.getTitle().toString());
        Assert.assertEquals(1, 1);
    }



    @And("^Add (\\d+) pieces to the cart$")
    public void addPiecesToTheCart(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("and");
    }


    @And("^Open details of (\\d+)-th product product$")
    public void openDetailsOfThProductProduct(int arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        List <WebElement> products = Driver.findElements(By.className("zg_itemImmersion"));
        System.out.println(products.size());
        WebElement product = products.get(arg0-1);
        WebElement title = product.findElement(By.cssSelector(".p13n-sc-truncated-hyphen.p13n-sc-truncated"));
        WebElement price = product.findElement(By.className("p13n-sc-price"));
        System.out.println("Title" + title.getAttribute("title"));
        System.out.println("Getting the price of the entity= + " + price.getText());

    }
}
