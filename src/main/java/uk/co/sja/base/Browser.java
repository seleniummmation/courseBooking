package uk.co.sja.base;


import io.cucumber.java.Before;
import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import uk.co.sja.config.ConfigReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static uk.co.sja.base.DriverContext.driver;

public class Browser extends Base {

    private static final String CHROME_EXECUTABLE_PATH ="src//main//java//uk//co//sja//utilities//browserutil//chromedriver.exe";
    private static final String FIREFOX_EXECUTABLE_PATH ="src//main//java//uk//co//sja//utilities//browserutil//geckodriver.exe";
    private static final String IE_EXECUTABLE_PATH ="src//main//java/uk//co//sja//utilities//browserutil//IEDriverServer.exe";
    private static final String GLOBAL_PROPERTIES_PATH ="src//main//java//uk//co//sja//config//global.properties";

    @Before
    public static void startBrowserSession() throws IOException {

       ConfigReader.populateSettings();

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(GLOBAL_PROPERTIES_PATH);
        p.load(fis);
        p.getProperty("browser");

        if (p.getProperty("browser").contains("chrome")) {
            System.setProperty("webdriver.chrome.driver", CHROME_EXECUTABLE_PATH);
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless");
            driver = new ChromeDriver();

        } else if (p.getProperty("browser").contains("firefox")) {
            System.setProperty("webdriver.gecko.driver", FIREFOX_EXECUTABLE_PATH);
            driver = new FirefoxDriver();

        } else if (p.getProperty("browser").contains("ie")) {
            System.setProperty("webdriver.ie.driver", IE_EXECUTABLE_PATH);
            driver = new InternetExplorerDriver();
        }
    }

        @After
        public void closeBrowserSession(){
            driver.quit();
        }
    }
