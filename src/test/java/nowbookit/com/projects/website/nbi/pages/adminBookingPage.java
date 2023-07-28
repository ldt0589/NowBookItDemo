package nowbookit.com.projects.website.nbi.pages;

import nowbookit.com.keywords.WebUI;
import nowbookit.com.projects.website.nbi.model.Booking;
import org.openqa.selenium.By;

import static nowbookit.com.constants.FrameworkConstants.WAIT_EXPLICIT;
import static nowbookit.com.utils.DataGenerateUtils.randomNumberIntFromTo;

public class adminBookingPage {
    private By buttonWalkIn = By.xpath("//button[contains(@data-e2e,'walkIn')]");
    private By tabBooking = By.xpath("//md-tab-item[contains(.,'Booking')]");
    private By dropdownTable = By.xpath("//md-select[@placeholder='Table']");
    private By listOptionTable = By.xpath("//md-option[@class='md-ink-ripple']/div[@class='md-text']");
    private By tabCustomer = By.xpath("//md-tab-item[contains(.,'Customer')]");
    private By inputName = By.xpath("//input[@name='firstName']");
    private By tabDetails = By.xpath("//md-tab-item/div[@data-e2e-tab-label='details']");
    private By inputPhone = By.xpath("//input[@name='phone']");
    private By tabNotes = By.xpath("//md-tab-item[contains(.,'Notes')]");
    private By inputNote = By.xpath("//md-input-container[contains(.,'Booking Notes')]/div/textarea");
    private By buttonSave = By.xpath("//button[.='Save']");
    private By popupBooked = By.xpath("//booking-dialog-header//h2[text()='BOOKED']");
    private By newBookingItem = By.xpath("//booking-dialog-header/following-sibling::div[contains(@class,'new-booking')]");
    private By inputBookedTable = By.xpath("//div[contains(@class,'TableSeater')]/span[contains(@class,'TableSeater')]");
    private By inputBookedName = By.xpath("//customer-details-basic-editor//label[text()='Name']/following-sibling::div/input");
    private By inputBookedPhone = By.xpath("//customer-details-basic-editor//label[text()='Phone']/following-sibling::div/input");
    private By inputBookedNote = By.xpath("//md-input-container/label[text()='Booking Notes']/following::div[@class='display']");
    private int randomNumber = randomNumberIntFromTo(10000, 99999);
    private By buttonTomorrow = By.xpath("//button[contains(@class,'daySelected')]/ancestor::div[1]/following-sibling::div[1]");
    private By inputNumberPeople = By.xpath("//input[@type='number']");
    private By buttonPlusPeople = By.xpath("//button[@data-testid='plusBtn']");
    private By buttonNext = By.xpath("//button[@data-testid='nextBtn']");
    private By radioService = By.xpath("//input[@name='services']");
    private By inputFistName = By.xpath("//input[@id='firstName']");
    private By inputLastName = By.xpath("//input[@id='lastName']");
    private By inputEmail = By.xpath("//input[@id='email']");
    private By spanTerm = By.xpath("//span[text()='I agree to the booking terms and conditions.']");
    private By titleThanks = By.xpath("//h2[text()='Thank you']");
    private By buttonNextDay = By.xpath("//button[@aria-label='next day']");
    private By buttonBookingTime = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-3'][1]");
    private By headerBookingDetail = By.xpath("//md-dialog//button[contains(@class,'toolbar-header')]");
    private By buttonOpenRestaurant = By.xpath("//button[text()='Open Restaurant']");
    private By inputUser = By.xpath("//input[@name='username']");
    private Booking objectBooking = new Booking();

    public void clickOnWalkInSign() {
        WebUI.smartWait();
        WebUI.waitForElementVisible(buttonWalkIn, WAIT_EXPLICIT*20);
        WebUI.clickElement(buttonWalkIn);
    }

    public void switchToBookingWindow() {
        WebUI.switchToLastWindow();
    }

    public void openTabBooking() {
        WebUI.clickElement(tabBooking);
    }

    public void selectBookingTable(String table) {
        WebUI.clickElement(dropdownTable);
        WebUI.selectOptionDynamic(listOptionTable, table);
        objectBooking.setTable(table);
    }

    public void openTabCustomer() {
        WebUI.clickElement(tabCustomer);
    }

    public void enterCustomerInformation(String prefixName, String phone) {
        WebUI.setText(inputName , prefixName + randomNumber);
        WebUI.setText(inputPhone, phone);
        objectBooking.setFirstName(prefixName + randomNumber);
        objectBooking.setPhone(phone);
    }

    public void openTabNotes() {
        WebUI.clickElement(tabNotes);
    }

    public void enterBookingNote(String note) {
        WebUI.setText(inputNote, note);
        objectBooking.setNote(note);
    }

    public void clickOnSave() {
        WebUI.clickElement(buttonSave);
    }

    public void verifyPopupBookedDisplays() {
        WebUI.verifyElementPresent(popupBooked);
    }

    public void openNewBooking() {
        WebUI.clickElement(newBookingItem);
    }

    public void verifyBookingTableInfo() {
        WebUI.verifyElementTextEquals(inputBookedTable, objectBooking.getTable());
    }

    public void verifyBookingDetailsInfo() {
        WebUI.clickElement(tabDetails);
        WebUI.verifyElementAttributeValue(inputBookedName, "value", objectBooking.getFirstName());
        WebUI.verifyElementAttributeValue(inputBookedPhone, "value", objectBooking.getPhone());
    }

    public void verifyBookingNotesInfo() {
        WebUI.clickElement(tabNotes);
        WebUI.verifyElementTextEquals(inputBookedNote, objectBooking.getNote());
    }

    public void selectBookingDate(int numberDay) {
        WebUI.clickElement(By.xpath("//button[contains(@class,'daySelected')]/ancestor::div[1]/following-sibling::div[" + numberDay + "]"));
    }

    public void selectBookingTime() {
        WebUI.clickElement(buttonBookingTime);
        objectBooking.setTime(WebUI.getAttributeElement(buttonBookingTime, "value"));
    }

    public void clickOnNext() {
        WebUI.clickElement(buttonNext);
    }

    public void selectBookingService(String serviceName) {
        WebUI.clickElement(By.xpath("//span[text()='" + serviceName + "']"));
        objectBooking.setService(serviceName);
    }

    public void addNumberPeople(String numberPeople) {
        for(int i=0;i<Integer.parseInt(numberPeople);i++)
            WebUI.clickElement(buttonPlusPeople);
    }

    public void enterYourDetails(String firstName, String lastName, String phone, String email) {
        WebUI.setText(inputFistName, firstName + randomNumber);
        WebUI.setText(inputLastName, lastName + randomNumber);
        WebUI.setText(inputPhone, phone);
        WebUI.setText(inputEmail, email);
        WebUI.clickElement(spanTerm);
        objectBooking.setFirstName(firstName + randomNumber);
        objectBooking.setLastName(lastName + randomNumber);
        objectBooking.setPhone(phone);
        objectBooking.setEmail(email);
    }

    public void clickOnBookNow() {
        WebUI.clickElement(buttonNext);
    }

    public void verifyThankYouPageDisplays() {
        WebUI.verifyElementPresent(titleThanks);
    }

    public void openBookingPage() {
//        WebUI.switchToMainWindow();
//        WebUI.clickElement(buttonOpenRestaurant);
//        switchToBookingWindow();
        WebUI.openBookingPage();
        adminLoginPage.submitUsernamePassword();
    }

    public void openBookingDate(int numberDate) {
        WebUI.waitForPageLoaded();
        for(int i=0; i<numberDate; i++)
            WebUI.clickElement(buttonNextDay);
    }

    public void openWidgetBookingDetail() {
        WebUI.clickElement(By.xpath("//md-list-item//span[text()='"+ objectBooking.getFirstName() + " " + objectBooking.getLastName() +"']"));
    }

    public void verifyWidgetBookingCustomerInfo() {
        WebUI.verifyElementTextContains(headerBookingDetail, objectBooking.getFirstName());
        WebUI.verifyElementTextContains(headerBookingDetail, objectBooking.getLastName());
        WebUI.verifyElementTextContains(headerBookingDetail, objectBooking.getPhone());

    }

    public void verifyWidgetBookingServiceInfo() {
        WebUI.verifyElementExists(By.xpath("//span[text()='" + objectBooking.getService() + "']"));
    }

    public void verifyWidgetBookingPeople() {
        //verify Widget booking number people is correct
    }
    public void verifyWidgetBookingDate() {
        //verify Widget booking date is correct
    }

    public void verifyWidgetBookingTime() {
        //verify Widget booking time is correct
    }

    public void handleLoginPage() {
        WebUI.smartWait();
        if(WebUI.isElementVisible(inputUser, WAIT_EXPLICIT*10))
            adminLoginPage.submitUsernamePassword();
    }
}
