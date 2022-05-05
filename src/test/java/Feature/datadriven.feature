Feature: Title of your feature

Background:
# Given launch "chrome" browser---> taken care by hook class
  And enter the url "https://www.flipkart.com/"
  When i will login with "9902115140" username and "Mn@9902115140" password
  And click on login button

	@smokeTest
  Scenario: As a user i will open the flipkart and book a mobile
  Then i will click on Mobiles img
  Then i will click on iphone12 mobile
  And i will click on buy now button
 #Then i will logout of the application
 
 @regressionTest
  Scenario Outline: I want to login to flipkart with different accounts
   And enter the url "https://www.flipkart.com/"
  When i will login with "<mobileno>" username and "<password>" password
  And click on login button
  #Then i will logout of the application
    Examples: 
      | mobileno   | password      |
      | 9902115140 | Mn@9902115140 |
      | 9632695627 | r16me820      |

	@end2end
  Scenario: Read data from data table
    When I want to read data from below table
      | mobileno   | password      |
      | 9902115140 | Mn@9902115140 |
      | 9632695627 | r16me820      |
