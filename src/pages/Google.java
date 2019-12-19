package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class Google {
	
	public static WebElement txt_SearchBar() {
		return Find.element(LocatorType.NAME, "q");

	}

	public static WebElement btn_Search() {
		return Find.element(LocatorType.XPATH, "(//input[@name='btnK'])[1]");
	}
	
	public static WebElement lbl_FirstResult(String valueToVerify) {
		return Find.element(LocatorType.XPATH, "(//h3[contains(text(),'"+valueToVerify+"')])[1]");
	}
}

