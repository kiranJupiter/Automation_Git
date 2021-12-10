Feature: Deal Test datatable creation

  Scenario: Free CRM Create a new deal scenario
    Given user is already on Login Page
    When title of login page is Free CRM
    Then user enters username and password
      | kirkiran11@gmail.com | Ka05kw4395 |
    Then user clicks on login button
    Then user is on home page
    Then user moves to new deal page
    Then user enters deal details
      | test deal | 1000 | 50 | 10 |
    


    When user clicks on ad deals
    Then Close the browser