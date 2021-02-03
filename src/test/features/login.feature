Feature: As a User I should be able to login

 @login
  Scenario: Validating the Login feature with a valid username and password

    Given I go to Invoice Management URL"http://3.13.126.58/AMS3.0/home"
    When I enter a valid username "admin@gic.com"
    And I enter valid password "Admin123"
    And I click the Login button
    Then I should be logged in successfully with the message "Logged In Successfully"
    And then click the back button to go to Invoice Management homepage"http://3.13.126.58/AMS3.0/home"


