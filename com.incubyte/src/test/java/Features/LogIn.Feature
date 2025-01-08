Feature: User Authentication test
@smoke
  Scenario Outline: user logging in after signup process
    Given user click on the signin link
    And user enter the email "<Email>"
    And user enter the password "<password>"
    When User click on the sign in button
    Then user should be navigate to Home screen successfully

    Examples: 
      | Email              | password         |
      | johncena@gmail.com | Supremeyadav@111 |
