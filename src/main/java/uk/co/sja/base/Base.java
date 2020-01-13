package uk.co.sja.base;

import org.openqa.selenium.support.PageFactory;

public class Base {

    public void iniialise(){
        PageFactory.initElements(DriverContext.driver, this);
    }
}
