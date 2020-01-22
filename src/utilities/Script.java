package utilities;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import enums.Action;
import exceptions.ActionException;

public class Script {
	public static JavascriptExecutor js = (JavascriptExecutor) Driver.driver;

	public static void highlight(WebElement element) throws ActionException, IOException {
		String border = "#f00 solid 5px";
		js.executeScript("arguments[0].style.outline = '" + border + "'; ", element);
		Do.action(Action.TAKESCREENSHOT);
	}

	public static void withoutHighlight(WebElement element) {
		try {
			Thread.sleep(1000);
			js.executeScript("arguments[0].style.outline = '#f00 solid 0px'; ", element);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block e.printStackTrace();
		}
	}
}
