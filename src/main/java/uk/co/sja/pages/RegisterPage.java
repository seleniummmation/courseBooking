package uk.co.sja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.sja.base.Base;
import static uk.co.sja.base.DriverContext.driver;

public class RegisterPage extends Base {

    private By firstName = By.id("User_FirstName");
    private By lastName = By.id("User_LastName");
    private By accountType = By.cssSelector("#User_AccountType");
    private By jobTitle = By.id("User_JobTitle");
    private By company = By.id("User_Company");
    private By email = By.id("User_Email");
    private By phoneNumber = By.id("User_PhoneNumber");
    private By password = By.id("User_Password");
    private By confirmPassword = By.id("User_ConfirmPassword");
    private By create = By.cssSelector("#sja-vuejs > div.block.block__layout.rowblockwithsidebar.block--grey.span-12 > div > div > div > div > article > div > form > div.form-group.sja__form__element.sja__form__button > div > input");
    private static By pageTitle = By.cssSelector(".block__title--large");


    public RegisterPage enterFirstName(String firstname) {
        driver.findElement(firstName).sendKeys(firstname);
        return this;
    }

    public RegisterPage enterLastName(String lastname) {
        driver.findElement(lastName).sendKeys(lastname);
        return this;
    }

    public RegisterPage selectAccountType(String accountTypeOption) {
        driver.findElement(accountType).sendKeys(accountTypeOption);
        return this;
    }

    public RegisterPage enterJobTitle(String jobtitle) {
        driver.findElement(jobTitle).sendKeys(jobtitle);
        return this;
    }

    public RegisterPage enterCompanyName(String companyTxt) {
        driver.findElement(company).sendKeys(companyTxt);
        return this;
    }

    public RegisterPage enterEmail(String emailTxt) {
        driver.findElement(email).sendKeys(emailTxt);
        return this;
    }

    public RegisterPage enterPhoneNumber(String phoneNumberTxt) {
        driver.findElement(phoneNumber).sendKeys(phoneNumberTxt);
        return this;
    }

    public RegisterPage enterPassword(String passwordTxt) {
        driver.findElement(password).sendKeys(passwordTxt);
        return this;
    }

    public RegisterPage confirmPassword(String confirmPasswordTxt) {
        driver.findElement(confirmPassword).sendKeys(confirmPasswordTxt);
        return this;
    }

    public RegisterPage clickCreate() {
        driver.findElement(create).click();
        return this;
    }

    public static String getPageTitle() {
        //new WebDriverWait(driver, 300).until(ExpectedConditions.presenceOfElementLocated(pageTitle));
        WebElement pageTit= driver.findElement(pageTitle);
        return pageTit.getText();
    }
}