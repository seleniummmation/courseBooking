Feature: Login

  Scenario: Journey to username page
    Given I am on SJA home page
    And l click login register
    When I enter 'avajneles@gmail.com', 'liamtoh@1liam' and submit form
    Then account is displayed on page
