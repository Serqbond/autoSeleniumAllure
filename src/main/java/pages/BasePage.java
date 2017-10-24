package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void open(String url){
        driver.navigate().to(url);
    }

    public String getTitle(){
        return driver.getTitle();
    }
}
