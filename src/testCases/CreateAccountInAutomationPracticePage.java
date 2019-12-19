package testCases;

import enums.Action;
import enums.Expected;
import enums.Option;
import exceptions.ActionException;
import pages.AutomationPractice_Authentication;
import pages.AutomationPractice_CreateAnAccount;
import pages.AutomationPractice_MyAccount;
import utilities.Do;
import utilities.Wait;

public class CreateAccountInAutomationPracticePage {

	public static void execute() {
		try {
			System.out.print("Step 1: ");
			Do.action(Action.NAVIGATE,
					"http://automationpractice.com/index.php?controller=authentication&back=identity");
			System.out.println("passed");
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.print("unpassed_" + e.getMessage());
		}

		try {
			System.out.print("Step 2: ");
			Wait.implicit(5);
			Do.action(Action.TYPE,"mainle@olo.com",AutomationPractice_Authentication.txt_EmailAddress());
			System.out.println("passed");
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}

		try {
			System.out.println("Step 3: ");
			Do.action(Action.CLICK, AutomationPractice_Authentication.btn_CreateAnAccount());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 4: ");
			Wait.Explicit(Expected.VISIBILITY_OF, 5, AutomationPractice_CreateAnAccount.lbl_CreateAnAccount());
			Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_CreateAnAccount.lbl_CreateAnAccount());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 5: ");
			Do.action(Action.CLICK, AutomationPractice_CreateAnAccount.rdo_Title());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 6: ");
			Do.action(Action.TYPE, "Irvin", AutomationPractice_CreateAnAccount.txt_FirstName());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 7: ");
			Do.action(Action.TYPE, "Galindo", AutomationPractice_CreateAnAccount.txt_LastName());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 8: ");
			Do.action(Action.TYPE, "hexaware.123", AutomationPractice_CreateAnAccount.txt_Password());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 9: ");
			Do.action(Action.SELECT, Option.BY_VALUE, "23", AutomationPractice_CreateAnAccount.select_Days());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 10: ");
			Do.action(Action.SELECT, Option.BY_VALUE, "12", AutomationPractice_CreateAnAccount.select_Month());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 11: ");
			Do.action(Action.SELECT, Option.BY_VALUE, "1995", AutomationPractice_CreateAnAccount.select_Years());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 12: ");
			Do.action(Action.TYPE, "Benito Juarez 302", AutomationPractice_CreateAnAccount.txt_Address());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 13: ");
			Do.action(Action.TYPE, "Saltillo", AutomationPractice_CreateAnAccount.txt_City());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 14: ");
			Do.action(Action.SELECT, Option.BY_VISIBLE_TEXT, "Arkansas", AutomationPractice_CreateAnAccount.select_state());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 15: ");
			Do.action(Action.TYPE, "25092", AutomationPractice_CreateAnAccount.txt_ZipCode());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 16: ");
			Do.action(Action.TYPE, "8441234099", AutomationPractice_CreateAnAccount.txt_MobilePhone());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 17: ");
			Do.action(Action.TYPE, "La calle azul", AutomationPractice_CreateAnAccount.txt_Alias());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
		try {
			System.out.println("Step 18: ");
			Do.action(Action.CLICK, AutomationPractice_CreateAnAccount.btn_Register());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}

		try {
			System.out.println("Step 19: ");
			Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_MyAccount.lbl_MyAccount());
		} catch (ActionException e) {
			// TODO Auto-generated catch block
			System.out.println("unpassed" + e.getMessage());
		}
	}

}
