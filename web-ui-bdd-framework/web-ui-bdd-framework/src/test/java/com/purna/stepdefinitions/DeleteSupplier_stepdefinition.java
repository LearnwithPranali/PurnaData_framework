package com.purna.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.purna.libraries.TestContext;
import com.purna.libraries.Utilities;
import com.purna.pages.DashboardPage;
import com.purna.pages.LoginPage;
import com.purna.pages.SupplierDashboardPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteSupplier_stepdefinition {
	private WebDriver driver;
	private TestContext testContext;
	private DashboardPage onDashboardPage;
	SupplierDashboardPage onSupplierDashboardPage;
	LoginPage onLoginPage;
	Utilities utils;

	public DeleteSupplier_stepdefinition(TestContext context) {
		testContext = context;
		driver = testContext.getDriver();
		onDashboardPage = new DashboardPage(driver);
		onSupplierDashboardPage = new SupplierDashboardPage(driver);
		 onLoginPage = new LoginPage(driver);
		utils = new Utilities();
	}

	@When("User clicks click on supplier link")
	public void user_clicks_click_on_supplier_link() {
		onDashboardPage.link_supplier.click();
	}

	@When("User clicks on delete link")
	public void user_clicks_on_delete_link() {
		onSupplierDashboardPage.Link_Delete.click();
	}

	@When("User clicks on ok popup")
	public void user_clicks_on_ok_popup() {
		utils.acceptAlert(driver);
	}

	@Then("User verifies that the supplier details is deleted")
	public void user_verifies_that_the_supplier_details_is_deleted() {
		Assert.assertEquals(driver.findElements(By.xpath("//td[text()='Ram']")).size(), 0);
	}
}
