package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class AutomationPractice_CreateAnAccount {
	
	public static WebElement rdo_Title() {
		return Find.element(LocatorType.ID, "id_gender1");
	}
	
	public static WebElement txt_FirstName() {
		return Find.element(LocatorType.ID, "customer_firstname");
	}
	
	public static WebElement txt_LastName() {
		return Find.element(LocatorType.ID, "customer_lastname");
	}
	
	public static WebElement txt_Password() {
		return Find.element(LocatorType.ID, "passwd");
	}
	
	public static WebElement select_Days() {
		return Find.element(LocatorType.ID, "days");
	}
	
	public static WebElement select_Month() {
		return Find.element(LocatorType.ID, "months");
	}
	
	public static WebElement select_Years() {
		return Find.element(LocatorType.ID, "years");
	}
	
	public static WebElement txt_Address() {
		return Find.element(LocatorType.ID, "address1");
	}
	
	public static WebElement txt_City() {
		return Find.element(LocatorType.ID, "city");
	}
	
	public static WebElement select_state() {
		return Find.element(LocatorType.ID, "id_state");
	}
	
	public static WebElement txt_ZipCode() {
		return Find.element(LocatorType.ID, "postcode");
	}
	
	public static WebElement txt_MobilePhone() {
		return Find.element(LocatorType.ID, "phone_mobile");
	}
	
	public static WebElement txt_Alias() {
		return Find.element(LocatorType.ID, "alias");
	}
	
	public static WebElement btn_Register() {
		return Find.element(LocatorType.ID, "submitAccount");
	}
	
	public static WebElement lbl_CreateAnAccount() {
		return Find.element(LocatorType.XPATH, "//h1[contains(text(),'Create an account')]");
	}
	
}
