Feature: Verify the login module
  Verify that the supplier is deleted successfully

      
  @DeleteSupplier
  Scenario Outline: Verify that the supplier details is deleted successfully
    Given User is logged into Purna application "<TestCase_ID>" "DeleteSupplier"
    And user clicks on main menu
    When User clicks click on supplier link
    And User clicks on delete link
    And User clicks on ok popup 
   Then User verifies that the supplier details is deleted

 

    Examples: 
      | TestCase_ID  | 
      | Purna_TC_014  |  
      



 
      
