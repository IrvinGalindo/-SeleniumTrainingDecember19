package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class Scrum_Metrics_Login {

	public static WebElement txt_Username() {
		return Find.element(LocatorType.XPATH, "//input[@name='inUser']");
	}

	public static WebElement txt_Password() {
		return Find.element(LocatorType.XPATH, "//input[@name='inPass']");
	}

	public static WebElement btn_Login() {
		return Find.element(LocatorType.CSSSELECTOR, "button[class='mat-raised-button mat-button-base']");
	}
	
	public static WebElement btn_Google() {
		return Find.element(LocatorType.CSSSELECTOR, "a[href='www.google.com']");
	}
	
	public static WebElement lbl_Username() {
		return Find.element(LocatorType.XPATH, "(//div[@class='mat-form-field-subscript-wrapper'])[1]");
	}
	
	public static WebElement lbl_Password() {
		return Find.element(LocatorType.XPATH, "(//div[@class='mat-form-field-subscript-wrapper'])[2]");
	}
	
	public static WebElement btn_Register() {
		return Find.element(LocatorType.XPATH, "//a[@href='/start/register']");
	}
	
	public static WebElement lbl_ErrorMessage() {
		return Find.element(LocatorType.XPATH, "");
	}
	
}
