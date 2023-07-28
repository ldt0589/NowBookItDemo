Feature: Create the Walk-in Booking

  Background: User logins successfully
    Given User navigate to Login Page for Admin
    When User submits correct Username and Password

  @TC01 @Regression @Smoke
  Scenario Outline: User creates the Walk-in Booking successfully
    When User clicks on option Admin Portal
    When User clicks on venue My Pizza Shop
    When User clicks on button Open Restaurant to open Booking Page
    When User clicks on Walk-in sign to open form New Booking
    And User selects "<table>" in Booking tab
    And User enters "<prefix_name>" and "<phone>" in Customer tab
    And User enters "<note>" in Notes tab
    And User clicks on button Save
    Then Verify that popup Booked displays
    And Verify that Walk-in Booking is created successfully
    Examples:
      | table         | prefix_name| phone     | note    |
      | T1*C21 outside| Automation | 423845803 |NoteTest |
