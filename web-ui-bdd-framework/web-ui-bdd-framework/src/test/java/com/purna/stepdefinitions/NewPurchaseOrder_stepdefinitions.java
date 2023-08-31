package com.purna.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.DashboardPage;
import com.purna.pages.NewPurchaseInvoicePage;
import com.purna.pages.PurchaseDashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewPurchaseOrder_stepdefinitions {
	private WebDriver driver;
	private TestContext testContext;
	 DashboardPage onDashboardPage;
	 PurchaseDashboardPage onPurchaseDashboardPage;
	 NewPurchaseInvoicePage onNewPurchaseInvoicePage;
	Utilities utils;
			
	
	public NewPurchaseOrder_stepdefinitions(TestContext context) {
	
		testContext = context;
		driver = testContext.getDriver();
		onDashboardPage = new DashboardPage(driver);
		onPurchaseDashboardPage = new PurchaseDashboardPage(driver);
		onNewPurchaseInvoicePage = new NewPurchaseInvoicePage(driver);
		 utils = new Utilities();
		
	}
	@When("User clicks on new purchase invoice button")
	public void user_clicks_on_new_purchase_incoice_button() {
		onPurchaseDashboardPage.btn_newPuchaseInvoice.click();
	}
	@When("User enters the purchase invoice details")
	public void user_enters_the_purchase_invoice_details() {
		utils.doDropDownUsingVisibleText(onNewPurchaseInvoicePage.dropdown_supplierName, "Anjali");
		onNewPurchaseInvoicePage.text_SupplierAddress.sendKeys(testContext.getMapTestData().get("SupplierAddress"));
		utils.doDropDownUsingValue(onNewPurchaseInvoicePage.dropdown_CrPeriod, "15 DAYS");
		onNewPurchaseInvoicePage.textbox_newCrPeriod.sendKeys(testContext.getMapTestData().get("newCrPeriod"));
		onNewPurchaseInvoicePage.textbox_totalAmount.sendKeys(testContext.getMapTestData().get("totalAmount"));
		utils.doDropDownUsingValue(onNewPurchaseInvoicePage.dropdown_cgst, "6");
		utils.doDropDownUsingValue(onNewPurchaseInvoicePage.dropdown_sgst, "9");
		utils.doDropDownUsingValue(onNewPurchaseInvoicePage.dropdown_igst, "14");
	}
	@When("User clicks on calculate button")
	public void user_clicks_on_calculate_button() {
		onPurchaseDashboardPage.btn_Calculate.click();
	}
	@When("User clicks on save button")
	public void user_clicks_on_save_button() {
		onPurchaseDashboardPage.btn_Save.click();
	}
	@Then("User verifies that new Purchase order is created")
	public void user_verifies_that_new_purchase_order_is_created() {
		Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Anjali']")).getText(), "Anjali");
	}


}
