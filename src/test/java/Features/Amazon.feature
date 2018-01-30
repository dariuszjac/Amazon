Feature: AmazonFeature
  This is firts amazon feature

  Scenario: Open Amazon and check sth
    Given Navigate to the Amazon
    And Go into Best sellers in Digital Cameras
    And Open details of fiveth product
    And Add 8 pieces to the cart(don't accept any other options)
    Then Check that correct product was added and subtotal price is correct
