Feature: Find a Lawyer page
  Scenario: User is able to navigate to /people page
    Given a home page
    When I click on the find a lawyer link
    Then I am on the people page

  Scenario: Input field is clickable, auto suggest works
    Given a people page
    When I type anything in the input field
    Then the auto suggestion works

#  Scenario: user can select articles