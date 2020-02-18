Feature: Book a Course

  Background:
    Given I am on SJA home page

  Scenario: Search for Your Work course
    When I search for a work place course 'Emergency First Aid at Work', enter location 'London' and submit
    Then Course search title is displayed

  Scenario: Search for Your School course
    When I search for a school course 'Youth Mental Health First Aid - 1 Day', enter location 'London' and submit
    Then Course search title is displayed

    Scenario: Search for Just You course
      When I search for just you course 'Basic sports first aid', enter location 'London' and submit
      Then Course search title is displayed


