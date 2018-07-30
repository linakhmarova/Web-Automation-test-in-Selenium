import org.openqa.selenium.By;

public class Constants {

    //Before_Class
    public static final String REPORTER_PATH = "/home/misha/Downloads/report.html";
    public static final String TEST_NAME = "BuyMe.co.il Test";
    public static final String TEST_DESCRIPTION = "Testing of buying gift on buyme.co.il";
    public static final String INFO_KEY = "Distribution type";
    public static final String INFO_VALUE = "Private";
    public static final String INFO_KEY2 = "Tester";
    public static final String INFO_VALUE2 = "Angelina";
    public static final String LOG_INFO = "@BeforeClass";

    public static final String PROPERTY = "webdriver.chrome.driver";
    public static final String PROPERTY_2 = "/home/misha/Downloads/chromedriver";
    public static final String URL = "URL";
    public static final String XML_FILE = "/home/misha/Documents/SeleniumExam/config.xml";

    public static final String DRIVER_STATUS = "Cant connect chromeDriver";
    public static final String DRIVER_FAIL = "Driver Connection Failed! ";
    public static final String DRIVER_SUCCESSFUL = "Driver established successfully";

    public static final String PAGE_FAIL = "BuyMe page was not found ";
    public static final String PAGE_SUCCESSFUL = "buyme.co.il opened successfully";

    public static final String IMAGE_PATH = "/home/misha/Pictures/Reports/";

    //Registration_Test_01
    public static final String OPEN_LINK = "my-account";
    public static final String OPEN_LINK_FAIL = "Entrance/LogIn page was not found ";
    public static final String OPEN_LINK_SUCCESSFUL = "Entrance/LogIn page opened successfully";

    public static final String SIGN_IN = "header-link";
    public static final String SIGN_IN_FAIL = "SignIn page was not found ";
    public static final String SIGN_IN_SUCCESSFUL = "SignIn page opened successfully";

    public static final String ID_NAME = "ember886";
    public static final String ID_EMAIL = "ember887";
    public static final String ID_PASSWORD = "valPass";
    public static final String ID_PASSWORD_AGAIN = "ember889";

    public static final String MY_NAME = "Angelina";
    public static final String MY_EMAIL = "lol" + Math.round(Math.random()*100) + "@gmail.com";
    public static final String MY_PASSWORD = "Lol12345";

    public static final By RADIO_BUTTON = By.xpath("//label[@for='register-consent']");
    public static final By SUBMIT_BUTTON = By.xpath("//button[@type='submit']");

    public static final String REGISTRATION_FAIL = "Registration doesn't complete ";
    public static final String REGISTRATION_SUCCESSFUL = "Registration was done successfully";

    public static final String SCREENSHOT_REGISTRATION = "Registration page with credentials";

    //HomeScreen_Test_02
    public static final By PRESS_PRICE = By.linkText("סכום");
    public static final By CHOOSE_PRICE = By.xpath("//li[@data-option-array-index='3']");

    public static final String PRESS_AREA = "אזור";
    public static final By CHOOSE_AREA = By.xpath("//li[@data-option-array-index='2']");

    public static final String PRESS_TYPE = "קטגוריה";
    public static final By CHOOSE_TYPE = By.xpath("//li[@data-option-array-index='4']");

    public static final String HOMESCREEN_DROPDOWN_FAIL = "Dropdown submit was failed ";
    public static final String HOMESCREEN_DROPDOWN_SUCCESSFUL = "Dropdown submit was done successfully";

    public static final String SCREENSHOT_DROPDOWN = "Home page with chosen dropdown";

    //GiftScreen_Test_03
    public static final String CURRENT_URL = "https://buyme.co.il/search?budget=3&category=5&region=11";

    public static final String ASSERT_FAIL = "Assert was failed ";
    public static final String ASSERT_SUCCESSFUL = "Assert was done successfully";

    public static final By MY_CHOICE = By.linkText("מסעדת אורבנו");
    public static final String PRESS_CHOICE_FAIL = "Press Choice was failed ";
    public static final String PRESS_CHOICE_SUCCESSFUL = "Press Choice was done successfully";

    public static final By TYPE_CHOICE = By.xpath("//a[@href='https://buyme.co.il/package/1574805/1574930']");
    public static final String CHOOSE_TYPE_FAIL = "Choose Type was failed ";
    public static final String CHOOSE_TYPE_SUCCESSFUL = "Choose Type was done successfully";

    public static final String SCREENSHOT_YOUR_CHOICE = "Chosen gift";

    //SendGiftPage_Test_04
    public static final By CHOOSE_FOR_WHOM = By.xpath("//label[@data='forSomeone']");
    public static final String CHOOSE_FOR_WHOM_FAIL = "Choose For Whom was failed ";
    public static final String CHOOSE_FOR_WHOM_SUCCESSFUL = "Choose For Whom was done successfully";

    public static final By NAME_FOR_WHOM = By.xpath("//input[@data-parsley-required-message='מי הזוכה המאושר? יש להשלים את שם המקבל/ת']");
    public static final By NAME_FROM_WHO = By.xpath("//input[@data-parsley-required-message='למי יגידו תודה? שכחת למלא את השם שלך']");
    public static final String NAMES_FOR_FROM_FAIL = "Entering names was failed ";
    public static final String NAMES_FOR_FROM_SUCCESSFUL = "Entering names was done successfully";

    public static final String WHICH_EVENT = "לאיזה אירוע?";
    public static final String CHOOSE_EVENT_FAIL = "Choosing of event was failed ";
    public static final String CHOOSE_EVENT_SUCCESSFUL = "Choosing of event was done successfully";

    public static final By BLESSING_FIELD = By.xpath("//textarea[@rows='4']");
    public static final String ADD_BLESSING_FAIL = "Adding of blessing was failed ";
    public static final String ADD_BLESSING_SUCCESSFUL = "Adding of blessing was done successfully";

    public static final By UPLOAD_IMAGE = By.xpath("//input[@name='fileUpload']");
    public static final String UPLOAD_IMAGE_FAIL = "Uploading of image was failed ";
    public static final String UPLOAD_IMAGE_SUCCESSFUL = "Uploading of image was done successfully";

    public static final By CHOOSE_WHEN = By.xpath("//label[@class='send-now']");
    public static final String CHOOSE_WHEN_FAIL = "Choose When was failed ";
    public static final String CHOOSE_WHEN_SUCCESSFUL = "Choose When was done successfully";

    public static final String HOW_TO_SEND = "icon-sms";
    public static final String HOW_TO_SEND_FAIL = "How To Send was failed ";
    public static final String HOW_TO_SEND_SUCCESSFUL = "How To Send was done successfully";

    public static final By TELEPHONE_FROM = By.xpath("//input[@data-parsley-mobile='mobile']");
    public static final String TELEPHONE_FOR = "resendReciver";

    public static final String FOR_NAME = "Michael";
    public static final String FROM_NAME = "Angelina";
    public static final By MY_EVENT = By.xpath("//li[@data-option-array-index='1']");
    public static final String MY_BLESSING = "Congratulations!Happy Birthday!You're the BEST!";
    public static final String MY_IMAGE = "/home/misha/Documents/SeleniumExam/happy-birthday-card.jpg";
    public static final String FROM_TELEPHONE = "0554488777";
    public static final String FOR_TELEPHONE = "0557778844";

    public static final String SAVE_BUTTON = "btn-save";
    public static final String ENTER_DETAILS_AND_SAVE_FAIL = "Entering Details and Saving was failed ";
    public static final String ENTER_DETAILS_AND_SAVE_SUCCESSFUL = "Entering Details and Saving was done successfully";

    public static final By SUBMIT_GIFT_PAGE = By.xpath("//button[@data-target='#forgot-password']");
    public static final String SUBMIT_GIFT_PAGE_FAIL = "Submit of Gift Page was failed ";
    public static final String SUBMIT_GIFT_PAGE_SUCCESSFUL = "Submit of Gift Page was done successfully";

    public static final String SCREENSHOT_SENDER_RECEIVER_PAGE = "Sender & Receiver page";

    //AfterClass
    public static final String INFO_TEXT = "@AfterClass";
    public static final String IMAGE_FORMAT = ".png";
}
