package pages;

import org.openqa.selenium.WebElement;

import enums.LocatorType;
import utilities.Find;

public class AutomationPractice_EveningDresses {

	public static WebElement lnk_Dress() {
		return Find.element(LocatorType.XPATH, "(//a[@title='Printed Dress'])[1]");
	}

	public static WebElement btn_More() {
		return Find.element(LocatorType.XPATH, "//a[@title='View']");
	}

	public static WebElement lbl_Price() {
		return Find.element(LocatorType.XPATH, "//span[@id='our_price_display']");
	}

	public static WebElement btn_AddToCar() {
		return Find.element(LocatorType.XPATH, "//button[@name='Submit']");
	}

	public static WebElement lbl_TotalPrice() {
		return Find.element(LocatorType.XPATH, "//td[@id='total_price_container']");
	}
	
	public static WebElement btn_CheckoutOne() {
		return Find.element(LocatorType.XPATH, "(//a[@title='Proceed to checkout'])[1]");
	}
	
	public static WebElement btn_CheckoutTwo() {
		return Find.element(LocatorType.XPATH, "(//a[@title='Proceed to checkout'])[2]");
	}
	
	public static WebElement list_lbl_Data() {
		return Find.element(LocatorType.XPATH, "//ul[@id='address_delivery']");
	}
	
	public static WebElement btn_ProceedToCheckOut() {
		return Find.element(LocatorType.XPATH, "//button[@name='processAddress']");
	}
	
	public static WebElement lbl_ShippingPrice() {
		return Find.element(LocatorType.XPATH, "//div[@class='delivery_option_price']");
	}
	
	public static WebElement rdo_Agreed() {
		return Find.element(LocatorType.XPATH, "//input[@id='cgv']");
	}
	
	public static WebElement btn_ProceedShipping() {
		return Find.element(LocatorType.XPATH, "//button[@name='processCarrier']");
	}
	
	public static WebElement lbl_TotalPricePayment() {
		return Find.element(LocatorType.XPATH, "//span[@id='total_price']");
	}
	
	public static WebElement btn_PayByBankWire() {
		return Find.element(LocatorType.XPATH, "//a[@class='bankwire']");
	}
	
	public static WebElement btn_ConfirmMyOrder() {
		return Find.element(LocatorType.XPATH, "//button[@class='button btn btn-default button-medium']");
	}
	
	public static WebElement lbl_Amount() {
		return Find.element(LocatorType.XPATH, "//strong[contains(text(),'52.99')]");
	}
	
	public static WebElement lbl_Owner() {
		return Find.element(LocatorType.XPATH, "//strong[contains(text(),'Pradeep Macharla')]");
	}
	
	public static WebElement lbl_Details() {
		return Find.element(LocatorType.XPATH, "//strong[contains(text(),'xyz')]");
	}
	
	public static WebElement lbl_Bank() {
		return Find.element(LocatorType.XPATH, "//strong[contains(text(),'RTP')]");
	}
	
}
