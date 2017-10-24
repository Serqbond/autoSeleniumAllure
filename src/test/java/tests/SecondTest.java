package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;
import utilities.Retry;

public class SecondTest extends BaseTest {

    @Rule
    public Retry retry = new Retry(2);
    @Test
    @DisplayName("Search for banana test")
    public void searchForBananaTest(){

        new GoogleSearchContext(driver)
                .opensTheSearchApp()
                .searchesFor("banana")
                .shouldSeeTitle("banana - Пошук Google");
    }
}
