package test;

import org.testng.annotations.Test;
import pages.Homepage;
import pages.SearchPage;

public class SearchTest extends Testbase{
    Homepage homepage;
    SearchPage search;

    @Test
    public void searchingproducts() throws InterruptedException {
        homepage = new Homepage(driver);
        search = new SearchPage(driver);
        homepage.usercansearch("T-shirts");
        Thread.sleep(5000);
        search.changingshape();
        Thread.sleep(5000);
        search.addtocart();
        Thread.sleep(5000);

    }

}
