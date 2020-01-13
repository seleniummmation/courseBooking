package uk.co.sja.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static final String GLOBAL_PROPERTIES_PATH ="src//main//java//uk//co//sja//config//global.properties";

    public static void populateSettings() throws IOException {
        ConfigReader reader =new ConfigReader();
        reader.readProperty();
    }

    private void readProperty() throws IOException {

        Properties p = new Properties();
        FileInputStream fis = new FileInputStream(GLOBAL_PROPERTIES_PATH);
        p.load(fis);

        Settings.registerUrl= p.getProperty("registerUrl");
        Settings.siteUrl= p.getProperty("siteUrl");
    }
}
