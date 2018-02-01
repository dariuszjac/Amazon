Feature: AmazonFeature
  This is example

  Scenario: Open Amazon, order a product and check if parameters in the cart are correct
    Given Navigate to the Amazon
    And Go into Best sellers in Digital Cameras
    And Open details of 5-th product product
    And Add 8 pieces to the cart
    Then Check that correct product was added and subtotal price is correct
