

Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given I am on osa homepage
      |browser|chrome|
      |url|https://www.osaconsultingtech.com|
    And I click on "forum button"
      |xpath|//a[text()='Forum']|
    And I enter "username" 
      |id|username|myusername|
    And I enter "password" 
      |id|password|mypassword|
    And I click on "forum button"
      |id|login_button|
    
  