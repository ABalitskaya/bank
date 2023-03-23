package pages.bankManagerLogin.addCustomer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;
import wait.Wait;

public class AddCustomerPage extends PageBase {
    public AddCustomerPage(WebDriver driver) {
        super(driver);
    }

    Wait wait;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    protected WebElement firstNameField;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    protected WebElement lastNameField;
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    protected WebElement postCodeField;
    @FindBy(xpath = "//button[@type='submit']")
    protected WebElement addCustomerButton;

    public void waitForLoading() {
        wait = new Wait(driver);
        wait.forVisibility(firstNameField);
        wait.forVisibility(lastNameField);
        wait.forVisibility(postCodeField);
        wait.forVisibility(addCustomerButton);
    }

    public void fillAddCustomerForm(String firstName, String lastName, String postCode) {
        fillField(firstNameField, firstName);
        fillField(lastNameField, lastName);
        fillField(postCodeField, postCode);
    }

    public void clickOnAddCustomerButton() {
        click(addCustomerButton);
    }
}