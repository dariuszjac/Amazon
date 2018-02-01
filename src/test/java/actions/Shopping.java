package actions;

import Base.Order;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonHomePage;
import pages.CamerasPages;
import pages.CartSummary;
import pages.DetailsPage;

public class Shopping {
    AmazonHomePage amazonHomePage;
    CamerasPages camerasPages;
    DetailsPage detailsPage;
    CartSummary cartSummary;
    public Order order;

    public Shopping(WebDriver driver){
        amazonHomePage = new AmazonHomePage(driver);
        camerasPages = new CamerasPages(driver);
        detailsPage = new DetailsPage(driver);
        cartSummary = new CartSummary(driver);
        order = new Order();
    }

    public void getProductInfo(int x){
        String name =  detailsPage.readName();
        double price = detailsPage.readPrice();
        order.setPrice(price);
        order.setTitle(name);
        order.setQuantity(x);
    }

    public void checkNameofProduct(){
        Assert.assertEquals("Names are not the same",cartSummary.readNameOfProduct(),order.getTitle());
    }

    public void checkSubtotalPrice(){
        Assert.assertTrue("Subtotal price is not correct",order.getPrice()*order.getQuantity() == cartSummary.readSubtotalPrice());
    }

    public void orderProducts(int x){
        Select select = new Select(detailsPage.selectQuantity);
        select.selectByIndex(x-1);
        detailsPage.clickAddCart();
    }
    public void openCart(){
        detailsPage.moveToCart();
        detailsPage.clickToCart();
    }

    public void goIntoBestSellerDigitalCameras(){
        amazonHomePage.goToDepartments();
        amazonHomePage.goToEcelctronicsComputersOffice();
        amazonHomePage.gotoCamerasPhotosVideos();
        amazonHomePage.clickOnCamerasPhotosVideos();
        camerasPages.clickBestSellers();
        camerasPages.goToDigitalCameras();
        camerasPages.clicOnDigitalCameras();
    }

    public void openDetailsOfNthCamera(int x){
        camerasPages.clickToNthCamera(x);
    }



}
