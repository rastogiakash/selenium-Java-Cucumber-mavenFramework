@Amazon
Feature: To add book to basket and verify addition

  @TestAmz
    Scenario:  Verify book addition to basket
    Given User is on Homepage of the amazon
    When User enter desired book name in search box
    And User click on search button
    And User adds book to basket
    Then User verify that same book added