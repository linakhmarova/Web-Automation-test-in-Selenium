import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreen {
    private static WebElement element = null;

    public static void pressPrice (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(Constants.PRESS_PRICE));
        driver.findElement(Constants.PRESS_PRICE).click();

    }
    public static void choosePrice (WebDriver driver) {

        element = driver.findElement(Constants.CHOOSE_PRICE);
        element.click();

    }
    public static void pressArea (WebDriver driver) {

        element = driver.findElement(By.linkText(Constants.PRESS_AREA));
        element.click();

    }
    public static void chooseArea (WebDriver driver) {

        element = driver.findElement(Constants.CHOOSE_AREA);
        element.click();

    }
    public static void pressType (WebDriver driver) {

        element = driver.findElement(By.linkText(Constants.PRESS_TYPE));
        element.click();

    }
    public static void chooseType (WebDriver driver) {

        element = driver.findElement(Constants.CHOOSE_TYPE);
        element.click();

    }
    public static void pressSubmit (WebDriver driver) {

        element = driver.findElement(Constants.SUBMIT_BUTTON);
        element.click();

    }
}
