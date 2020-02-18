Feature: Basket

  Background:
    Given I am on SJA home page

    Background:
  Scenario: Journey to basket page
    #Given I am on SJA home page
    When I enter 'avajneles@gmail.com', 'liamtoh@1liam' and submit form
    And l click basket button
    Then Basket content page is displayed


    Scenario: Journey to basket from course search page
      #Given I am on SJA home page
      When I complete booking a course
      Then Course booked is displayed in the basket