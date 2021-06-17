package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static Common.Constant.WEBDRIVER;
import static Common.Constant.SHORT_TIMEOUT;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BuiltInAction {




    /**
     * Call browser driver
     */
    public static void openBrowser(String browserName) {

        switch (browserName) {
            case "Chrome":
                System.setProperty("webdriver.chrome.driver", "E:\\Work\\AutoScript\\BrowserDriver\\chromedriver.exe");
                WEBDRIVER = new ChromeDriver();
                break;
            case "Firefox":
                System.setProperty("webdriver.gecko.driver", "E:\\Work\\AutoScript\\BrowserDriver\\geckodriver.exe");
                WEBDRIVER = new FirefoxDriver();
                break;
            default:
                System.out.println(browserName + " cannot find browser driver!");
        }
    }

    /**
     * Launch browser
     */
    public static void Startup(String browserName) {
        openBrowser(browserName);
    }

    /**
     * Opens a web page in a browser. Requires a relative or absolute url. If url starts with /, it opens a web page of a site defined by the url config parameter.
     *
     * @param url url path or global url.
     */
    public static void navigateTo(String url) {
        try {
            WEBDRIVER.navigate().to(url);
            Thread.sleep(3000);
        } catch (Exception err) {
            System.out.println("Error Navigate By URL: \n" + err);
            close();
        }
    }

    /**
     * Maximizes the current window. This method is for desktop browsers only.
     */
    public static void maximizeWindow() {
        try {
            WEBDRIVER.manage().window().maximize();
        } catch (Exception err) {
            System.out.println("Error maximizeWindow: \n" + err);
            close();
        }
    }

    /**
     * Close current browser
     */
    public static void close() {

        if (WEBDRIVER != null) {
            WEBDRIVER.close();
        }
    }

    /**
     * Find all elements within the current page using the given mechanism.
     *
     * @param element Located by CSS|XPath|ILocator
     * @return The total of elements
     */
    public static List<WebElement> getAllWebElements(By element) {
        try {
            return WEBDRIVER.findElements(element);
        } catch (Exception err) {
            System.out.println("Error Get All Element: \n" + err);
            return null;
        }
    }

    /**
     * Find Element
     *
     * @param locator Located by CSS|XPath|ILocator
     */
    public static WebElement getWebElement(By locator) {
        try {
            return WEBDRIVER.findElement(locator);
        } catch (Exception err) {
            System.out.println("Error Get element: \n" + err);
            return null;
        }
    }

    /**
     * Retrieves text from the specified element.
     *
     * @param locator Located by CSS|XPath|ILocator.
     */
    public static String getText(By locator) {
        waitForElement(locator, SHORT_TIMEOUT);
        try {
            return getWebElement(locator).getText();
        } catch (Exception err) {
            System.out.println("Error Get Element Text : \n" + err);
            return null;
        }
    }

    /**
     * Waits for an element to be present on the page (the default amount is 1 second).
     *
     * @param locator          Located by CSS|XPath|ILocator
     * @param timeOutInSeconds (optional) time in seconds to wait
     */
    public static WebElement waitForElement(By locator, int timeOutInSeconds) {
        WebElement element = null;
        try {
            WebDriverWait wait = new WebDriverWait(WEBDRIVER, timeOutInSeconds);
            element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception err) {
            System.out.println("Error waitForElement : \r\n" + err);
            close();
        }
        return element;
    }

    public static void waiting(long timeOutInSeconds) {
        WEBDRIVER.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS);
    }

    /**
     * Retrieves a page title and returns it as string.
     *
     * @return Web title
     */
    public static String getTitle() {
        try {
            return WEBDRIVER.getTitle();
        } catch (Exception err) {
            System.out.println("Error Get Title: \n" + err);
            return null;
        }
    }

    public static void callResult(){

    }

}
