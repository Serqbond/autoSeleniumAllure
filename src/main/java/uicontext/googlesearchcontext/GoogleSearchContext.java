package uicontext.googlesearchcontext;

import io.qameta.allure.Step;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.googlesearch.GoogleSearchPage;
import uicontext.BaseContext;

public class GoogleSearchContext extends BaseContext{

    WebDriver driver;

    public GoogleSearchContext(WebDriver driver){
        this.driver = driver;
        googleSearchPage = new GoogleSearchPage(driver);
    }

    private GoogleSearchPage googleSearchPage;

    @Step("Open search page")
    public GoogleSearchContext opensTheSearchApp() {
        googleSearchPage.open("https://www.google.com.ua");
        return this;
    }

    @Step("Enter search text")
    public GoogleSearchContext searchesFor(String searchTerm) {
        googleSearchPage.enterSearchTerm(searchTerm);
        return this;
    }

    @Step("Verify expected result")
    public GoogleSearchContext shouldSeeTitle(String title) {
        Assert.assertTrue("Title is not expected", googleSearchPage.getTitle().contains(title));
        return this;
    }
}
