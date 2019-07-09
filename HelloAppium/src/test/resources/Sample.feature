#Author: jesynava@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template


Feature: Hello Word

  Scenario: Registration Flow Validation via App
    As a user I should be able to see my google account
    when I try to register myself in Quikr

    When I launch Quikr app
    And I choose to log in using Google
    Then I see account picker screen with my email address "jesynava@gmail.com"
