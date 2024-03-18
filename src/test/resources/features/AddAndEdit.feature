# Created by meltemsert at 18.03.2024

Feature: Add and edit new record

  Scenario: Add and edit a new record
    Given User visits the demoqa web tables page
    When User clicks on the ADD button
    And User adds a new record
    And User edits the added record
    Then User clicks submit button