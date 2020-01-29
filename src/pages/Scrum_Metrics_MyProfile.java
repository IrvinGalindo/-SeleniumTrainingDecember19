package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class Scrum_Metrics_MyProfile {
	
	public static WebElement lnk_Profile() {
		return Find.element(LocatorType.XPATH, "//h1[@class='user-name']");
	}
	
	public static WebElement lbl_Username() {
		return Find.element(LocatorType.XPATH, "//h4[@id='usernameh4']");
	}
	
	public static WebElement lbl_FullName() {
		return Find.element(LocatorType.XPATH, "//input[@name='inName']");
	}
	
	public static WebElement lbl_Email() {
		return Find.element(LocatorType.XPATH, "//input[@name='inMail']");
	}
	
	public static WebElement img_Photo() {
		return Find.element(LocatorType.XPATH, "//img[@id='user-pic']");
	}
	
	public static WebElement btn_UnlockName() {
		return Find.element(LocatorType.XPATH, "(//div[@class='mat-dialog-content']//button[@class='mat-raised-button mat-button-base mat-lightgray'])[1]");
	}
	
	public static WebElement btn_UnlockEmail() {
		return Find.element(LocatorType.XPATH, "(//div[@class='mat-dialog-content']//button[@class='mat-raised-button mat-button-base mat-lightgray'])[2]");
	}
	
	public static WebElement btn_Save() {
		return Find.element(LocatorType.XPATH,"//span[text()='Save']");
	}
}
