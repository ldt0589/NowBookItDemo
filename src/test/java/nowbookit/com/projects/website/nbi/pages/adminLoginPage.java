package nowbookit.com.projects.website.nbi.pages;

import nowbookit.com.constants.FrameworkConstants;
import nowbookit.com.keywords.WebUI;
import org.openqa.selenium.By;

public class adminLoginPage {
    private static By inputUser = By.xpath("//input[@name='username']");
    private static By inputPass = By.xpath("//input[@name='password']");
    private static By buttonSubmit = By.xpath("//button[text()='Login']");
    private By buttonAdminPortal = By.xpath("//button[text()='Admin Portal']");
    public static void submitUsernamePassword(){
        WebUI.setText(inputUser, FrameworkConstants.USERNAME);
        WebUI.setText(inputPass, FrameworkConstants.PASSWORD);
        WebUI.clickElement(buttonSubmit);
    }


    public void clickOnOptionAdminPortal() {
        WebUI.clickElement(buttonAdminPortal);
    }
}
