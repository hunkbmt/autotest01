package AutoScript;


import org.testng.annotations.Test;
import PageAction.TravelAction;
import static Common.BuiltInAction.*;

import org.testng.asserts.SoftAssert;

public class Auto01 {
    TravelAction travelAction = new TravelAction();
    SoftAssert softAssert = new SoftAssert();
    SoftAssert softAssert2 = new SoftAssert();

    @Test(description = "Testcase 01: Verify Travel Page Title")
    public void TC01()  {
        //Step 1
        Startup("Chrome");

        //Step 2
        navigateTo("https://phptravels.com/demo/");
        maximizeWindow();

        //Step 3
        travelAction.verifyTravelPageTitle("Demo Script Test drive -");
        softAssert.assertEquals(travelAction.verifyTravelPageTitle("Demo Script Test drive - PHPTRAVELS"), true, "Page Title is not correct");
        softAssert.assertAll();
    }


    @Test(description = "Testcase 02: Verify Travel Page Banners Title")
    public void TC02(){
        softAssert2.assertEquals(travelAction.verifyFirstBannerTitle("Homepage Front-End"),true, "First Banner Title is not correct");
        softAssert2.assertEquals(travelAction.verifySecondBannerTitle("Administrator Back-End"), true, "Second Banner Title is not correct");
        softAssert2.assertAll();
    }


}
