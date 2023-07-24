package nowbookit.com.projects.website.nbi.stepdefinitions;

import nowbookit.com.hooks.TestContext;
import nowbookit.com.projects.website.nbi.pages.adminDashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DashboardSteps {
    adminDashboardPage adminDashboardPage;

    public DashboardSteps(TestContext testContext) {
        adminDashboardPage = testContext.getAdminDashboardPage();
    }

    @And("User clicks on venue My Pizza Shop")
    public void clickOnVenue() {
        adminDashboardPage.clickOnVenue();
    }

    @And("User clicks on button Open Restaurant to open Booking Page")
    public void clickOnButtonOpenRestaurant() {
        adminDashboardPage.clickOnOpenRestaurant();
    }

    @When("User clicks on button Booking Widget")
    public void userClicksOnButtonBookingWidget() {
        adminDashboardPage.clickOnBookingWidget();
    }

    @When("User selects option Open Booking Widget")
    public void userSelectsOptionOpenBookingWidget() {
        adminDashboardPage.selectOptionOpenBookingWidget();
    }
}
