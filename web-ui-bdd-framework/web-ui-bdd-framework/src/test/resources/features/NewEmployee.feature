Feature: Verify new Employee is created

@NewEmployee
Scenario Outline: Verify that user is able to add new employee
Given User is logged into Purna application "<TestCase_ID>" "NewEmployee"
When User clicks on Main Menu
When User clicks on Employee link
When User clicks on Add New Employee button
And  User enters the Employee details
When User clicks calculate button   
When User clicks save button
When User clicks ok popup
And User clicks on Employee Dashboard button
Then User verfies that New Employee is added


 Examples:
      | TestCase_ID |
      | Purna_TC_013|