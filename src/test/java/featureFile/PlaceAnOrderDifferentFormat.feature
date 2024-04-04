Feature: Place an order in different format

Scenario: Using default payment option

Given I am a guest customer
And my billing details are
| First name | Last name |    Country           | Street address_line1 | City | State | Zip code| Email address |
| Demo       | User      | United States (US)   | 6300 Spring Creek    | Plano| Texas | 75024   | raman@gmail.com |
And I have a product in the cart
And I am on the checkout page
When I provide billing details
And I Placed an order
Then The order should placed successfully 