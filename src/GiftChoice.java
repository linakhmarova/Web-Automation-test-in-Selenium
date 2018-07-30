import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GiftChoice {

    public static void pressChoice (WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Constants.MY_CHOICE));
        driver.findElement(Constants.MY_CHOICE).click();

    }
    public static void chooseTypeChoice (WebDriver driver) {

        WebDriverWait wait2 = new WebDriverWait(driver, 10);
        wait2.until(ExpectedConditions.elementToBeClickable(Constants.TYPE_CHOICE));
        driver.findElement(Constants.TYPE_CHOICE).click();
    }
}
