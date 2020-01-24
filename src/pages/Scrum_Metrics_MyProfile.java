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
}
