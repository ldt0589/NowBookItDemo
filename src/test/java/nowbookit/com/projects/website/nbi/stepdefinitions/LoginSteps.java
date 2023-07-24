package nowbookit.com.projects.website.nbi.stepdefinitions;

import nowbookit.com.hooks.TestContext;
import nowbookit.com.keywords.WebUI;
import nowbookit.com.projects.website.nbi.pages.adminLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSteps {
    adminLoginPage adminLoginPage;

    public LoginSteps(TestContext testContext) {
        adminLoginPage = testContext.getAdminPage();
    }

    @Given("User navigate to Login Page for Admin")
    public void userNavigateToLoginPageForAdmin() {
        WebUI.openAdminLoginPage();
    }

    @When("User submits correct Username and Password")
    public void userSubmitValidUsernameAndPassword(){
        adminLoginPage.submitUsernamePassword();
    }

    @And("click Login button")
    public void clickLoginButton() {
    }

    @And("User clicks on option Admin Portal")
    public void clickOnOptionAdminPortal() {
        adminLoginPage.clickOnOptionAdminPortal();
    }

}
