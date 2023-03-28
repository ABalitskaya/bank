package pages.customerLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;
import wait.Wait;

public class CustomerLoginPage extends PageBase {
    public CustomerLoginPage(WebDriver driver) {
        super(driver);
    }

    Wait wait;
    @FindBy(id = "userSelect")
    protected WebElement userSelect;

    @FindBy(xpath = "//*[@type='submit']")
    protected WebElement loginButton;

    public void waitForLoading() {
        wait = new Wait(driver);
        wait.forVisibility(userSelect);
    }

    public void selectExistingUser(String useName) {

        selectOption(useName, userSelect);
    }


    public void clickOnLoginButton() {
        click(loginButton);
    }

    public void checkForVisibilityLoginButton() {
        wait.forVisibility(loginButton);
    }

    public void loginButtonIsNotPresent() {
        wait.forInvisibility(loginButton);
        //return false;
    }

    public boolean loginButtonIsNotPresentNew() {
        wait.forInvisibility(loginButton);
        return false;
    }
}