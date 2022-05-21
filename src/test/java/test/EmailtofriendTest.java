package test;

import org.testng.annotations.Test;
import pages.EmailPage;
import pages.Homepage;
import pages.LoginPage;

public class EmailtofriendTest extends Testbase{
    Homepage homepage;
    EmailPage emailPage;
    LoginPage log;
    @Test(priority = 0)
    public void UseCanSignIn() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.movetologinpage();
        Thread.sleep(5000);
        log = new LoginPage(driver);
        log.loginInformation("mmm!111113@gmail.com","m0987654321");
        Thread.sleep(2000);
        emailPage = new EmailPage(driver);
        emailPage.BackToHomePage();
        Thread.sleep(2000);

    }
    @Test(priority = 1)
    public void UserCanSendEmail() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.movetoproductpage();
        Thread.sleep(5000);
        emailPage.clickBigPicture();
        emailPage = new EmailPage(driver);
        Thread.sleep(3000);
        emailPage.moveTosendEmail();
        emailPage.SendEmailToFriend("ahmed","mmm11@gmail.com");
        Thread.sleep(2000);
        emailPage.setAgreeBtn();
    }
}
