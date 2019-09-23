Feature: Negative scenario

  Scenario:  Incorrect auth
    Given Open homepage
    Given User navigate login page
    When Click on Sign in button
    Then Validation message
    When User fills incorrect login and correct password
    And  Click on Sign in button
    Then Validation message
    When User fills correct login snd incorrect password
    And  Click on Sign in button
    Then Validation message