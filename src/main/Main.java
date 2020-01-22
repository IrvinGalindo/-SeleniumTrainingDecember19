package main;

import java.io.IOException;

import enums.Action;
import enums.Browser;
import exceptions.ActionException;
import testCases.BuyAnEveningDress;
import utilities.TestCase;
import utilities.Do;
import utilities.Driver;

public class Main {

	public static void main(String args[]) throws ActionException, IOException {
		Driver.open(Browser.CHROME);
		try {
			TestCase.start(BuyAnEveningDress.class.getSimpleName());
			BuyAnEveningDress.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			TestCase.status = false;
			Do.action(Action.TAKESCREENSHOT);
			TestCase.step();
			return;
		} finally {
			Driver.close();
			TestCase.finish();

		}

	}

}
