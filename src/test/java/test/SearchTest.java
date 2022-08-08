package test;

import org.junit.Assert;
import org.junit.Test;

public class SearchTest extends BaseTest {


    @Test
    public void searchForItemTest() {
        homePage.setSearchField("necklace");
        homePage.clickSearchButton();
        Assert.assertTrue("Product not found!",
                searchResultsPage.isProductInList("SILVER DESERT NECKLACE"));
    }

    @Test
    public void searchForItem2Test() {
        homePage.setSearchField("shirt");
        homePage.clickSearchButton();
        Assert.assertTrue("Product not found!",
                searchResultsPage.isProductInList("FRENCH CUFF COTTON TWILL OXFORD"));
    }
}
