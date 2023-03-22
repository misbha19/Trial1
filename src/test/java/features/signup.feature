Feature: Signup Feature

  @regression @smoke @sanity
  Scenario: User should be able to create a brand new email with unique email address
    Given user in TalentTEK Homepage
    And user click on "Create new account" button
    And user enter First and Last Name
    And user enter their valid email address
#    And user enter Password
#   And user enter Confirm Password
    And user enter "Oct" under Birth Date
#    And user enter date under Birth Date
#    And user enter year under Birth Date
    And user enter their gender as "female"
#    And user agrees on terms and condition checkbox
#    When user clicks on Create my account button
#    Then user should be able to get their studentId




  @test
  Scenario Outline: Create a new user with given list
    Given user in TalentTEK Homepage
    And user click on "Create new account" button
    And user enter "<First>" and "<Last>" Name
    Examples:
      |First|Last|
      |QA   |TEST|
      |David|Boon|
      |Mike |Hussy|
      |Jimmy |Loris|