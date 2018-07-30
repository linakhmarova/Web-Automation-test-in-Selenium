import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SendGiftPage {
    private static WebElement element = null;

    public static void chooseForWhom(WebDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Constants.CHOOSE_FOR_WHOM));
        driver.findElement(Constants.CHOOSE_FOR_WHOM).click();

    }

    public static void enterNameFor(WebDriver driver) {

        element = driver.findElement(Constants.NAME_FOR_WHOM);
        element.sendKeys(Constants.FOR_NAME);

    }
    public static void cleanNameFrom(WebDriver driver) {

        element = driver.findElement(Constants.NAME_FROM_WHO);
        element.clear();

    }

    public static void enterNameFrom(WebDriver driver) {

        element = driver.findElement(Constants.NAME_FROM_WHO);
        element.sendKeys(Constants.FROM_NAME);

    }

    public static void pressEvent(WebDriver driver) {

        element = driver.findElement(By.linkText(Constants.WHICH_EVENT));
        element.click();

    }

    public static void chooseEvent(WebDriver driver) {

        element = driver.findElement(Constants.MY_EVENT);
        element.click();

    }

    public static void cleanBlessingField(WebDriver driver) {

        element = driver.findElement(Constants.BLESSING_FIELD);
        element.clear();

    }

    public static void enterBlessing(WebDriver driver) {

        element = driver.findElement(Constants.BLESSING_FIELD);
        element.sendKeys(Constants.MY_BLESSING);

    }

    public static void uploadImage(WebDriver driver) {

        element = driver.findElement(Constants.UPLOAD_IMAGE);
        element.sendKeys(Constants.MY_IMAGE);

    }

    public static void chooseWhen(WebDriver driver) {

        element = driver.findElement(Constants.CHOOSE_WHEN);
        element.click();

    }

    public static void howToSend(WebDriver driver) {

        element = driver.findElement(By.className(Constants.HOW_TO_SEND));
        element.click();

    }
    public static void enterTelephoneFrom (WebDriver driver) {

        element = driver.findElement(Constants.TELEPHONE_FROM);
        element.sendKeys(Constants.FROM_TELEPHONE);

    }

    public static void enterTelephoneFor (WebDriver driver) {

        element = driver.findElement(By.id(Constants.TELEPHONE_FOR));
        element.sendKeys(Constants.FOR_TELEPHONE);

    }

    public static void pressSave (WebDriver driver) {

        element = driver.findElement(By.className(Constants.SAVE_BUTTON));
        element.click();

    }
    public static void pressSubmit (WebDriver driver) {

        element = driver.findElement(Constants.SUBMIT_GIFT_PAGE);
        element.click();

    }
}
