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
import pages.DetailsPage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyStepdefs extends BaseUtli{

    private BaseUtli base;

    AmazonHomePage AhomePage = new AmazonHomePage(Driver);
    CamerasPages CPage = new CamerasPages(Driver);
    Actions actions = new Actions(Driver);
    DetailsPage detailsPage = new DetailsPage(Driver);

    public MyStepdefs(BaseUtli base){
        this.base = base;
    }

    @Given("^Navigate to the Amazon$")
    public void navigateToTheAmazon() throws Throwable {
        System.out.println("given");
        String baseUrl = "http://amazon.com";
        Driver.navigate().to(baseUrl);
    }

    @And("^Go into Best sellers in Digital Cameras$")
    public void goIntoBestSellersInDigitalCameras() throws Throwable {
        AhomePage.goToDepartments();
        AhomePage.goToEcelctronicsComputersOffice();
        AhomePage.gotoCamerasPhotosVideos();
        AhomePage.clickOnCamerasPhotosVideos();

        //CPage.goToBestSellers();
        CPage.clickBestSellers();
        CPage.goToDigitalCameras();
        CPage.clicOnDigitalCameras();
    }

    @Then("^Check that correct product was added and subtotal price is correct$")
    public void checkThatCorrectProductWasAddedAndSubtotalPriceIsCorrect() throws Throwable {
        System.out.println(Driver.getTitle().toString());
        detailsPage.moveToCart();
        detailsPage.clickToCart();
    }

    @And("^Add (\\d+) pieces to the cart$")
    public void addPiecesToTheCart(int arg0) throws Throwable {
        System.out.println("and");
        detailsPage.clickAddCart();
        detailsPage.doNotAcceptOptions();
        //detailsPage.moveToCart();
    }

    @And("^Open details of (\\d+)-th product product$")
    public void openDetailsOfThProductProduct(int arg0) throws Throwable {
        CPage.clickToNthCamera(arg0);
    }
}
