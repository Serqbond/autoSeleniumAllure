package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.junit.Test;
import ru.yandex.qatools.allure.annotations.Title;
import uicontext.googlesearchcontext.GoogleSearchContext;
import io.qameta.allure.junit4.DisplayName;

@Title("First Test")
@Feature("Test Google search")
public class FirstTest extends BaseTest {

    @Test
    @DisplayName("Search for pear test")
    @Description("In this cool test we will test only cool features")
    @Title("First pear test")
    public void searchForPearTest(){
    new GoogleSearchContext(driver)
            .opensTheSearchApp(baseUrl)
            .searchesFor("pear")
            .shouldSeeTitle("pear - Пошук Google");
    }
}