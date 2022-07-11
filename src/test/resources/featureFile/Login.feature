@Login
Feature: To validate login functionality of facebook application

  Background: 
    Given User have to enter facebook application through chrome browser

  @Smoke @Sanity
  Scenario: To validate login by using invalid username and valid password
    When User have to enter invalid username and valid password
      | greens123@gmail.com | selenium123@gmail.com | selenium123 |
    And User have to click login button
    Then User should be in a invalid credential page

  @Sanity @Regression
  Scenario: To validate login by using invalid username and invalid password
    When User have to enter invalid username and invalid password
      | selenium | selenium123@gmail.com | selenium123 |
      | python   | python123@gmail.com   | python123   |
      | jenkins  | jenkins123@gmail.com  | jenkins123  |
    And User have to click login button
    Then User should be in a invalid credential page

  @smoke
  Scenario: To validate login by using username and valid password
    When User have to enter username and valid password
      | username | Eniyan              |
      | email    | eniyan123@gmail.com |
      | password | Eniyan123           |
    And User have to click login button
    Then User should be in a invalid credential page

  @regression
  Scenario: To validate login by using valid username and invalid password
    When User have to enter valid username and invalid password
      | username | email               | password  |
      | java     | java123@gmail.com   | java123   |
      | jira     | jira123@gmail.com   | jira123   |
      | python   | python123@gmail.com | python123 |
    And User have to click login button
    Then User should be in a invalid credential page
