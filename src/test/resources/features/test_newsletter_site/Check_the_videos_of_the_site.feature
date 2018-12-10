Feature: Check the videos of the site
  In order to get videos from the content creators 
  As a reader
  I want to be able to search for videos leaving the site
  
  @video
  Scenario: Visit the site's Youtube chanel
    Given the user is in the home page
    When the user select the video tab
    Then the user should be in the Youtube chanel's site
