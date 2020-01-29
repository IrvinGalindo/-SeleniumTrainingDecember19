package main;

import java.io.IOException;

import enums.Action;
import enums.Browser;
import exceptions.ActionException;
import testCases.EtoE_OpenProject;
import utilities.Do;
import utilities.Driver;
import utilities.TestCase;

public class Main_SM_EtoE_3 {
	
	public static void main(String []args) throws ActionException, IOException {

		Driver.open(Browser.CHROME);
		try {
			TestCase.start(EtoE_OpenProject.class.getSimpleName());
			EtoE_OpenProject.execute("EjemploPO");
		} catch (Exception e) {
			System.out.println(e.getMessage());
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
