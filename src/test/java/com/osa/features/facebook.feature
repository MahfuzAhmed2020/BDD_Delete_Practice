
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I am on osa homepage
     |browser|chrome|
     |url|https://www.facebook.com/|
    And I enter "facebook email" 
     |id|email|abcd@gmail.com|
    And I enter "password" 
     |name|pass|mypassword1234|
    And I click on "facebook login button"
     |xpath|//button[@id='u_0_b']|