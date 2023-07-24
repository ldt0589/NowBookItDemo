package nowbookit.com.projects.website.nbi.pages;

import nowbookit.com.keywords.WebUI;
import org.openqa.selenium.By;

public class adminDashboardPage {

    private By buttonMyPizzaShop = By.xpath("//td[text()='My Pizza Shop']");
    private By buttonOpenRestaurant = By.xpath("//button[text()='Open Restaurant']");
    private By buttonBookingWidget = By.xpath("//button[text()='Booking Widget']");
    private By buttonOpenBookingWidget = By.xpath("//button[text()='Open Booking Widget']");

    public void clickOnVenue() {
        WebUI.clickElement(buttonMyPizzaShop);
    }

    public void clickOnOpenRestaurant() {
        WebUI.clickElement(buttonOpenRestaurant);
    }

    public void clickOnBookingWidget() {
        WebUI.clickElement(buttonBookingWidget);
    }

    public void selectOptionOpenBookingWidget() {
        WebUI.clickElement(buttonOpenBookingWidget);
    }
}
