@w3school
Feature: Double Click action combined with Iframe

  Scenario: After double click, colour of the web element should change

    When user launches the target page
    And user double clicks the target element
    Then user should see colour of web element changed red