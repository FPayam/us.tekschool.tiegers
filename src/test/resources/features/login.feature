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
@loginTest
Feature: Login to Test Environment Website
Scenario: Login to Test Environment with One User
  Given I am on Test Environment Home Page
  When I click on My Account button
  And I click on login link 
  When I enter my username and password
  And I click on login button
  Then I am logged into my Test Environment account 
