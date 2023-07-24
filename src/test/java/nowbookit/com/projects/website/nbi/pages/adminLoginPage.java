package nowbookit.com.projects.website.nbi.pages;

import nowbookit.com.keywords.WebUI;
import org.openqa.selenium.By;

public class adminLoginPage {
    private static By inputUser = By.xpath("//input[@name='username']");
    private static By inputPass = By.xpath("//input[@name='password']");
    private static By buttonSubmit = By.xpath("//button[text()='Login']");
    private By buttonAdminPortal = By.xpath("//button[text()='Admin Portal']");
    public static void submitUsernamePassword(){
        WebUI.setText(inputUser, "z.d.r.a.v.k.o.stojkoski@gmail.com");
        WebUI.setText(inputPass, "ThePassword01##!!");
        WebUI.clickElement(buttonSubmit);
    }


    public void clickOnOptionAdminPortal() {
        WebUI.clickElement(buttonAdminPortal);
    }
}
