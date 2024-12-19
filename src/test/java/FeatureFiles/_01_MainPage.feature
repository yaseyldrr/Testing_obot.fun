Feature: Main Page
  As a user
  I want to verify the presence of essential elements on the homepage
  So that I can confirm the page is loaded correctly

  Scenario: Verify homepage elements are visible
    Given the user navigates to the homepage
    Then the following elements should be visible:
      | Main Button  |
      | Price Button |
      | Timer Button |
      | Logo         |
      | Price        |
      | Change Ratio |
      | Powered      |
      | Discord      |
      | Telegram     |
      | X            |
      | Mascot       |