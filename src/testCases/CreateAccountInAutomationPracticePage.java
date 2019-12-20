package testCases;

import enums.Action;
import enums.Expected;
import enums.Option;
import exceptions.ActionException;
import pages.AutomationPractice_Authentication;
import pages.AutomationPractice_CreateAnAccount;
import pages.AutomationPractice_MyAccount;
import utilities.Case;
import utilities.Do;
import utilities.Wait;

public class CreateAccountInAutomationPracticePage {

	public static void execute() throws ActionException {

		Case.step(Case.stepNum++, "Navigate to the page");
		Do.action(Action.NAVIGATE, "http://automationpractice.com/index.php?controller=authentication&back=identity");
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type email");
		Wait.implicit(5);
		Do.action(Action.TYPE, "dummy16@olo.org", AutomationPractice_Authentication.txt_EmailAddress());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Click on Create Account button");
		Do.action(Action.CLICK, AutomationPractice_Authentication.btn_CreateAnAccount());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Verify If text exist");
		Wait.Explicit(Expected.VISIBILITY_OF, 5, AutomationPractice_CreateAnAccount.lbl_CreateAnAccount());
		Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_CreateAnAccount.lbl_CreateAnAccount());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Select gender");
		Do.action(Action.CLICK, AutomationPractice_CreateAnAccount.rdo_Title());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type first name");
		Do.action(Action.TYPE, "Irvin", AutomationPractice_CreateAnAccount.txt_FirstName());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type last name");
		Do.action(Action.TYPE, "Galindo", AutomationPractice_CreateAnAccount.txt_LastName());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type email");
		Do.action(Action.TYPE, "hexaware.123", AutomationPractice_CreateAnAccount.txt_Password());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Select day of birth");
		Do.action(Action.SELECT, Option.BY_VALUE, "23", AutomationPractice_CreateAnAccount.select_Days());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Select month of birth");
		Do.action(Action.SELECT, Option.BY_VALUE, "12", AutomationPractice_CreateAnAccount.select_Month());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Select year of birth");
		Do.action(Action.SELECT, Option.BY_VALUE, "1995", AutomationPractice_CreateAnAccount.select_Years());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type address");
		Do.action(Action.TYPE, "Benito Juarez 302", AutomationPractice_CreateAnAccount.txt_Address());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type city");
		Do.action(Action.TYPE, "Saltillo", AutomationPractice_CreateAnAccount.txt_City());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type state");
		Do.action(Action.SELECT, Option.BY_VISIBLE_TEXT, "Arkansas", AutomationPractice_CreateAnAccount.select_state());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type Zipe Code");
		Do.action(Action.TYPE, "25092", AutomationPractice_CreateAnAccount.txt_ZipCode());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type Mobile");
		Do.action(Action.TYPE, "8441234099", AutomationPractice_CreateAnAccount.txt_MobilePhone());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type Alias of Address");
		Do.action(Action.TYPE, "La calle azul", AutomationPractice_CreateAnAccount.txt_Alias());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Click on Register button");
		Do.action(Action.CLICK, AutomationPractice_CreateAnAccount.btn_Register());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Verify if account is created");
		Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_MyAccount.lbl_MyAccount());
		Case.status = true;
		Case.printResult();
	}

}
