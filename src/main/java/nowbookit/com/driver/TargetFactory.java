/*
 * Copyright (c) 2022.
 * Automation Framework Selenium - Demo
 */

package nowbookit.com.driver;

import nowbookit.com.constants.FrameworkConstants;
import nowbookit.com.enums.Target;
import nowbookit.com.exceptions.TargetNotValidException;
import nowbookit.com.utils.LogUtils;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class TargetFactory {

    public WebDriver createInstance() {
        Target target = Target.valueOf(FrameworkConstants.TARGET.toUpperCase());
        WebDriver webdriver;

        switch (target) {
            case LOCAL:
                //Create new driver from Enum setup in BrowserFactory class
                webdriver = BrowserFactory.valueOf(FrameworkConstants.BROWSER.toUpperCase()).createDriver();
                break;
            default:
                throw new TargetNotValidException(target.toString());
        }
        return webdriver;
    }

    public WebDriver createInstance(String browser) {
        Target target = Target.valueOf(FrameworkConstants.TARGET.toUpperCase());
        WebDriver webdriver;

        switch (target) {
            case LOCAL:
                //Create new driver from Enum setup in BrowserFactory class
                webdriver = BrowserFactory.valueOf(browser.toUpperCase()).createDriver();
                break;
            default:
                throw new TargetNotValidException(target.toString());
        }
        return webdriver;
    }

}