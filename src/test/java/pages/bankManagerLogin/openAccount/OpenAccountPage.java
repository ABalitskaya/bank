package pages.bankManagerLogin.openAccount;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;
import wait.Wait;

public class OpenAccountPage extends PageBase {
    public OpenAccountPage(WebDriver driver) {
        super(driver);
    }

    Wait wait;

    @FindBy(xpath = "//select[@id='userSelect']")
    protected WebElement customerNameDropdown;

    @FindBy(xpath = "//select[@id='currency']")
    protected WebElement currencyDropdown;

    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement processButton;


    public void waitForLoading() {
        wait = new Wait(driver);
        wait.forVisibility(customerNameDropdown);
        wait.forVisibility(currencyDropdown);
        wait.forVisibility(processButton);
    }

    public void selectExistingUser(String userName) {
        selectOption(userName, customerNameDropdown);
    }

    public void selectCurrency(String currency) {
        selectOption(currency, currencyDropdown);
    }

    public void clickOnProcessButton() {
        click(processButton);
    }
}
