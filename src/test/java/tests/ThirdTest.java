package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;
import utilities.Retry;

@DisplayName("Third Test Suite")
public class ThirdTest extends BaseTest{

    @Rule
    public Retry retry = new Retry(1);
    @Test
    @DisplayName("Search for apple test")
    public void searchForAppleFailedTest(){

        new GoogleSearchContext(driver)
                .opensTheSearchApp(baseUrl)
                .searchesFor("apple")
                .shouldSeeTitle("apple - Пошук Google");
    }
}
