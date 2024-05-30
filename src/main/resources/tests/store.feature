Feature: Buy Item

  @regressionPack
  Scenario: Buy Galaxy Phone in the store
    Given open application
    When user selects the phone
    And adds phone to the cart
    And pop-up appears and user clicks OK
    And user open the shopping cart
    And phone is present in shopping cart
    And user places the order
    And inputs the name "Eleonora Cappucini"
    And inputs the "Italy" country
    And inputs the "Rome" city
    And inputs the "1234567353689" credit card
    And inputs the 12 month
    And inputs the 2023 year
    And clicks on purchase
    Then confirmation pup-up appears
    And user click OK



