Feature: As a user validates the login Functionality of salesforce application

 @TSC002 @SmokeTest
   #before
  Scenario: Error Message validation in login page
    #beforestep
    Given  user navigates to sales force application
   #afterstep
     #beforestep
    When user enter the user name "learnmore" and password "abc"
   #afterstep
     #beforestep
    And user clicks on login button
   #afterstep
     #beforestep
    Then user validate the error message
   #afterstep
  #after
  @TSC003 @RegressionTest
  Scenario Outline: login validation
    Given user navigates to sales force application
    When user enter the user name "<UserName>" and password "<Password>"
    And user clicks on login button
    Then user navigates to the home page of the application
    Examples:
      | UserName | Password |
      | Aravinth | 123      |
      | Learn    | abc      |
