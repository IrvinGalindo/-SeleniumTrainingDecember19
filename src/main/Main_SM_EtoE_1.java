package main;

import java.io.IOException;

import enums.Action;
import enums.Browser;
import exceptions.ActionException;
import testCases.EndToEnd_ScrumMetrics_1;
import utilities.Do;
import utilities.Driver;
import utilities.TestCase;

public class Main_SM_EtoE_1 {

	public static void main(String args[]) throws ActionException, IOException {
		Driver.open(Browser.CHROME);
		try {
			TestCase.start(EndToEnd_ScrumMetrics_1.class.getSimpleName());
			EndToEnd_ScrumMetrics_1.execute();
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
			TestCase.status = false;
			Do.action(Action.TAKE_SCREENSHOT);
			TestCase.step();
			return;
		} finally {
			Driver.close();
			TestCase.finish();

		}
	}

}
