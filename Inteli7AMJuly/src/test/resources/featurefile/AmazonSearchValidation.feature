Feature:  user validates the amazon search functionality

  Background:
    Given user search the product "iphone" and navigate to search result page

  @TSC001 @RegressionTest
  Scenario: Validate the search functionality with specific keywords
    Given user navigates to "https://www.amazon.in/"
    When user enters the "iphone" in search bar
    And user clicks on search icon
    Then user validates the search result

   @TSC005
  Scenario: Validate the sort by functionality

    When user sort by newest arrival
    Then validate whether thr newest arrival is selected

    @Multiple
  Scenario Outline: Validate the sort by functionality
    Given user search the product "<Product Name>" and navigate to search result page
    When user sort by newest arrival
    Then validate whether thr newest arrival is selected
    Examples:
      | Product Name |
      | iphone       |
      | Books        |
      | Stationary   |


  @LoginTest
  Scenario: Login
    Given user navigates to signin page
    When user enters the username and password
    Then validate whether the user navigate to signIn page

   @MouseAction
  Scenario: Mouse Action
    Given user handles the mouse action
     Then validate whether the user navigate to Babywishlist page

     @DragDrop
  Scenario:  Drag and Drop
   # Given  user drag and drop
  Given Hdfc link




