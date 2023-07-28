package nowbookit.com.projects.website.nbi.stepdefinitions;

import nowbookit.com.hooks.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingSteps {

    nowbookit.com.projects.website.nbi.pages.adminBookingPage adminBookingPage;

    public BookingSteps(TestContext testContext) {
        adminBookingPage = testContext.getAdminBookingPage();
    }

    @And("User clicks on Walk-in sign to open form New Booking")
    public void clickOnWalkInSign() {
        adminBookingPage.switchToBookingWindow();
        adminBookingPage.handleLoginPage();
        adminBookingPage.clickOnWalkInSign();
    }

    @And("User selects {string} in Booking tab")
    public void userSelectTableInBookingTab(String table) {
        adminBookingPage.openTabBooking();
        adminBookingPage.selectBookingTable(table);
    }

    @And("User enters {string} in Customer tab")
    public void userEntersInCustomerTab(String name) {

    }

    @And("User enters {string} and {string} in Customer tab")
    public void userEntersAndInCustomerTab(String name, String phone) {
        adminBookingPage.openTabCustomer();
        adminBookingPage.enterCustomerInformation(name, phone);
    }

    @And("User enters {string} in Notes tab")
    public void userEntersInNotesTab(String note) {
        adminBookingPage.openTabNotes();
        adminBookingPage.enterBookingNote(note);
    }

    @And("User clicks on button Save")
    public void userClicksOnButtonSave() {
        adminBookingPage.clickOnSave();
    }

    @Then("Verify that Walk-in Booking is created successfully")
    public void verifyThatWalkInBookingIsCreatedSuccessfullyWith() {
        adminBookingPage.openNewBooking();
        adminBookingPage.verifyBookingTableInfo();
        adminBookingPage.verifyBookingDetailsInfo();
        adminBookingPage.verifyBookingNotesInfo();
    }

    @Then("Verify that popup Booked displays")
    public void verifyThatPopupBookedDisplays() {
        adminBookingPage.verifyPopupBookedDisplays();
    }

    @And("User selects a date as today plus {int}")
    public void userSelectsADateAsTomorrow(int numberDay) {
        adminBookingPage.switchToBookingWindow();
        adminBookingPage.selectBookingDate(numberDay);
    }

    @And("User adds {string}")
    public void userAddsNumberOfPeopleComing(String numberPeople) {
        adminBookingPage.addNumberPeople(numberPeople);
    }

    @And("User selects the service {string}")
    public void userSelectsAService(String serviceName) {
        adminBookingPage.selectBookingService(serviceName);
    }

    @And("User selects a time")
    public void userSelectsATimeAs() {
        adminBookingPage.selectBookingTime();
    }

    @And("User clicks on button NEXT")
    public void userClicksOnButtonNext() {
        adminBookingPage.clickOnNext();
    }

    @And("User enters {string}, {string}, {string}, {string} in form Your Details")
    public void userEntersInFormYourDetails(String firstName, String lastName, String phone, String email) {
        adminBookingPage.enterYourDetails(firstName, lastName, phone, email);
    }

    @And("User clicks on button BOOK NOW")
    public void userClicksOnButtonBOOKNOW() {
        adminBookingPage.clickOnBookNow();
    }

    @Then("Verify that Thank You page displays")
    public void verifyThatThankYouPageDisplays() {
        adminBookingPage.verifyThankYouPageDisplays();
    }

    @And("Verify that Widget Booking is created successfully with date plus {int}")
    public void verifyThatWidgetBookingIsCreatedSuccessfullyWith(String firstName, String lastName, String phone, String service, String numberPeople, int numberDate) {
        adminBookingPage.openBookingDate(numberDate);
        adminBookingPage.openWidgetBookingDetail();
        adminBookingPage.verifyWidgetBookingCustomerInfo();
        adminBookingPage.verifyWidgetBookingServiceInfo();
        adminBookingPage.verifyWidgetBookingPeople();
        adminBookingPage.verifyWidgetBookingDate();
        adminBookingPage.verifyWidgetBookingTime();
    }

    @When("User navigate to Booking page")
    public void userNavigateToBookingPage() {
        adminBookingPage.openBookingPage();
    }

    @And("Verify that Widget Booking is created successfully with correct date time")
    public void verifyThatWidgetBookingIsCreatedSuccessfullyWithCorrectDateTime() {
        adminBookingPage.verifyWidgetBookingDate();
        adminBookingPage.verifyWidgetBookingTime();

    }
}
