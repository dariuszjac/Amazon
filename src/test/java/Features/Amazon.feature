Feature: AmazonFeature
  This is firts amazon feature

  Scenario: Open Amazon and check sth
    Given Navigate to the Amazon
    And Go into Best sellers in Digital Cameras
    And Open details of 3-th product product
    And Add 8 pieces to the cart
    Then Check that correct product was added and subtotal price is correct
