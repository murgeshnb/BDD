Feature: Login Feature

@smokeTest
Scenario: As a user I want to login to apllication with valid credentials
Given I will launch the browser
And I will enter the url
When Login page is displayed i will enter username and password
And I will click on login
Then I will validate whether home page is displayed or not

@regressionTest
Scenario: as a user i will enter invalid username and password for login
Given I will launch the browser
And I will enter the url
When Login page is displayed enter invalid username and password
And I will click on login
Then I will validate error message is displayed or not

