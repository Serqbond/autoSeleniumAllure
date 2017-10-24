package tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;

public class ThirdTest extends BaseTest{

    @Test
    @DisplayName("Search for apple test")
    public void searchForAppleTest(){

        new GoogleSearchContext(driver)
                .opensTheSearchApp()
                .searchesFor("apple")
                .shouldSeeTitle("apple - Пошук Google");
    }
}
