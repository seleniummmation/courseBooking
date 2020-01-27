package uk.co.sja.pages;

import org.openqa.selenium.By;
import uk.co.sja.config.Settings;
import uk.co.sja.base.Base;
import uk.co.sja.config.Settings;

import java.io.IOException;

import static uk.co.sja.base.Browser.startBrowserSession;
import static uk.co.sja.base.DriverContext.driver;

public class HomePage extends Base {

    private By login_register = By.className("js-modal-trigger");

    public HomePage visit() throws IOException {
       startBrowserSession();
        driver.get(Settings.siteUrl);
        ///driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        return this;
    }

    public HomePage registerUrl(){
        driver.get(Settings.registerUrl);
        return this;
    }

    public HomePage clickLoginRegisterLink() {
        driver.findElement(login_register).click();
        return this;
    }
}