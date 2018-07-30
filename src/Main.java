import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import jdk.internal.org.xml.sax.SAXException;
import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.junit.rules.TestName;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.fail;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Main {
    private static WebDriver driver;

    @Rule
    public TestName name = new TestName();

    private static ExtentReports report ;
    private static ExtentTest test ;

    //Run browser and open page + report configurations
    @BeforeClass
    public static void runBefore() throws org.xml.sax.SAXException, ParserConfigurationException, SAXException, IOException {

        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(Constants.REPORTER_PATH);
        htmlReporter.setAppendExisting(true);
        report = new ExtentReports();
        report.attachReporter(htmlReporter);
        test = report.createTest(Constants.TEST_NAME, Constants.TEST_DESCRIPTION);
        report.setSystemInfo(Constants.INFO_KEY, Constants.INFO_VALUE);
        report.setSystemInfo(Constants.INFO_KEY2, Constants.INFO_VALUE2);
        test.log(Status.INFO, Constants.LOG_INFO);

        boolean driverEstablish = false;
        try {
            System.setProperty(Constants.PROPERTY, Constants.PROPERTY_2);
            driver = new ChromeDriver();
            driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driverEstablish = true;

        } catch (Exception e) {

            e.printStackTrace();
            fail(Constants.DRIVER_STATUS);
            test.log(Status.FATAL, Constants.DRIVER_FAIL + e.getMessage());
            driverEstablish = false;
        } finally {
            if (driverEstablish) {
                test.log(Status.PASS, Constants.DRIVER_SUCCESSFUL);

            }
        }

        boolean pageOpened = false;
        try {
            driver.navigate().to(getData(Constants.URL));
            driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
            pageOpened = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.PAGE_FAIL + e.getMessage());
            pageOpened = false;
        } finally {
            if (pageOpened) {
                test.log(Status.PASS, Constants.PAGE_SUCCESSFUL);

            }
        }

    }

    private static String getData(String keyName) throws ParserConfigurationException, IOException, SAXException, org.xml.sax.SAXException {
        File configXmlFile = new File(Constants.XML_FILE);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(configXmlFile);

        if (doc != null) {
            doc.getDocumentElement().normalize();
        }
        assert doc != null;
        return doc.getElementsByTagName(keyName).item(0).getTextContent();
    }

    //Open Registration link and Registration itself
    @Test
    public void test01_registration() throws IOException {

        boolean openLink = false;
        try {
            Registration.openLink(driver);
            openLink = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.OPEN_LINK_FAIL + e.getMessage());
            openLink = false;
        } finally {
            if (openLink) {
                test.log(Status.PASS, Constants.OPEN_LINK_SUCCESSFUL);

            }
        }

        boolean signIn = false;
        try {
            Registration.signIn(driver);
            signIn = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.SIGN_IN_FAIL + e.getMessage());
            signIn = false;
        } finally {
            if (signIn) {
                test.log(Status.PASS, Constants.SIGN_IN_SUCCESSFUL);

            }
        }

        boolean registration = false;
        try {
            Registration.enterName(driver);
            Registration.enterEmail(driver);
            Registration.enterPassword(driver);
            Registration.enterPasswordAgain(driver);
            Registration.checkRadioButton(driver);
            Registration.pressSubmit(driver);
            registration = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.REGISTRATION_FAIL + e.getMessage());
            registration = false;
        } finally {
            if (registration) {
                test.log(Status.PASS, Constants.REGISTRATION_SUCCESSFUL);

            }
        }

        test.pass(Constants.SCREENSHOT_REGISTRATION, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Constants.IMAGE_PATH + name.getMethodName())).build());

    }

    //Searching for gift by choosing its parameters
    @Test
    public void test02_homeScreen() throws IOException {

        boolean homeScreen_dropdown = false;
        try {
            HomeScreen.pressPrice(driver);
            HomeScreen.choosePrice(driver);
            HomeScreen.pressArea(driver);
            HomeScreen.chooseArea(driver);
            HomeScreen.pressType(driver);
            HomeScreen.chooseType(driver);
            HomeScreen.pressSubmit(driver);
            homeScreen_dropdown = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.HOMESCREEN_DROPDOWN_FAIL + e.getMessage());
            homeScreen_dropdown = false;
        } finally {
            if (homeScreen_dropdown) {
                test.log(Status.PASS, Constants.HOMESCREEN_DROPDOWN_SUCCESSFUL);

            }
        }

        test.pass(Constants.SCREENSHOT_DROPDOWN, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Constants.IMAGE_PATH + name.getMethodName())).build());

    }

    //Choosing of gift from received results
    @Test
    public void test03_giftScreen() throws IOException {

        boolean assertURL = false;
        try {
            Assert.assertEquals(Constants.CURRENT_URL, driver.getCurrentUrl());
            assertURL = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.WARNING, Constants.ASSERT_FAIL + e.getMessage());
            assertURL = false;
        } finally {
            if (assertURL) {
                test.log(Status.PASS, Constants.ASSERT_SUCCESSFUL);

            }
        }

        boolean pressChoice = false;
        try {
            GiftChoice.pressChoice(driver);
            pressChoice = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.PRESS_CHOICE_FAIL + e.getMessage());
            pressChoice = false;
        } finally {
            if (pressChoice) {
                test.log(Status.PASS, Constants.PRESS_CHOICE_SUCCESSFUL);

            }
        }

        boolean chooseTypeChoice = false;
        try {
            GiftChoice.chooseTypeChoice(driver);
            chooseTypeChoice = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.CHOOSE_TYPE_FAIL + e.getMessage());
            chooseTypeChoice = false;
        } finally {
            if (chooseTypeChoice) {
                test.log(Status.PASS, Constants.CHOOSE_TYPE_SUCCESSFUL);

            }
        }

        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        test.pass(Constants.SCREENSHOT_YOUR_CHOICE, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Constants.IMAGE_PATH + name.getMethodName())).build());

    }

    //Completing form of Sender & Receiver details
    @Test
    public void test04_sendGiftPage() throws IOException {

        boolean chooseForWhom = false;
        try {
            SendGiftPage.chooseForWhom(driver);
            chooseForWhom = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.CHOOSE_FOR_WHOM_FAIL + e.getMessage());
            chooseForWhom = false;
        } finally {
            if (chooseForWhom) {
                test.log(Status.PASS, Constants.CHOOSE_FOR_WHOM_SUCCESSFUL);

            }
        }

        boolean namesForFrom = false;
        try {
            SendGiftPage.cleanNameFrom(driver);
            SendGiftPage.enterNameFrom(driver);
            SendGiftPage.enterNameFor(driver);

            namesForFrom = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.NAMES_FOR_FROM_FAIL + e.getMessage());
            namesForFrom = false;
        } finally {
            if (namesForFrom) {
                test.log(Status.PASS, Constants.NAMES_FOR_FROM_SUCCESSFUL);

            }
        }

        boolean chooseEvent = false;
        try {
            SendGiftPage.pressEvent(driver);
            SendGiftPage.chooseEvent(driver);
            chooseEvent = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.CHOOSE_EVENT_FAIL + e.getMessage());
            chooseEvent = false;
        } finally {
            if (chooseEvent) {
                test.log(Status.PASS, Constants.CHOOSE_EVENT_SUCCESSFUL);

            }
        }

        boolean addBlessing = false;
        try {
            SendGiftPage.cleanBlessingField(driver);
            SendGiftPage.enterBlessing(driver);
            addBlessing = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.ADD_BLESSING_FAIL + e.getMessage());
            addBlessing = false;
        } finally {
            if (addBlessing) {
                test.log(Status.PASS, Constants.ADD_BLESSING_SUCCESSFUL);

            }
        }

        boolean uploadImage = false;
        try {
            SendGiftPage.uploadImage(driver);
            uploadImage = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.UPLOAD_IMAGE_FAIL + e.getMessage());
            uploadImage = false;
        } finally {
            if (uploadImage) {
                test.log(Status.PASS, Constants.UPLOAD_IMAGE_SUCCESSFUL);

            }
        }

        boolean chooseWhen = false;
        try {
            SendGiftPage.chooseWhen(driver);
            chooseWhen = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.CHOOSE_WHEN_FAIL + e.getMessage());
            chooseWhen = false;
        } finally {
            if (chooseWhen) {
                test.log(Status.PASS, Constants.CHOOSE_WHEN_SUCCESSFUL);

            }
        }

        boolean howToSend = false;
        try {
            SendGiftPage.howToSend(driver);
            howToSend = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.HOW_TO_SEND_FAIL + e.getMessage());
            howToSend = false;
        } finally {
            if (howToSend) {
                test.log(Status.PASS, Constants.HOW_TO_SEND_SUCCESSFUL);

            }
        }

        boolean enterDetailsAndSave = false;
        try {
            SendGiftPage.enterTelephoneFrom(driver);
            SendGiftPage.enterTelephoneFor(driver);
            SendGiftPage.pressSave(driver);
            enterDetailsAndSave = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.ENTER_DETAILS_AND_SAVE_FAIL + e.getMessage());
            enterDetailsAndSave = false;
        } finally {
            if (enterDetailsAndSave) {
                test.log(Status.PASS, Constants.ENTER_DETAILS_AND_SAVE_SUCCESSFUL);

            }
        }

        boolean submitGift = false;
        try {
            SendGiftPage.pressSubmit(driver);
            submitGift = true;

        } catch (Exception e) {

            e.printStackTrace();
            test.log(Status.FAIL, Constants.SUBMIT_GIFT_PAGE_FAIL + e.getMessage());
            submitGift = false;
        } finally {
            if (submitGift) {
                test.log(Status.PASS, Constants.SUBMIT_GIFT_PAGE_SUCCESSFUL);

            }
        }

        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
        test.pass(Constants.SCREENSHOT_SENDER_RECEIVER_PAGE, MediaEntityBuilder.createScreenCaptureFromPath(takeScreenShot(Constants.IMAGE_PATH + name.getMethodName())).build());

    }

    //Closing of browser + screenshot configurations + run report
    @AfterClass
    public static void close(){
        test.log(Status.INFO, Constants.INFO_TEXT);
        driver.quit();
        report.flush();
    }

    private static String takeScreenShot(String ImagesPath) {
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenShotFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File(ImagesPath+Constants.IMAGE_FORMAT);
        try {
            FileUtils.copyFile(screenShotFile, destinationFile);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return ImagesPath+Constants.IMAGE_FORMAT;
    }
}


