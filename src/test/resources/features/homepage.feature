@all
Feature: Home page functionalities

  Background: Home page
    Given User is on the homepage
    Then User be able to see the home page with Zprime logo

  @Leftmenu
  Scenario: Validates the left menu
    When User clicks on left menu bar
    Then User be able to see zprime logo, back arrow, select your page text and entry pionts for dashboards
    When User clicks on back arrow
    Then User navigate to the home page

  @Quality
  Scenario: Validates the quality dashboard
    When User clicks on left menu bar
    And User clicks on quality
    Then User be able to navigate to the quality dashboard
    When User clicks on optoelectronics assembly
    Then User able to navigate to the particular page
    When User clicks on dispenser
    Then User able to navigae to the dispenser page
    When User clicks on optoelectronics assembly and selects all checkboxes of available data
    Then User able to select the checkboxes
    When User clicks on upload file button
    Then User able to see upload file window
    When User clicks on cancel button
    Then User able to close the upload file window
    When User clicks on search bar
    Then User able to see empty image
    When User passes some text
    And User clicks on the recommended total cost option
    Then User able to navigate to total cost page

  @Performance
  Scenario: Validates the performance dashboard
    When User clicks on left menu bar
    And User clicks on performance
    Then User able to navigate to the performance dashboard
    When User clicks on quality button
    Then User able to navigate to the quality page
    When User clicks on envoronmental impact button
    Then User able to navigate to the environmental impact page
    When User clicks on productivity
    Then User able to navigate to the productivity page

  @Cost
  Scenario: Validates the cost dashboard
    When User clicks on left menu bar
    And User clicks on cost
    Then User able to navigate to the cost dashboard
    When User clicks on cost breakdown
    Then User able to navigate to the cost breakdown page
    When User clicks on time factors
    Then User able to navigate to the time factors page
    When User clicks on input graphs
    Then User able to navigate to the input graphs page
