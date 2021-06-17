package PageObject;

import Common.FindElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.How;

public class Travel {

    public FindElement pageTitle = new FindElement(How.CSS, "title");

    public FindElement firstBannerTitle = new FindElement(How.XPATH, "//h3[contains(.,'Homepage Front-End')]");
    public FindElement secondBannerTitle = new FindElement(How.XPATH, "//h3[contains(.,'Administrator Back-End')]");
    public FindElement thirdBannerTitle = new FindElement(How.XPATH, "//h3[contains(.,'Supplier Back-End')]");
    public FindElement fourthBannerTitle = new FindElement(How.XPATH, "//section[@class='grey-box']//div[6]//a[contains(.,'Mobile Apps')]");


    public void getPageTitle(){

    }



}
