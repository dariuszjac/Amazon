package tests;

import org.junit.BeforeClass;

public class BaseTest {

    @BeforeClass
    public static void initialization(){
        System.setProperty("webdriver.chrome.driver","/home/darek/SeleniumDrivers/chromedriver");
    }

}