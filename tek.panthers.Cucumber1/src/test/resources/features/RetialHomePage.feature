Feature: Retail Home Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Sam333@gmail.com' and password 'Sam113$@'
    And User click on login button
    Then User should be logged in into Account

  @ShopByDepartment
  Scenario: Verify Shop by Department sidebar
    When User click on All section
    Then below options are present in Shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @ScenarioOutline
  Scenario Outline: Verify department sidebar options
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |

  @AddingItemTocard
  Scenario: Verify User can add an item to cart
    And User change the category to 'Smart Home'
    And User search for an item 'kasa outdoor smart plug'
    And User click on Search icon
    And User click on item
    And User select quantity '2'
    And User click add to Cart button
    Then the cart icon quantity should change to '2'

  @PlaceOrder
  Scenario: Verify User can place an order without Shipping address and payment Method on file
    And User click on Cart option
    And User click on Proceed to Checkout button
    And User click Add a new address link for shipping address
    And User fill new address form with below information
      | country       | fullName  | phoneNumber | streetAddress | apt   | city        | state | zipCode |
      | United States | Jhon Cena |  3456754313 | 3445 Watt ave | A 101 | Fall Chruch | Utah  |   98765 |
    And User click Add Your Address buttons
    And User click Add a credit card or Debit Card for Payment method
    And User fill Debit or credit card informations
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 5676453437768575 | David Wali |              03 |           2025 |          987 |
    And User click on Add your card buttons
    And User click on Place Your Order
    Then a message should be displayedi 'Order Placed Thanks'

  @PlacingOrderWithShippingAddress
  Scenario: Verify User can place an order with Shipping address and payment Method on file
    And User change the category to 'Electronics'
    And User search for an items 'Apex Legends '
    And User click on Search icons
    And User click on items
    And User select quantitys '5'
    And User click add to Cart button
    Then the cart icon quantity should change too '5'
    And User click on Cart options
    And User click on Proceed to Checkout buttons
    And User click on Place Your Orders
    Then a message should be displaye 'Order Placed Thanks'
