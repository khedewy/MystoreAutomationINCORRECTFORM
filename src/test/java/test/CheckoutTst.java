package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.CheckoutPage;
import pages.Homepage;
import pages.SearchPage;

public class CheckoutTst extends Testbase{
    Homepage homepage;
    SearchPage search;
    CartPage cart;
    CheckoutPage checkoutPage;
    pages.CreateEmail email;



    @Test(priority = 0)
    public void usercanlogin() throws InterruptedException {
        homepage = new Homepage(driver);
        email = new pages.CreateEmail(driver);
        homepage.movetologinpage();
        Thread.sleep(7000);
        email.setemail("mmmm!q111113@gmail.com");
        Thread.sleep(10000);
    }
    @Test(priority = 1,dependsOnMethods = "usercanlogin")
    public void usercompleteregister() throws InterruptedException {
        email = new pages.CreateEmail(driver);
        email.basicinformation("mahmoud","ali","m0987654321");
        email.selectitems();
        email.completeinformation("addd","qwww/qwww","sddd","12344","1234554321","12341234");
        Thread.sleep(10000);
        Assert.assertTrue(email.successfulmessgae.getText().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
        email.backtohomepage();
        Thread.sleep(5000);

    }

    @Test(priority = 2)
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
    @Test(priority = 3,dependsOnMethods = "searchingproducts")
    public void checkout() throws InterruptedException {
        cart = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        cart.setGotocheckout();
        Thread.sleep(5000);
        checkoutPage.completecheckout();
        Thread.sleep(5000);

    }
}
