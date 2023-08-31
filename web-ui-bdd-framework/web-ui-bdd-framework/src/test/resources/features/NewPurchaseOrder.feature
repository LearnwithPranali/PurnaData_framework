Feature: Verify purchase order
         verify new purchase order created successfully
   
   
@NewPurchaseOrder      
Scenario Outline: verify user can create new purchase order created successfully
Given User is logged into Purna application "<TestCase_ID>" "SalesInvoice"
When User clicks on purchase link
When User clicks on purchase order link
When User clicks on new purchase invoice button
And  User enters the purchase invoice details
When User clicks on calculate button   
When User clicks on save button
When User clicks on ok popup
And User clicks on Purchase Invoice details button
Then User verifies that new Purchase order is created   


Examples:

      | TestCase_ID |
      | Purna_TC_012|

  