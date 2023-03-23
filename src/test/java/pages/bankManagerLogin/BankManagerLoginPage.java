package pages.bankManagerLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;
import wait.Wait;

public class BankManagerLoginPage extends PageBase {
    public BankManagerLoginPage(WebDriver driver) {
        super(driver);
    }


    Wait wait;
    @FindBy(xpath = "//*[@ng-click='addCust()']")
    protected WebElement addCustomerTab;

    @FindBy(xpath = "//*[@ng-click='openAccount()']")
    protected WebElement openAccountTab;

    @FindBy(xpath = "//*[@ng-click='showCust()']")
    protected WebElement customersTab;

    public void waitForLoading() {
        wait = new Wait(driver);
        wait.forVisibility(addCustomerTab);
        wait.forVisibility(openAccountTab);
        wait.forVisibility(customersTab);
    }

    public void openAddCustomerTab() {
        click(addCustomerTab);
    }

    public void openAccountTab() {
        click(openAccountTab);
    }

    public void openCustomersTab() {
        click(customersTab);
    }


}
