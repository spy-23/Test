Feature: Login
  @Text
  Scenario: Login Functionality
    Given user navigates to the website javatpoint.com
    And there user logs in through Login Window by using Username as "USER" and Password as "PASSWORD"
    Then login must be successful.

  @Text2
  Scenario: Login Functionality two
    Given user navigates to the website javatpoint.com
    And there user logs in through Login Window by using Username as "USER" and Password as "PASSWORD"
    Then login must be successful.