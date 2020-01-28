package uk.co.sja.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.sja.base.Base;

import static uk.co.sja.base.DriverContext.driver;

public class LoginPage extends Base {

    private By emailTxt = By.name("email");
    private By pwrd = By.name("password");
    private By logInButton = By.xpath("//*[@id=\"sja-vuejs\"]/div[2]/section/div/div/div/form/div[5]/button");
    private static By userAccount = By.xpath("//*[@id=\"sja-vuejs\"]/header/div[1]/div/nav/ul/li[2]/a/span");


    public LoginPage enterEmail(String email) {
        driver.findElement(emailTxt).sendKeys(email);
        return this;
    }

    public LoginPage pwrd(String password) {
        driver.findElement(pwrd).sendKeys(password);
        return this;
    }

    public LoginPage clickLogInButton() {
        driver.findElement(logInButton).click();
        return this;
    }

        public String getAccount() {
        //new WebDriverWait(driver, 300).until(ExpectedConditions.presenceOfElementLocated(pageTitle));
            WebElement account = driver.findElement(userAccount);

        return account.getText();
    }

}

