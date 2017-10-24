package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;
import utilities.Retry;

public class ThirdTest extends BaseTest{

    @Rule
    public Retry retry = new Retry(2);
    @Test
    @DisplayName("Search for apple test")
    public void searchForAppleFailedTest(){

        new GoogleSearchContext(driver)
                .opensTheSearchApp()
                .searchesFor("apple")
                .shouldSeeTitle("apple - Пошук Google");
    }
}
