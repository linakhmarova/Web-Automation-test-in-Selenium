import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Registration {

    private static WebElement element = null;

    public static void openLink (WebDriver driver) {

        element = driver.findElement(By.className(Constants.OPEN_LINK));
        element.click();
    }
    public static void signIn (WebDriver driver) {

        element = driver.findElement(By.className(Constants.SIGN_IN));
        element.click();

    }
    public static void enterName (WebDriver driver) {

        element = driver.findElement(By.id(Constants.ID_NAME));
        element.sendKeys(Constants.MY_NAME);

    }
    public static void enterEmail (WebDriver driver) {

        element = driver.findElement(By.id(Constants.ID_EMAIL));
        element.sendKeys(Constants.MY_EMAIL);

    }
    public static void enterPassword (WebDriver driver) {

        element = driver.findElement(By.id(Constants.ID_PASSWORD));
        element.sendKeys(Constants.MY_PASSWORD);

    }
    public static void enterPasswordAgain (WebDriver driver) {

        element = driver.findElement(By.id(Constants.ID_PASSWORD_AGAIN));
        element.sendKeys(Constants.MY_PASSWORD);

    }
    public static void checkRadioButton (WebDriver driver) {

        element = driver.findElement(Constants.RADIO_BUTTON);
        element.click();

    }
    public static void pressSubmit (WebDriver driver) {

        element = driver.findElement(Constants.SUBMIT_BUTTON);
        element.click();

    }

}
