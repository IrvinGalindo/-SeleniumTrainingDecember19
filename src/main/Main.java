package main;

import org.openqa.selenium.NoSuchElementException;

import enums.Action;
import enums.Browser;
import enums.LocatorType;
import enums.Option;
import exceptions.ActionException;
import testCases.SearchHexawareInGoogle;
import utilities.Do;
import utilities.Driver;
import utilities.Excel;
import utilities.Find;
import utilities.Wait;

public class Main {
	public static void main(String args[]) {
		Driver.Open(Browser.CHROME);
		
		try {
			Do.action(Action.NAVIGATE, "http://automationpractice.com/index.php?controller=authentication&back=identity");
			Do.action(Action.TYPE, "dumi1@dumi.com", Find.Element(LocatorType.ID, "email_create"));
			Do.action(Action.CLICK, Find.Element(LocatorType.ID, "SubmitCreate"));
			Wait.implicit(5);
			Do.action(Action.SELECT, Option.BY_VISIBLE_TEXT, "13  ", Find.Element(LocatorType.XPATH, "//div[@id='uniform-days']/select[@id='days']"));
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		 * Excel.read("./files/searchInGoogle.xlsx"); try {
		 * SearchHexawareInGoogle.iteration(); Driver.Close(); } catch (ActionException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

}
