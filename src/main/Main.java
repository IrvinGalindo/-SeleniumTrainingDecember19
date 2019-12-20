package main;

import org.openqa.selenium.NoSuchElementException;

import com.gargoylesoftware.htmlunit.Cache;

import enums.Action;
import enums.Browser;
import enums.LocatorType;
import enums.Option;
import exceptions.ActionException;
import testCases.CreateAccountInAutomationPracticePage;
import testCases.SearchHexawareInGoogle;
import utilities.Case;
import utilities.Do;
import utilities.Driver;
import utilities.Excel;
import utilities.Find;
import utilities.Wait;

public class Main {
	public static void main(String args[]) {
		Driver.Open(Browser.CHROME);
		try {
		CreateAccountInAutomationPracticePage.execute();
		}catch (Exception e) {
			Case.status = false;
			Case.printResult();
			return;
		}
		/*
		 * Excel.read("./files/searchInGoogle.xlsx"); try {
		 * SearchHexawareInGoogle.iteration(); Driver.Close(); } catch (ActionException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

}
