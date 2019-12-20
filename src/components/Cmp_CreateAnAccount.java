package components;

import enums.Action;
import enums.Expected;
import enums.Option;
import exceptions.ActionException;
import pages.AutomationPractice_Authentication;
import pages.AutomationPractice_CreateAnAccount;
import pages.AutomationPractice_MyAccount;
import pojos.Person;
import utilities.Case;
import utilities.Do;
import utilities.Wait;

public class Cmp_CreateAnAccount {
	
	public static void start(Person person) throws ActionException {
		Case.step(Case.stepNum++, "Type email");
		Wait.implicit(5);
		Do.action(Action.TYPE, person.getEmail(), AutomationPractice_Authentication.txt_EmailAddress());
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
		Do.action(Action.TYPE, person.getFirstName(), AutomationPractice_CreateAnAccount.txt_FirstName());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type last name");
		Do.action(Action.TYPE, person.getLastName(), AutomationPractice_CreateAnAccount.txt_LastName());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type email");
		Do.action(Action.TYPE, person.getPassword(), AutomationPractice_CreateAnAccount.txt_Password());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Select day of birth");
		Do.action(Action.SELECT, Option.BY_VALUE, person.getDayOfBirth(), AutomationPractice_CreateAnAccount.select_Days());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Select month of birth");
		Do.action(Action.SELECT, Option.BY_VALUE, person.getMonthOfBirth(), AutomationPractice_CreateAnAccount.select_Month());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Select year of birth");
		Do.action(Action.SELECT, Option.BY_VALUE, person.getYearOfBirth(), AutomationPractice_CreateAnAccount.select_Years());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type address");
		Do.action(Action.TYPE, person.getAddress(), AutomationPractice_CreateAnAccount.txt_Address());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type city");
		Do.action(Action.TYPE, person.getCity(), AutomationPractice_CreateAnAccount.txt_City());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type state");
		Do.action(Action.SELECT, Option.BY_VISIBLE_TEXT, person.getState(), AutomationPractice_CreateAnAccount.select_state());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type Zipe Code");
		Do.action(Action.TYPE, person.getZipCode(), AutomationPractice_CreateAnAccount.txt_ZipCode());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type Mobile");
		Do.action(Action.TYPE, person.getMobile(), AutomationPractice_CreateAnAccount.txt_MobilePhone());
		Case.status = true;
		Case.printResult();

		Case.step(Case.stepNum++, "Type Alias of Address");
		Do.action(Action.TYPE, person.getAlias(), AutomationPractice_CreateAnAccount.txt_Alias());
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
