package com.purna.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewPurchaseInvoicePage {
	public NewPurchaseInvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "supplier_name")
	public WebElement dropdown_supplierName;
	
	@FindBy(id="supplier_address")
	public WebElement text_SupplierAddress;
	
	@FindBy(id= "gst_no")
	public WebElement text_GSTNo;
	
	@FindBy(name= "contact_petrson")
	public WebElement text_Name;

	@FindBy(id = "credit_period")
	public WebElement dropdown_CrPeriod;

	@FindBy(name = "credit_period1")
	public WebElement textbox_newCrPeriod;

	@FindBy(id = "total_amount")
	public WebElement textbox_totalAmount;

	@FindBy(id = "cgst")
	public WebElement dropdown_cgst;

	@FindBy(id = "sgst")
	public WebElement dropdown_sgst;

	@FindBy(id = "igst")
	public WebElement dropdown_igst;

	@FindBy(id = "myButtonlast")
	public WebElement btn_calculate;

	@FindBy(id = "btn")
	public WebElement btn_save;

}
