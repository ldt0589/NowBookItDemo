package nowbookit.com.hooks;

import nowbookit.com.driver.DriverManager;
import nowbookit.com.driver.TargetFactory;
import nowbookit.com.projects.website.nbi.pages.*;
import nowbookit.com.utils.LogUtils;
import org.openqa.selenium.WebDriver;

public class TestContext {

    private WebDriver driver;

    public TestContext() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
//        driver = ThreadGuard.protect(new TargetFactory().createInstance());
        driver = new TargetFactory().createInstance();
        driver.manage().window().maximize();
        DriverManager.setDriver(driver);
        LogUtils.info("Driver in TestContext: " + getDriver());
    }

    private nowbookit.com.projects.website.nbi.pages.adminLoginPage adminLoginPage;
    private nowbookit.com.projects.website.nbi.pages.adminDashboardPage adminDashboardPage;

    private nowbookit.com.projects.website.nbi.pages.adminBookingPage adminBookingPage;

    public adminBookingPage getAdminBookingPage() {
        if (adminBookingPage == null) {
            adminBookingPage = new adminBookingPage();
        }
        return adminBookingPage;
    }

    public adminDashboardPage getAdminDashboardPage() {
        if (adminDashboardPage == null) {
            adminDashboardPage = new adminDashboardPage();
        }
        return adminDashboardPage;
    }

    public adminLoginPage getAdminPage() {
        if (adminLoginPage == null) {
            adminLoginPage = new adminLoginPage();
        }
        return adminLoginPage;
    }

    public WebDriver getDriver() {
        return DriverManager.getDriver();
    }

}
