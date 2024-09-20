Feature: Login Functionality

  Scenario: Login
    Given Navigate to website
    When Click on the element/elements
      |girisButton|
    Then Enter the data/datas
      |email      |mstfyumrutepe@gmail.com|
      |password   |mustafa123...          |
    And Click on the element/elements
      |loginButton|
    Then User should login successfully
      |profileButton|
