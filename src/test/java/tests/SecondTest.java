package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Rule;
import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;
import utilities.Retry;

@Feature("Test Google search")
@DisplayName("Second Test Suite")
public class SecondTest extends BaseTest {

    @Rule
    public Retry retry = new Retry(2);
    @Test
    @DisplayName("Search for banana test")
    public void searchForBananaTest(){

        new GoogleSearchContext(driver)
                .opensTheSearchApp(baseUrl)
                .searchesFor("banana")
                .shouldSeeTitle("banana - Пошук Google");
    }
}
