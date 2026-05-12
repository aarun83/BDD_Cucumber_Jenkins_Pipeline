Feature: Forgot Password Page
 
  Background:
    Given User is on HRMLogin page "https://opensource-demo.orangehrmlive.com/"
 
  @BackFunctionality
  Scenario: Validate the cancel functionality
 
    When User clicks on Forgot your password? link
    Then User should be able to navigate to Reset Password page
    And User clicks on Cancel button to go back to Login Page
 
  @ResetFunctionality
  Scenario: Validate the Reset Password functionality
 
    When User clicks on Forgot your password? link
    Then User should be able to navigate to Reset Password page
    And User clicks on Reset Password button and provide username as "abc1234"
    And Verify the message "Reset Password link sent successfully"
