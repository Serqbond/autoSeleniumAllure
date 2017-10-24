package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;

public class SecondTest extends BaseTest {

    @Test
    @DisplayName("Search for banana test")
    public void searchForBananaTest(){

        new GoogleSearchContext(driver)
                .opensTheSearchApp()
                .searchesFor("banana")
                .shouldSeeTitle("banana - Пошук Google");
    }
}
