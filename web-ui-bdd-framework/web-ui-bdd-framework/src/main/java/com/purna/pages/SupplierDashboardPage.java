package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierDashboardPage {
	
	public SupplierDashboardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="btn_new_party")
	public WebElement btn_newSupplier;
	
	@FindBy(xpath="//a[@href=\"delete_supplier.php?sr_no=5\"]")
	public WebElement Link_Delete;

}
