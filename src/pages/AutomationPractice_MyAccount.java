package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class AutomationPractice_MyAccount {
	
	public static WebElement lbl_MyAccount() {
		return Find.element(LocatorType.XPATH, "//span[contains(text(),'Irvin')]");
	}
}
