package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import uihelpers.WebDriverService;

public class BaseTest {

    protected WebDriver driver;
    private WebDriverService webDriverService;

    @Before
    public void startTest(){
        webDriverService = new WebDriverService();
        driver = webDriverService.getDriver();
    }

    @After
    public void finishTest(){
        webDriverService.stopDriver();
    }
}
