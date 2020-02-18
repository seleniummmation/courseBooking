package uk.co.sja.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import uk.co.sja.base.Base;

import static uk.co.sja.base.DriverContext.driver;

public class CoursePage extends Base {

//Your School Tab WebElement
    private By bookCourseLink = By.xpath("//*[@id=\"sja-vuejs\"]/header/div[2]/div/nav/ul/li[3]/a");
    private By workPlaceCourseDropDown = By.name("Select course");
    private By locationField = By.name("location");
    private By searchButton = By.xpath("//*[@id=\"sja-vuejs\"]/main/div[2]/section/div/div/aside/div/div/div/div[2]/article/form/div/button");
    private static By courseSearchText = By.xpath("//*[@id=\"sja-vuejs\"]/main/div/div/div[1]/div/div/h1");

//Your School Tab WebElement
    private By yourSchoolTab = By.xpath("//*[@id=\"sja-vuejs\"]/main/div[1]/section/div/div/aside/div/div/form/div[2]/div[2]/a");
    private By schoolCourseDropDown = By.xpath("//*[@id=\"sja-vuejs\"]/main/div[1]/section/div/div/aside/div/div/form/div[3]/div[2]/div/div/select");

//Just You Tab WebElement
    private By justYouTab = By.xpath("//*[@id=\"sja-vuejs\"]/main/div[1]/section/div/div/aside/div/div/form/div[2]/div[3]/a");
    private By justYouCourseDropDown = By.xpath("//*[@id=\"sja-vuejs\"]/main/div[1]/section/div/div/aside/div/div/form/div[3]/div[3]/div/div/select");

    public CoursePage clickBookCourseLink () {
        driver.findElement(bookCourseLink).click();
        return this;
    }

    public CoursePage selectWorkPlaceCourseDropDown ( String course ) {
        driver.findElement(workPlaceCourseDropDown).sendKeys(course);
        return this;
    }

    public CoursePage enterLocationField ( String locations ) {
        driver.findElement(locationField).sendKeys(locations);
        return this;
    }

    public CoursePage clickSearchButton () {
        driver.findElement(searchButton).click();
        return this;
    }

    public CoursePage clickYourSchoolTab () {
        driver.findElement(yourSchoolTab).click();
        return this;
    }

    public CoursePage selectSchoolCourseDropDown ( String course ) {
        driver.findElement(schoolCourseDropDown).sendKeys(course);
        return this;
    }

    public CoursePage clickJustYouTab () {
        driver.findElement(justYouTab).click();
        return this;
    }

    public CoursePage selectJustYouCourseDropDown ( String course) {
        driver.findElement(justYouCourseDropDown).sendKeys(course);
        return this;
    }

    public String getCourseSearchText () {
        WebElement course = driver.findElement(courseSearchText);
        return course.getText();
    }
}