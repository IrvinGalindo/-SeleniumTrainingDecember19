package pages;

import java.util.List;

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
		return Find.element(LocatorType.CSSSELECTOR, "input[aria-label='Number']");
	}

	public static WebElement btn_Add() {
		return Find.element(LocatorType.XPATH, "(//button[@class='mat-raised-button mat-button-base mat-primary'])[2]");
	}

	public static WebElement btn_Members() {
		return Find.element(LocatorType.CSSSELECTOR, "span[class='mat-content']");
	}

	public static WebElement checkb_EndDate() {
		return Find.element(LocatorType.CSSSELECTOR, "label[class='mat-checkbox-layout']");
	}

	public static WebElement btn_StartDate() {
		return Find.element(LocatorType.XPATH, "(//mat-datepicker-toggle[@class='mat-datepicker-toggle'])[1]");
	}

	public static WebElement btn_EndDate() {
		return Find.element(LocatorType.XPATH, "(//mat-datepicker-toggle[@class='mat-datepicker-toggle'])[2]");
	}

	public static WebElement lbl_ErrorName() {
		return Find.element(LocatorType.CSSSELECTOR, "div>mat-error[id='mat-error-0']");
	}

	public static WebElement lbl_ErrorDesc() {
		return Find.element(LocatorType.CSSSELECTOR, "div>mat-error[id='mat-error-1']");
	}

	public static WebElement btn_DayOfTheMonthSD(String startDate) {
		return Find.element(LocatorType.CSSSELECTOR, "td[aria-label='" + startDate + "']");
	}

	public static WebElement btn_DayOfTheMonthED(String endDate) {
		return Find.element(LocatorType.CSSSELECTOR, "td[aria-label='" + endDate + "']");
	}

	public static WebElement btn_Create() {
		return Find.element(LocatorType.XPATH, "//button[@id='createbutt']");
	}

	public static WebElement txt_StartDate() {
		return Find.element(LocatorType.CSSSELECTOR, "input[name=inDate1]");
	}

	public static WebElement txt_EndDate() {
		return Find.element(LocatorType.CSSSELECTOR, "input[name=inDate2]");
	}

	public static List<WebElement> lbl_Members() {
		return Find.elements(LocatorType.XPATH, "//mat-action-row[@class='mat-action-row ng-star-inserted']");
	}

	public static WebElement lbl_Project(String projectToSearch) {
		return Find.element(LocatorType.XPATH, "//mat-panel-title[contains(text(),'" + projectToSearch + "')]");
	}

	public static List<WebElement> lbl_Projects() {
		return Find.elements(LocatorType.XPATH,
				"//span[@class='mat-content']");
	}

	public static WebElement btn_OpenProject(int indexPosition) {
		return Find.element(LocatorType.XPATH,
				"(//div[@class='mat-expansion-panel-content ng-trigger ng-trigger-bodyExpansion']//button)["
						+ indexPosition + "]");
	}
	
	public static WebElement lbl_details(int indexPosition) {
		return Find.element(LocatorType.XPATH,
				"(//div[@class='mat-expansion-panel-body']/div)[" + indexPosition + "]");
	}
}
