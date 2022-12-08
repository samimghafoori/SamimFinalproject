Feature: Sign In Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option

  @SginIn
  Scenario: Verify user can sign in into Retail Application
    And User enter email 'David000@gmail.com' and password 'Dav123$&'
    And User click on login button
    Then User should be logged in into Account

  @CreatingNewAccount
  Scenario: Verify user can create an account into Retail Website
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name  | email              | password | confirmPassword |
      | David | David005@gmail.com | Dav123$& | Dav123$&        |
    And User click on SignUp button
    Then User should be logged into account page
