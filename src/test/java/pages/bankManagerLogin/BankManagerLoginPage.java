package pages.bankManagerLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class BankManagerLoginPage extends PageBase {
    public BankManagerLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@ng-click='addCust()']")
    private WebElement addCustomerTab;

    @FindBy(xpath = "//*[@ng-click='openAccount()']")
    private WebElement openAccountTab;

    @FindBy(xpath = "//*[@ng-click='showCust()']")
    private WebElement customersTab;

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
