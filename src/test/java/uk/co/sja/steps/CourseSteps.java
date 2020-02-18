package uk.co.sja.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import uk.co.sja.domain.CourseDomain;
import uk.co.sja.pages.CoursePage;
import uk.co.sja.pages.HomePage;

public class CourseSteps {


        HomePage homePage = new HomePage();
        CourseDomain courseDomain = new CourseDomain();
        CoursePage coursePage = new CoursePage();

        @When("I search for a work place course {string}, enter location {string} and submit")
        public void iSearchForAWorkPlaceCourseEnterLocationLondonAndSubmit(String course, String location) {
             courseDomain.searchYourWorkCourse(course, location);
        }

        @When("I search for a school course {string}, enter location {string} and submit")
        public void iSearchForASchoolCourseYouthMentalHealthFirstAidDayEnterLocationLondonAndSubmit(String course, String location ) {
                courseDomain.searchYourSchoolCourse(course, location);
        }

        @When("I search for just you course {string}, enter location {string} and submit")
        public void iSearchForJustYouCourseBasicSportsFirstAidEnterLocationLondonAndSubmit (String course, String location) {
                courseDomain.searchJustYouCourse(course, location);
        }

        @Then("Course search title is displayed")
        public void courseSearchTitleIsDisplayed() {
                courseDomain.verifyCourseSearch();
        }

}