package test;

import org.testng.annotations.Test;
import pages.CartDetails;
import pages.CartPage;
import pages.Homepage;
import pages.SearchPage;

public class UpdateCartTest extends Testbase{
    Homepage homepage;
    CartDetails details;
    SearchPage search;
    CartPage cart;

    @Test
    public void searchingproducts() throws InterruptedException {
        homepage = new Homepage(driver);
        search = new SearchPage(driver);
        homepage.usercansearch("T-shirts");
        Thread.sleep(5000);
        search.changingshape();
        Thread.sleep(5000);
        search.addtocart();
        Thread.sleep(10000);
    }

    @Test(priority = 1, dependsOnMethods = "searchingproducts")
    public void suercancontinueshoping() throws InterruptedException {
        cart = new CartPage(driver);
        homepage = new Homepage(driver);
        cart.continueshoping();
        homepage.clearsearchbox();
        homepage.usercansearch("Dress");
        cart.setAddtocart();
        Thread.sleep(5000);
        cart.closealert();
        Thread.sleep(5000);
        details = new CartDetails(driver);
        details.goToCart();
    }
    @Test(priority = 2,dependsOnMethods = "suercancontinueshoping")
    public void userCanUpdateCart() throws InterruptedException {
        Thread.sleep(6000);
        details.updateCart("5");
    }
    @Test
    public void UserCanDeleteItems() throws InterruptedException {
        Thread.sleep(3000);
        details = new CartDetails(driver);
        details.deleteitems();


    }


}
