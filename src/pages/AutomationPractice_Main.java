package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class AutomationPractice_Main {

	public static WebElement cmb_WomenDresses() {
		return Find.element(LocatorType.CLASSNAME, "sf-with-ul");
	}
	
	public static WebElement cmb_opt_EveningDresses() {
		return Find.element(LocatorType.XPATH, "(//a[@title='Evening Dresses'])[1]");
	}

}
