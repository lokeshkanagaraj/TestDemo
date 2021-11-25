@AddProductWishlistToCart
Feature: As a user, I am able to add lowest priced product from Wishlist to cart

  Scenario: User is able to add lowest priced product from Wishlist to Cart
    Given I add 4 different products to my wish list
    When I view my wishlist table
    Then I find total 4 selected items in my Wishlist
    When I search for lowest price product
    And I am able to add the lowest price item to my cart
    Then I am able to verify the item in my cart