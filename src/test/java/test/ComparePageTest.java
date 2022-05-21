package test;

import org.testng.annotations.Test;
import pages.*;

public class ComparePageTest extends Testbase{
    Homepage homepage;
    LoginPage login;
    ComparePage comparePage;
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
    public void ComparePage() throws InterruptedException {
        page = new CartPage(driver);
        search = new SearchPage(driver);
        comparePage = new ComparePage(driver);
        search.changingshape();
        page.setAddToComparePage();
        Thread.sleep(2000);
        homepage = new Homepage(driver);
        homepage.clearsearchbox();
        homepage.usercansearch("dress");
        Thread.sleep(2000);
        search.changingshape();
        Thread.sleep(2000);
        page.setAddToComparePage();
        comparePage.MoveToComparePage();
        Thread.sleep(2000);
        comparePage.compareProducts();
    }
}
