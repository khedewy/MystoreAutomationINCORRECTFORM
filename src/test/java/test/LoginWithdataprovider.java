package test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.LoginPage;

public class LoginWithdataprovider extends Testbase{
    Homepage homepage;
    pages.CreateEmail emailpage;
    LoginPage log;

    @DataProvider(name = "Userdata")
    public static Object[][] userdata(){
            return new Object[][]{
                    {"mmmmmm!aa13@gmail.com","ahmed","mohamed","m0987654321","sdddd","ass123","aasssd","12344","123456","121212"},
                    {"nnmmm!111@gmail.com","ali","mohamed","m0987654321","sdddd","ass123","aasssd","12344","123456","121212"}

        };
    }



    @Test(priority = 0,dataProvider = "Userdata")
    public void usercanlogin(String email,String firstname,String lastname,String password,String copmanyname,String address
                             ,String city, String postcode, String phone, String mobilephone) throws InterruptedException {
        homepage = new Homepage(driver);
        emailpage = new pages.CreateEmail(driver);
        homepage.movetologinpage();
        Thread.sleep(7000);
        emailpage.setemail(email);
        Thread.sleep(10000);
        emailpage.basicinformation(firstname,lastname,password);
        emailpage.selectitems();
        emailpage.completeinformation(copmanyname,address,city,postcode,phone,mobilephone);
        Thread.sleep(10000);
        Assert.assertTrue(emailpage.successfulmessgae.getText().contains("Welcome to your account. Here you can manage all of your personal information and orders."));
        emailpage.backtohomepage();
        Thread.sleep(5000);
        homepage.Logout();
        Thread.sleep(7000);
        homepage.movetologinpage();
        Thread.sleep(5000);
        log = new LoginPage(driver);
        log.loginInformation(email,password);
        Thread.sleep(5000);
        homepage.Logout();
        Thread.sleep(7000);
    }


}
