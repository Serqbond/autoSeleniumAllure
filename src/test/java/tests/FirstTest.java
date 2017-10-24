package tests;

import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;
import io.qameta.allure.junit4.DisplayName;

public class FirstTest extends BaseTest {

    @Test
    @DisplayName("Search for pear test")
    public void searchForPearTest(){
    new GoogleSearchContext(driver)
            .opensTheSearchApp(baseUrl)
            .searchesFor("pear")
            .shouldSeeTitle("pear - Пошук Google");
    }
}