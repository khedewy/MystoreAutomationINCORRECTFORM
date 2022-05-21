package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateEmail extends Pagebase{
    public CreateEmail(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "email_create")
    WebElement createemailtxt;

    @FindBy(css = "i.icon-user.left")
    WebElement createemailbtn;

    @FindBy(id = "id_gender1")
    WebElement gemderbtn;

    @FindBy(id = "customer_firstname")
    WebElement firstnametxt;

    @FindBy(id = "customer_lastname")
    WebElement lastnametxt;

    @FindBy(id = "passwd")
    WebElement passwordtxt;

    @FindBy(id = "days")
    WebElement dayslist;

    @FindBy(id = "months")
    WebElement monthlist;

    @FindBy(id = "years")
    WebElement yearslist;

    @FindBy(id = "newsletter")
    WebElement newsletterbtn;

    @FindBy(id = "company")
    WebElement companytxt;

    @FindBy(id = "address1")
    WebElement adress1txt;

    @FindBy(id = "city")
    WebElement citytxt;

    @FindBy(id = "id_state")
    WebElement statelist;

    @FindBy(id = "postcode")
    WebElement postcodetxt;

    @FindBy(id = "id_country")
    WebElement countrylist;

    @FindBy(id = "phone")
    WebElement phonetxt;

    @FindBy(id = "phone_mobile")
    WebElement mobilephontxt;

    @FindBy(id = "submitAccount")
    WebElement registerbtn;

    @FindBy(css = "p.info-account")
    public WebElement successfulmessgae;

    @FindBy(css = "i.icon-home")
    WebElement returntohomepage;

    public void basicinformation(String firstname, String lastname, String password ){
        clickbutton(gemderbtn);
        settext(firstnametxt,firstname);
        settext(lastnametxt,lastname);
        settext(passwordtxt,password);
    }
    public void selectitems() throws InterruptedException {
        select = new Select(dayslist);
        select.selectByIndex(12);
        Thread.sleep(1000);
        select = new Select(monthlist);
        select.selectByIndex(5);
        Thread.sleep(1000);
        select = new Select(yearslist);
        select.selectByIndex(5);
    }
    public void completeinformation(String companyname, String address, String city,String postcode,String phone,String mobphon){
        clickbutton(newsletterbtn);
        settext(companytxt,companyname);
        settext(adress1txt,address);
        settext(citytxt,city);
        select = new Select(statelist);
        select.selectByIndex(3);
        settext(postcodetxt,postcode);

        select = new Select(countrylist);
        select.selectByVisibleText("United States");

        settext(phonetxt,phone);
        settext(mobilephontxt,mobphon);

        clickbutton(registerbtn);

    }
    public void backtohomepage(){
        clickbutton(returntohomepage);
    }

    public void setemail(String email) throws InterruptedException {
        settext(createemailtxt,email);
        Thread.sleep(2000);
        clickbutton(createemailbtn);
    }
}
