package tests;

import org.junit.Assert;
import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;

public class SecondTest extends BaseTest {

    @Test
    public void checkSumTest(){

        new GoogleSearchContext(driver)
                .opensTheSearchApp()
                .searchesFor("banana")
                .shouldSeeTitle("banana - Пошук Google");
    }
}
