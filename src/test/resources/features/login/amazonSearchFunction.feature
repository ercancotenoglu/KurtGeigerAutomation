
@Search
Feature: Amazon Search Function Activities


  #*User Story: As a user, when I search any item on Amazon I should be able to see the list of products. (positive testing)

  Scenario: As a user, when I search any item on amazon I should be able to see the list of products.
    Given I'm on amazon's homepage.
    When  I navigate to search button of the amazon.
    Then I enter the product i am looking for "children'sbooks"
    And Hit the Enter or Click Submit button
    Then I should see the list of "children's books" products




      #*User Story: As a user, when I go to search function on amazon and enter NO any product name the system still should stay on the main page and show NO any specific product. (negative testing)

  Scenario: As a user, when I go to search function on amazon and enter NO any product name the system still should stay on the main page and show NO any specific product.
    Given I'm on amazon's homepage.
    When  I navigate to search button of the amazon.
    Then I enter NO any product name.
    And Hit the Enter or Click Submit button
    Then I should still see the main page with no any specific product.