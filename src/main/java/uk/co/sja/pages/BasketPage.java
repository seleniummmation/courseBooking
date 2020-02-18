package uk.co.sja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import uk.co.sja.base.Base;
import static uk.co.sja.base.DriverContext.driver;

public class BasketPage extends Base {

    private By basketButton = By.xpath("//*[@id=\"sja-vuejs\"]/header/div[1]/div/nav/ul/li[3]/a");
    private static By basketContent = By.xpath("//*[@id=\"sja-vuejs\"]/div[3]/div/div/div[2]/div[1]/div/article/div[2]/div[1]/h3/span");


    public BasketPage clickBasketButton() {
        driver.findElement(basketButton).click();
        return this;
    }

    public String getBasketContent() {
        WebElement basket = driver.findElement(basketContent);
        return basket.getText();
        }
 }