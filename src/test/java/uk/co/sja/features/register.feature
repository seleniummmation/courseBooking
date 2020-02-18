@regression
Feature: Registration

  #Background:
    #Given I am on SJA home page

  Background:
  #Scenario: Journey to registration page
    Given I am on SJA home page
    When I navigate to registration page
    Then Register title is displayed

  Scenario: Account Registration with single data
   And I navigate to registration page
    When I complete registration 'Ed', 'sonnie', 'individual', 'Mr', 'Learning LTD', 'tunde@yu.co', '02083167808', 'password', 'password' and submit form
   #Then A new page is displayed

  Scenario Outline: Account Registration with multiple data set
    And I navigate to registration page
    When I register '<firstname>', '<lastname>', '<companytype>', '<jobtitle>', '<company>', '<email>', '<phonenumber>' '<password>', '<confirmpassword>' and submit form
    #Then A new page is displayed
    Examples:
      | firstname | lastname | companytype | jobtitle | company | email       | phonenumber | password | confirmpassword |
      | ola       | sonnie   | individual  | mr       | mySelf  | my@self.net | 098765432   | pass     | pass            |
      | olu       | tunde    | company     | Mr       | WeLearn | we@yu.com   | 12345678907 | passw    | passw           |