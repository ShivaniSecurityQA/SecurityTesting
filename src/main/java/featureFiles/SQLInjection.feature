Feature: Validate the functionality of testing of SQL Injection
      As a security tester, I want to ensure that the application is protected against SQL injection attacks
    So that sensitive data cannot be compromised  
  
   
 Background: Login to juice-shop application
      Given User on the juice-shop Login page
          | https://juice-shop.herokuapp.com/#/login   | 
  
    @ID
    Scenario Outline: Verify the functionality of Injecting SQL code into a juice-shop login page
          Given he has entered <UserName> and <Password> on juice-shop login page.
          When he clicks on Submit button
          Then user <UserName> should be able to login into the juice-shop dashboard page.
      Examples: 
        | UserName            | Password      | 
        | "'or'1'='1';"       | 'abc'         | 