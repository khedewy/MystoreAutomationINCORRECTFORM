package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.LoginPage;

public class LoginTest extends Testbase{

    Homepage homepage;
    pages.CreateEmail email;
    LoginPage log;


    @Test(priority = 0)
    public void usercanlogin() throws InterruptedException {
        homepage = new Homepage(driver);
        email = new pages.CreateEmail(driver);
        homepage.movetologinpage();
        Thread.sleep(7000);
        email.setemail("mmm!111113@gmail.com");
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
    public void UserCanLogOut() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.Logout();
        Thread.sleep(7000);
    }

    @Test(priority = 3)
    public void UseCanSignIn() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.movetologinpage();
        Thread.sleep(5000);
        log = new LoginPage(driver);
        log.loginInformation("mmm!111113@gmail.com","m0987654321");
        Thread.sleep(5000);
    }


}
