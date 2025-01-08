@E2E
Feature: Luma E-Commarce Site

  @smoke
  Scenario Outline: Verify the uer is able to Sign-Up  Successfully or not
    When User enter the firt Name as "<firstname>"
    And user enter trhe Last name as "<lastname>"
    And user enter the Email id as "<Email>"
    And user enter the Password "<password>"
    And User Reentering the Confirm Password as "<conformpassword>"
    When User click the Create an account button
    Then User should be redirected to the My account Screen

    Examples: 
      | firstname | lastname | Email                  | password        | conformpassword |
      | deval     | batista  | devabatistaa@gmail.com | Devabatista@111 | Devabatista@111 |

  @smoke
  Scenario Outline: Verify the uer is able to Sign-Up  Successfully existing user id
    When User click and enter the firt Name as "<firstname>"
    And user click and enter trhe Last name as "<lastname>"
    And user click and enter the Email id as "<Email>"
    And user click and enter the Password "<password>"
    And User click and Reentering the Confirm Password as "<conformpassword>"
    When User click on the Create an account button
    But Error messag should be displyed

    Examples: 
      | firstname | lastname | Email                  | password        | conformpassword |
      | deval     | batista  | devabatistaa@gmail.com | Devabatista@111 | Devabatista@111 |
