package com.purna.stepdefinitions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.purna.libraries.TestContext;
import com.purna.pages.DashboardPage;
import com.purna.pages.EmployeePages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewEmployee_stepdefinitions {
	private WebDriver driver;
	private TestContext testContext;
	EmployeePages onEmployeePages;
	DashboardPage onDashboardPage;
	
	public NewEmployee_stepdefinitions(TestContext context){
		testContext = context;
		driver = testContext.getDriver();
		onDashboardPage = new DashboardPage(driver);
		onEmployeePages = new EmployeePages(driver);
	}
	@When("User clicks on Employee link")
	public void user_clicks_on_employee_link() {
		onDashboardPage.link_employee.click();
	}
	@When("User clicks on Add New Employee button")
	public void user_clicks_on_add_new_employee_button() {
		onEmployeePages.btn_AddNewEmployee.click();
	}
	@When("User enters the Employee details")
	public void user_enters_the_employee_details() {
		onEmployeePages.Employee_Name.sendKeys(testContext.getMapTestData().get("EmployeeName"));
		onEmployeePages.date_of_joining.sendKeys(testContext.getMapTestData().get("Date"));
		onEmployeePages.department.sendKeys(testContext.getMapTestData().get("Department"));
		onEmployeePages.mobile.sendKeys(testContext.getMapTestData().get("mobile"));
		onEmployeePages.salary.sendKeys(testContext.getMapTestData().get("salary"));
		onEmployeePages.no_of_days.sendKeys(testContext.getMapTestData().get("no_of_days"));
	}
	@When("User clicks calculate button")
	public void user_clicks_calculate_button() {
		onEmployeePages.btn_Calculate.click();
	}
	@When("User clicks save button")
	public void user_clicks_save_button() {
		onEmployeePages.btn_Save.click();
	}
	@When("User clicks ok popup")
	public void user_clicks_ok_popup() {
		driver.switchTo().alert().accept();
	}
	@When("User clicks on Employee Dashboard button")
	public void user_clicks_on_employee_dashboard_button() {
		onEmployeePages.btn_EmployeeDashboard.click();
	}
	@Then("User verfies that New Employee is added")
	public void user_verfies_that_new_employee_is_added() {
	    Assert.assertEquals(driver.findElement(By.xpath("//td[text()='Rahul']")).getText(), "Rahul");
	}


}
