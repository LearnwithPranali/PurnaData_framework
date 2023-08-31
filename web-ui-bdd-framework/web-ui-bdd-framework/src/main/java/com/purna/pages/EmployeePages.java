package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePages {
	
	public EmployeePages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	 @FindBy(xpath = "//a[@href='employee_dashboard.php']")
	    public  WebElement dropdown_Employee;

	 @FindBy(xpath = "//button[text()='Add New Employee']")
	 public WebElement btn_AddNewEmployee;
	 
	 @FindBy(name = "name")
	 public WebElement Employee_Name;
	 
	 @FindBy(id = "date_of_joining")
	 public WebElement date_of_joining;
	 
	 @FindBy(id = "department")
	 public WebElement department;
	 
	 @FindBy(id = "mobile")
	 public WebElement mobile;
	 
	 @FindBy(id = "salary")
	 public WebElement salary;
	 
	 @FindBy(id = "no_of_days")
	 public WebElement no_of_days;
	 
	 @FindBy(id = "myButton")
	 public WebElement btn_Calculate;
	 
	 @FindBy(name = "submit")
	 public WebElement btn_Save;
	 
	 
	 @FindBy(xpath = "//a[text()='Employee Dashboard']")
	 public WebElement btn_EmployeeDashboard;
}
