package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class Scrum_Metrics_Project {

	public static WebElement lnk_CreateNewProject() {
		return Find.element(LocatorType.XPATH, "//a[contains(text(),'new project')]");
	}

	public static WebElement txt_ProjectName() {
		return Find.element(LocatorType.XPATH, "//input[@name='inName']");
	}

	public static WebElement txt_ProjectDesc() {
		return Find.element(LocatorType.XPATH, "//textarea[@name='inDesc']");
	}

	public static WebElement txt_Photo() {
		return Find.element(LocatorType.CSSSELECTOR, "div[class='divchangepho']>input[class='img-input']");
	}
	
	public static WebElement img_Photo() {
		return Find.element(LocatorType.XPATH, "//img[@id='project-pic']");
	}
	
	public static WebElement select_ProjectMember() {
		return Find.element(LocatorType.CSSSELECTOR, "div[class='mat-form-field-infix']>select");
	}
	
	public static WebElement txt_UserMember() {
		return Find.element(LocatorType.XPATH, "//input[@id='mat-input-3']");
	}
	
	public static WebElement btn_Add() {
		return Find.element(LocatorType.XPATH, "(//button[@class='mat-raised-button mat-button-base mat-primary'])[2]");
	}
	
	public static WebElement btn_Members() {
		return Find.element(LocatorType.CSSSELECTOR, "span[class='mat-content']");
	}
	
	public static WebElement checkb_EndDate() {
		return Find.element(LocatorType.CSSSELECTOR, "input[id='endbutt-input']");
	}
	
	public static WebElement btn_StartDate() {
		return Find.element(LocatorType.XPATH, "(//button[@class='mat-icon-button mat-button-base'])[3]");
	}
	
	public static WebElement btn_EndDate() {
		return Find.element(LocatorType.XPATH, "(//button[@class='mat-icon-button mat-button-base'])[4]");
	}
	
	public static WebElement lbl_ErrorName() {
		return Find.element(LocatorType.CSSSELECTOR, "div>mat-error[id='mat-error-0']");
	}
	
	public static WebElement lbl_ErrorDesc() {
		return Find.element(LocatorType.CSSSELECTOR, "div>mat-error[id='mat-error-1']");
	}
	
}
