Feature: Create the Widget Booking

  Background: User logins successfully
    Given User navigate to Login Page for Admin
    When User submits correct Username and Password

  @TC02 @Regression @Smoke
  Scenario Outline: User creates the Widget Booking successfully
    When User clicks on option Admin Portal
    When User clicks on venue My Pizza Shop
    When User clicks on button Booking Widget
    When User selects option Open Booking Widget
    And User selects a date as today plus 1
    And User adds "<numberPeople>"
    And User selects the service "<service>"
    And User selects a time
    And User clicks on button NEXT
    And User enters "<firstName>", "<lastName>", "<phone>", "<email>" in form Your Details
    And User clicks on button NEXT
    And User clicks on button BOOK NOW
    Then Verify that Thank You page displays
    When User navigate to Booking page
    And Verify that Widget Booking is created successfully with "<firstName>", "<lastName>", "<phone>", "<service>", "<numberPeople>", date plus 1
    And Verify that Widget Booking is created successfully with correct date time

    Examples:
      | firstName | lastName   | phone     | email          |service  |numberPeople|
      | Automation| Automation | 423845803 | test@gmail.com |FOOD TIME| 2          |
