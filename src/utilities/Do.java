package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import enums.Action;
import enums.MouseOption;
import enums.Option;
import exceptions.ActionException;

public class Do {
	public static WebDriver driver = Driver.driver;

	public static void action(Action action, String value) throws ActionException, IOException {
		switch (action) {
		case NAVIGATE:
			if (value.contains("https://") || value.contains("http://")) {
				driver.navigate().to(value);
			} else {
				value = "https://" + value;
				driver.navigate().to(value);
			}
			Do.action(Action.TAKESCREENSHOT);
			break;

		default:
			throw new ActionException("Invalid action");
		}
	}

	public static void action(Action action) throws ActionException, IOException {
		switch (action) {
		case REFRESH:
			driver.navigate().refresh();
			break;

		case FORWARD:
			driver.navigate().forward();
			break;

		case BACK:
			driver.navigate().back();
			break;

		case TAKESCREENSHOT:
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile = new File(TestCase.getImageUri());
			FileUtils.copyFile(SrcFile, DestFile);
			break;

		default:
			throw new ActionException("Invalid Action");
		}
	}

	public static void action(Action action, String value, WebElement element) throws ActionException, IOException {
		switch (action) {
		case TYPE:
			Script.highlight(element);
			element.sendKeys(value);
			Script.withoutHighlight(element);
			break;
		default:
			throw new ActionException("Invalid Action");
		}

	}

	public static boolean action(Action action, WebElement element) throws ActionException, IOException {
		switch (action) {
		case CLICK:
			try {
				Script.highlight(element);
				element.click();
				Script.withoutHighlight(element);
				return true;
			} catch (Exception e) {
				return false;
			}
		case VERIFY_IF_EXIST:
			Do.action(Action.TAKESCREENSHOT);
			return element != null ? true : false;

		default:
			throw new ActionException("Invalid Action");
		}
	}

	public static void action(Action action, Option option, int value, WebElement element) throws ActionException, IOException {
		if (action == Action.SELECT) {

			Select combo = new Select(element);
			switch (option) {
			case BY_INDEX:
				Script.highlight(element);
				combo.selectByIndex(value);
				break;
			default:
				throw new ActionException("Invalid Option");
			}
		} else {
			throw new ActionException("Invalid Action");
		}
	}

	public static void action(Action action, Option option, String value, WebElement element) throws ActionException, IOException {
		if (action == Action.SELECT) {
			Select combo = new Select(element);
			switch (option) {
			case BY_VALUE:
				Script.highlight(element);
				combo.selectByValue(value);
				break;
			case BY_VISIBLE_TEXT:
				Script.highlight(element);
				combo.selectByVisibleText(value);
				break;
			default:
				throw new ActionException("Invalid Option");
			}
		} else {
			throw new ActionException("Invalid Action");
		}
	}

	public static void action(Action action, MouseOption mouseOption, WebElement element) throws ActionException, IOException {
		if (action == Action.MOUSE) {
			switch (mouseOption) {
			case MOUSE_OVER:
				Actions actions = new Actions(driver);
				Script.highlight(element);
				actions.moveToElement(element).perform();
				Script.withoutHighlight(element);
				break;

			default:
				throw new ActionException("Invalid Option");
			}

		} else {
			throw new ActionException("Invalid Option");
		}
	}

}
