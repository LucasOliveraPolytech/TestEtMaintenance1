Feature: Search for related articles
  In order to read articles of my interest
  As a reader
  I want to be able to search something in the articles
  
  Scenario: Search for articles related to a word
    Given the user is in the home page
    When the user searches for the word "iphone"
    Then the user should be in the results page for "iphone"

  Scenario: Search for articles related to a word and seeing only streams
    Given the user is in the home page
    When the user searches for the word "iphone"
    And the user select only streams result
    Then the user should be in the results page for "iphone" streams