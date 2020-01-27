package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class Scrum_Metrics_Register {
	
	public static WebElement lbl_CreateNewUser() {
		return Find.element(LocatorType.CSSSELECTOR, "div#outer-div>div>h1");
	}
	
	public static WebElement txt_FullName() {
		return Find.element(LocatorType.CSSSELECTOR, "input[name='inName']");
	}
	
	public static WebElement lbl_ErrorFullName() {
		return Find.element(LocatorType.XPATH, "//div[@class='ng-tns-c13-3 ng-trigger ng-trigger-transitionMessages ng-star-inserted']");
	}
	
	public static WebElement txt_Email() {
		return Find.element(LocatorType.CSSSELECTOR, "input[name='inEmail']");
	}
	
	public static WebElement txt_UserName() {
		return Find.element(LocatorType.CSSSELECTOR, "input[name='inUser']");
	}
	
	public static WebElement txt_Password() {
		return Find.element(LocatorType.CSSSELECTOR, "input[name='inPass']");
	}
	
	public static WebElement txt_ConfirmPassword() {
		return Find.element(LocatorType.CSSSELECTOR, "input[name='confPass']");
	}
	
	public static WebElement chck_TermsConditions() {
		return Find.element(LocatorType.CSSSELECTOR, "div.mat-checkbox-inner-container");
	}
	
	public static WebElement btn_CreateAnAccount() {
		return Find.element(LocatorType.CSSSELECTOR, "button.mat-raised-button");
	}
	
	public static WebElement lnk_google() {
		return Find.element(LocatorType.CSSSELECTOR, "a#google-reg");
	}
		
}
