package test;

import org.testng.annotations.Test;
import pages.*;

public class AddToWishList extends Testbase{
    Homepage homepage;
    LoginPage login;
    CartDetails details;
    SearchPage search;
    CartPage page;

    @Test(priority = 0)
    public void UserCanLogin() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.movetologinpage();
        login = new LoginPage(driver);
        login.loginInformation("mmm!111113@gmail.com","m0987654321");
    }
    @Test(priority = 1)
    public void UserSearching(){
        homepage = new Homepage(driver);
        homepage.usercansearch("T-shirts");
    }
    @Test(priority = 2)
    public void addTOwishList() throws InterruptedException {
        page = new CartPage(driver);
        search = new SearchPage(driver);
        search.changingshape();
        page.addToWishList();
        Thread.sleep(2000);
        page.closeNotification();
        Thread.sleep(2000);

    }
}
