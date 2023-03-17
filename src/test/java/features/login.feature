Feature: Login Feature

  @regression @smoke @sanity
  Scenario: User should be able to login with valid email and password
    Given user in TalentTEK Homepage
    And user enter valid email address
    And user enter valid password
    When user clicks on Log In button
    Then user should be able to successfully login

#  @smoke @hb
#  Scenario: User should not be able to login with valid email and invalid password
#    Given user in TalentTEK Homepage
#    And user enter valid email address
#    And user enter invalid password
#    When user clicks on Log In button
#    Then user should be able see "You have entered an incorrect email or student Id."
#
#  Scenario: User should not be able to login with invalid email and valid password
#    Given user in TalentTEK Homepage
#    And user enter invalid email address
#    And user enter valid password
#    When user clicks on Log In button
#    Then user should be able see "You have entered an incorrect email or student"
#
#  Scenario: User should not be able to login with invalid email and password
#    Given user in TalentTEK Homepage
#    And user enter invalid email address
#    And user enter invalid password
#    When user clicks on Log In button
#    Then user should be able see "You have entered an incorrect email or student Id."