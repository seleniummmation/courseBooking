package uk.co.sja.domain;

import uk.co.sja.pages.CoursePage;

import static org.junit.Assert.assertEquals;

public class CourseDomain {

    CoursePage coursePage = new CoursePage();

    public CourseDomain searchYourWorkCourse ( String course, String location ) {

        coursePage.clickBookCourseLink();
        coursePage.selectWorkPlaceCourseDropDown(course);
        coursePage.enterLocationField(location);
        coursePage.clickSearchButton();
        return this;
    }

    public CourseDomain searchYourSchoolCourse ( String course, String location ) {
        coursePage.clickBookCourseLink()
                .clickYourSchoolTab()
                .selectSchoolCourseDropDown(course)
                .enterLocationField(location)
                .clickSearchButton();
        return this;
    }

    public CourseDomain searchJustYouCourse ( String course, String location ) {
        coursePage.clickBookCourseLink()
                .clickJustYouTab()
                .selectJustYouCourseDropDown(course)
                .enterLocationField(location)
                .clickSearchButton();
        return this;
    }

    public void verifyCourseSearch () {
        String expected = "Course Search";
        assertEquals(expected, coursePage.getCourseSearchText());
        System.out.println();
        coursePage.getCourseSearchText();
    }
}