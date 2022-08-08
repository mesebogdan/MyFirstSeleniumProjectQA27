package test;

import org.junit.Assert;
import org.junit.Test;

public class CartTest extends BaseTest {

    @Test
    public void addToCartTest() {
//        homePage.clickAccountLink();
//        homePage.clickLoginLink();
//        loginPage.setEmailField("cosmin@fasttrackit.org");
//        loginPage.setPasswordField("123456");
//        loginPage.clickLoginButton();
        String productName = "Silver Desert necklace";
        int productQty = 2;

        homePage.setSearchField("necklace");
        homePage.clickSearchButton();
        Assert.assertTrue(searchResultsPage.isProductInListAndSelect(productName));
        productPage.setQtyField(productQty);
        productPage.clickAddToCartButton();
        Assert.assertEquals(productName.toLowerCase() + " was added to your shopping cart."
                , cartPage.getSuccessMessageSpan().toLowerCase());
        Assert.assertEquals(productQty + "", cartPage.getQtyField());

    }
}
