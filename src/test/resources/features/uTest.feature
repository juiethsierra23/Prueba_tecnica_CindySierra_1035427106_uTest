#Autor: Cindy sierra
@stories
Feature: uTest Register
  A user tries to register on the uTes platform
  @scenario1
  Scenario: Open option to register

    Given Cindy wants to register on the uTest page
    |firstName|lastName|email|monthBirthDay|dayBirthDay|yearBirthDay|language|city|zipCode|password|passwordConfirmation|
    |Cindy    |Sierra  |luna-julieth@hotmail.com|April|5|1992       |Spanish |Medellin|050001|59yEVQArENdKPx5OMN6B|59yEVQArENdKPx5OMN6B|
    When She looks for the Join Today button at the top right of the uTest page

    Then she finds you today and registers the button
