package utilities;

import org.openqa.selenium.WebElement;

public class Convert {

	public static double StringToInt(WebElement element) {
		String result = element.getText();
		result = result.substring(1);		
		return Double.parseDouble(result);
	}
	
}
