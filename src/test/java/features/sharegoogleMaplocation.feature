Feature: Share Google Map location Feature
  Scenario: User should be able to share google map location via gmail
    Given user in Google Maps Homepage
    And user enter the current location address in the search field
    And user clicks on "Share" button from the left panel of the page
    And user clicks on "Gmail" button from the below options listed
    And user enter the email address of the receiver
    When user clicks on "Send" button
    Then user should be able to successfully send the current location details to the receiver