# Created by meltemsert at 17.03.2024

Feature: Testing Click Me Button And Read Message on demoqa.com

  Scenario: Clicking the Click Me button And Check The Message
    Given User is on demoqa elements page
    When User clicks on Buttons section
    And User clicks on Click Me button
    Then User should read the displayed message
