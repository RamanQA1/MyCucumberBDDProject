
#Feature: Place an Order
#
#Scenario: Using default payment option
#
#Given I am a guest customer
#And I have a product in the cart
#And I am on the checkout page
#When I provide billing details
#| First name | Last name |    Country           | Street address_line1 | City | State | Zip code| Email address |
#| Demo       | User      | United States (US)   | 6300 Spring Creek    | Plano| Texas | 75024   | akash@gmail.com |
#And I Placed an order
#Then The order should placed successfully 