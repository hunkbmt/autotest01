package PageAction;

import Common.Constant;
import PageObject.Travel;
import org.testng.asserts.SoftAssert;

import static Common.BuiltInAction.*;
import static Common.Constant.SOFT_ASSERT;

public class TravelAction {

    Travel travelPage = new Travel();

    //SoftAssert softAssert = new SoftAssert();

    public boolean verifyTravelPageTitle(String expectedTitle) {
        String actualTitle = getTitle();
        System.out.println("actual Page Title: " + actualTitle);
        System.out.println("expected Page Title: " + expectedTitle);
        System.out.println("Result of Page Title: " +actualTitle.equalsIgnoreCase(expectedTitle));
        //Assert.assertEquals(actualTitle.equalsIgnoreCase(expectedTitle), true, "Title is not correct");
        //SOFT_ASSERT.assertEquals(actualTitle.equalsIgnoreCase(expectedTitle), true, "Title is not correct");
        //SOFT_ASSERT.assertAll();
        if (actualTitle.equalsIgnoreCase(expectedTitle) == true) {
            return true;
        }
        return false;
    }

    public boolean verifyFirstBannerTitle(String expectedTitle) {
        String actualFirstBannerTitle = getText(travelPage.firstBannerTitle.getBy());
        System.out.println("actual First Banner Title: "+ actualFirstBannerTitle);
        System.out.println("expected First Banner Title: "+ expectedTitle);
        System.out.println("Result of First banner: " +actualFirstBannerTitle.equalsIgnoreCase(expectedTitle));
        //SOFT_ASSERT.assertEquals(actualFirstBannerTitle.equalsIgnoreCase(expectedTitle), true, "First Title is not correct");
        if (actualFirstBannerTitle.equalsIgnoreCase(expectedTitle) == true) {
            return true;
        }
        return false;

    }

    public boolean verifySecondBannerTitle(String expectedTitle) {
        String actualSecondBannerTitle = getText(travelPage.secondBannerTitle.getBy());
        System.out.println("actual Second Banner Title: " + actualSecondBannerTitle);
        System.out.println("expected Second Title: "+expectedTitle);
        System.out.println("Result of Second banner: " +actualSecondBannerTitle.equalsIgnoreCase(expectedTitle));
        //SOFT_ASSERT.assertEquals(actualSecondBannerTitle.equalsIgnoreCase(expectedTitle), true, "Second Title is not correct");
        if (actualSecondBannerTitle.equalsIgnoreCase(expectedTitle) == true) {
            return true;
        }
        return false;
    }

    public boolean verifyThirdBannerTitle(String expectedTitle) {
        String actualThirdBannerTitle = getText(travelPage.thirdBannerTitle.getBy());
        System.out.println("actual Third Banner Title: " + actualThirdBannerTitle);
        System.out.println("expected Third Title: "+expectedTitle);
        System.out.println("Result of Third banner: " +actualThirdBannerTitle.equalsIgnoreCase(expectedTitle));
        //SOFT_ASSERT.assertEquals(actualSecondBannerTitle.equalsIgnoreCase(expectedTitle), true, "Second Title is not correct");
        if (actualThirdBannerTitle.equalsIgnoreCase(expectedTitle) == true) {
            return true;
        }
        return false;
    }



}
