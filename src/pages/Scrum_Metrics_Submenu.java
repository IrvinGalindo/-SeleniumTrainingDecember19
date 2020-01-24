package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class Scrum_Metrics_Submenu {

	public static WebElement h1_Name() {
		return Find.element(LocatorType.CSSSELECTOR, "h1[class='user-name']");
	}

	public static WebElement mnu_Menu() {
		return Find.element(LocatorType.XPATH, "//mat-icon[contains(text(),'menu')]");
	}

	public static WebElement mnu_MyProfile() {
		return Find.element(LocatorType.XPATH, "//span[contains(text(),'My Profile')]");
	}

	public static WebElement mnu_MyProject() {
		return Find.element(LocatorType.XPATH, "//span[contains(text(),'My Projects')]");
	}

	public static WebElement mnu_SignOut() {
		return Find.element(LocatorType.XPATH, "//span[contains(text(),'Sign Out')]");
	}

	public static WebElement mnu_NewProjects() {
		return Find.element(LocatorType.XPATH, "//span[contains(text(),'New Project')]");
	}

}
