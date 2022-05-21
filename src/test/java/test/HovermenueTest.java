package test;

import org.testng.annotations.Test;
import pages.Homepage;

public class HovermenueTest extends Testbase{
    Homepage homepage;

    @Test
    public void setHovermenue(){
        homepage = new Homepage(driver);
        homepage.hovermenue();
    }
}
