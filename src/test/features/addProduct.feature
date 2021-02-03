Feature: I should be able to Add Products to the System

  @Add
  Scenario: Validating the Add Product button
    Given Im on the Invoice Management homepage
    When I click on Products
    And click on Add Product button
    And I enter the Name"123456"
    And I enter the details"SOAP"
    And I enter the price"100.00"
    And I click on Add Product
    Then The product is added successfully and I get a message"Product successfully added"