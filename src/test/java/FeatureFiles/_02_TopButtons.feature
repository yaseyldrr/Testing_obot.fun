Feature: Button navigation validation
  As a user, I want to verify that clicking buttons navigates to the correct pages.

  Scenario Outline: Verify button navigation
    Given I am on the "<initialPage>" page
    When I click the "<button>"
    Then I should be navigated to the "<expectedPage>" page

    Examples:
      | initialPage | button       | expectedPage |
      | Home        | Price Button | Price Page   |
      | Home        | Timer Button | Timer Page   |
      | Home        | Main Button  | Main Page    |