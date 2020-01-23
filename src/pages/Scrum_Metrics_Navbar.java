package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class Scrum_Metrics_Navbar {

	public static WebElement btn_GettingStared() {
		return Find.element(LocatorType.CSSSELECTOR,
				"button[class='dropbtn mat-menu-trigger mat-button mat-button-base']");
	}

	public static WebElement menu_Login() {
		return Find.element(LocatorType.CSSSELECTOR, "button[ng-reflect-router-link='/start/login']");
	}
	
	
}
