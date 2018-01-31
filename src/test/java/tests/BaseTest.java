package tests;
import Base.BaseUtli;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.AmazonHomePage;
import pages.CamerasPages;


public class BaseTest extends BaseUtli{

    private BaseUtli base;

    public BaseTest(BaseUtli base){
        this.base = base;
    }


    @Before
    public static void initialization(){
        System.setProperty("webdriver.chrome.driver","/home/darek/SeleniumDrivers/chromedriver");
        System.out.println("before");
        Driver = new ChromeDriver();
        AmazonHomePage AhomePage = new AmazonHomePage(Driver);
        CamerasPages CPage = new CamerasPages(Driver);
        Actions actions = new Actions(Driver);

    }

    @After
    public static void close() {
        System.out.println("after");
        if (Driver != null) {
            Driver.close();
            Driver.quit();
        }
    }
}
