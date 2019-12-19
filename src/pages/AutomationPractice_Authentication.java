package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class AutomationPractice_Authentication {

	public static WebElement txt_EmailAddress() {
		return Find.element(LocatorType.ID, "email_create");
	}

	public static WebElement btn_CreateAnAccount() {
		return Find.element(LocatorType.ID, "SubmitCreate");
	}

	public static WebElement lbl_() {
		return Find.element(LocatorType.XPATH,
				"//li[contains(text(),'An account using this email address has already been registered')]");
	}

}
