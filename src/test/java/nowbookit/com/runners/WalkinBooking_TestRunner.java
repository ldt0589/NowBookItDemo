package nowbookit.com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/resources/features/TC01_WalkinBooking.feature",
        glue = {"nowbookit.com.projects.website.nbi.stepdefinitions",
                "nowbookit.com.hooks"},
        plugin = {"nowbookit.com.hooks.CucumberListener",
                "pretty",
                "html:target/cucumber-reports/WalkinBooking_TestRunner.html",
                "json:target/cucumber-reports/WalkinBooking_TestRunner.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        , monochrome = true,
        tags = "@Regression or @Smoke"
)

public class WalkinBooking_TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("================ AFTER SUITE ================");
    }
}
