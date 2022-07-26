Feature: Register 
@register
Scenario: Register With Test Environment website

Given I am on Test Environment Home Page
When I click on My Account button
Then I click on register link
And I fill registeration from

|firstname|lastname|email|telephone|password|confirmpassword|
|jan|khan|jank@gmail.com|4044506799|test123|test123|
And i subscribe to news letter
And i agree to pricacy policy
And i click on continue button
Then i validate my account was created successfuly

