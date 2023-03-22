Feature: Validate the functionality of testing of SQL Injection
    As a security tester, I want to ensure that the application is protected against SQL injection attacks
  So that sensitive data cannot be compromised  

  Background: Login to amazon application
    Given User on the amazon Login page
        | https://www.facebook.com/   | 
        

  @ID
  Scenario Outline: Verify the functionality of Injecting SQL code into a amazon login form
        Given he has entered <UserName> and <Password> on "Amazon" home page.
        When he clicks on "Submit" button
        Then user <UserName> should not be able to login into the "Amazon" dashboard page.
    Examples: 
      | UserName            | Password      | 
      | 'Shishpal'          | 'Shishpal@123'| 
        
    
    
    Scenario Outline: Attempting to bypass authentication using SQL injection
    Given user <Username> is logged into amazon application
    When he navigates to the user profile page with an invalid user ID <ID>
    Then error message <ErrorMsg> should be displayed on "Amazon Home" page

    Examples: 
      | Username | ID | ErrorMsg               |
      | Shishpal | -1 | User ID is not correct |
      | Shishpal | -2 | User ID is not correct |
