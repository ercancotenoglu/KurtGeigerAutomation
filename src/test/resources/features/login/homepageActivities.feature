Feature: Homepage Activities


  @Carvela

 #*User Story: As a user, I should be able to see the list of Carvela brand products and the list of Carvela Bag products.

    Scenario: As a user, I should be able to see the list of Carvela brand products and the list of Carvela Bag products.
      Given I am on the homepage
      When  I select Carvela category from the header
      Then I should see the list of Carvela brand products
      And I select Bags from the list
      Then I should see the list of Carvela Bag products


  @Men

  #*User Story: As a user, I should be able to see the list of men category products and when I select boots i should see only boots products.

    Scenario: As a user, I should be able to see the list of men category products and when I select boots i should see only boots products.
      Given I am on the homepage
      And I select men category from the header
      Then I should see the list of products
      When I select boots category
      Then I should see only boots


  @Checkout

    #*User Story: As a user, I should be able to add a product to the bag and when I click 'Proceed to Checkout' I should be on checkout page.

    Scenario: As a user, I should be able to add a product to the bag and when I click 'Proceed to Checkout' I should be on checkout page.
      Given I am on the homepage
      Then I select men category from the header
      And I am on PDP
      When I select any colour and size for the chosen men category
      And I add the product to the bag
      Then I can see the bag with single item
      And I click Proceed to Checkout
      Then I should be on checkout page


