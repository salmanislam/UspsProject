@usps @regression
Feature: Users ability to add goods on shopping cart.
Scenario: User should able to modify shopping cart.

Given Visit to USPS.com home page
When Hover over postal Store and Click on Stamps.
And Click on U.S. Flag
And Click on Add to Cart.
And Click on keep shopping.
And Click on Cards & Envelopes link.
And Click on Crafty Gingham Magnetic Note List.
And Click on Add to cart.
And Click on View cart.
And Click on Clear shopping cart
Then Varify the Shoppoing cart is clear.