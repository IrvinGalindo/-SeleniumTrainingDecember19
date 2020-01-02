package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class Amazon {
	public static WebElement clickBtn_All() {
		return Find.element(LocatorType.ID, "searchDropdownBox");
	}
	public static WebElement select_Books() {
		return Find.element(LocatorType.ID, "searchDropdownBox");

	}
	public static WebElement txt_SearchBar() {
		return Find.element(LocatorType.ID, "twotabsearchtextbox");
	}
	public static WebElement btn_Submit() {
		return Find.element(LocatorType.XPATH, "//input[@value='Go']");
	}
	public static WebElement btn_StorBy() {
		return Find.element(LocatorType.ID, "s-result-sort-select");
	}
	public static WebElement img_Book() {
		return Find.element(LocatorType.XPATH, "(//div[@data-index='0']//a[@class='a-link-normal'])[1]");
	}
	public static WebElement btn_Kindle() {
		return Find.element(LocatorType.XPATH, "//span[@class='a-color-base']/span[contains(text(),'$0.00')]");
	}
}
