package tests;

import io.qameta.allure.Feature;
import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;
import io.qameta.allure.junit4.DisplayName;

@Feature("Test Google search")
@DisplayName("First Test Suite")
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