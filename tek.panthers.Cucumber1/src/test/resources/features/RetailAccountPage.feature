Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Sam333@gmail.com' and password 'Sam113$@'
    And User click on login button
    Then User should be logged in into Account
    When User click on Account option

  @UpdatingProfile
  Scenario: Verify User can update Profile Information
    And User update Name 'Samim Jan' and Phone '1234554321'
    And User click on Update button
    Then user profile information should be updated

  @UpdatingPassword
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Sam113$@         | Sam117$@    | Sam117$@        |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @AddingBothCards
  Scenario: Verify User can add a payment method
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1234567898765777 | Tasal Jan  |              03 |           2029 |          753 |
    And User click on Add your card button
    Then a message should be displayeds 'Payment Method added successfully'

  @UpdatingBothCards
  Scenario: Verify User can edit Debit or Credit card
    And User click Master Card
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard     | expirationMonth | expirationYear | securityCode |
      | 1234554321342321 | Samim Ghafoori |              05 |           2025 |          123 |
    And user click on Update Your Card button
    Then a message should be displayedes 'Payment Method updated Sucessfully'

  @AddingAddress
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName   | phoneNumber | streetAddress  | apt   | city       | state      | zipCode |
      | United States | Samir Wafa |  1234554321 | 1233 Morse ave | D 407 | Sacremento | California |   98761 |
    And User click Add Your Address button
    Then a message should be displayede 'Address Added Successfully'

  @UpdatingAddress
  Scenario: Verify User can edit an Address added on account
    And User click on edit address option
    And user fill new address form with below informations
      | country | fullName     | phoneNumber | streetAddress    | apt   | city       | state   | zipCode |
      | Spain   | Ahmad Basher |  3456787658 | 2456 Morconi ave | E 303 | Folsom blv | Alabama |   45621 |
    And User click update Your Address button
    Then a message should be displayeded 'Address Updated Successfully'
  @RemovingOldAddress
  Scenario: Verify User can remove Address from Account
    And User click on remove option of Address section
    Then Address details should be removed
