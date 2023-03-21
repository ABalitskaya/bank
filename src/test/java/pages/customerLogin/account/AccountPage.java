package pages.customerLogin.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;
import wait.Wait;

public class AccountPage extends PageBase {

    Wait wait;

    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@ng-click='byebye()']")
    protected WebElement logoutButton;

    public void waitForLoading() {
        wait = new Wait(driver);
        wait.forVisibility(logoutButton);
    }

}
