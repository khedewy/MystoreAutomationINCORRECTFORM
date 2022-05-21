package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ContactUSPage;
import pages.Homepage;

public class ContactUsTest extends Testbase{

    Homepage homepage;
    ContactUSPage contact;



    @Test
    public void userCanContactUs() throws InterruptedException {
        homepage = new Homepage(driver);
        homepage.movetocontactUs();
        Thread.sleep(5000);
        contact = new ContactUSPage(driver);
        contact.sendMessage("mmmmmm!aa13@gmail.com","t-shirts","this t-shirt is not the one i want ");
        Thread.sleep(5000);
        Assert.assertTrue(contact.successfulMessage.getText().contains("Your message has been successfully sent to our team"));

    }
}
