package tests;

import org.junit.Test;
import uicontext.googlesearchcontext.GoogleSearchContext;

public class ThirdTest extends BaseTest{

    @Test
    public void checkSumTest(){

        new GoogleSearchContext(driver)
                .opensTheSearchApp()
                .searchesFor("apple")
                .shouldSeeTitle("apple - Пошук Google");
    }
}
