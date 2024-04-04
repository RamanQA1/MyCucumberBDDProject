Feature: Add to Cart

#Scenario: Add one quantity from Store
#
#Given I am on the Store page
#When I add "Blue Shoes" to the cart
#Then I should see 1 "Blue Shoes" in the cart


@scenarioCase
Scenario Outline: Add one quantity from Store

Given I am on the Store page
When I add "<product_name>" to the cart
Then I should see 1 "<product_name>" in the cart

Examples:
| product_name |
| Anchor Bracelet |
| Black Over-the-shoulder Handbag |