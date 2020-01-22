package components;

import java.io.IOException;

import enums.Action;
import enums.Option;
import exceptions.ActionException;
import pages.AutomationPractice_Authentication;
import pages.AutomationPractice_CreateAnAccount;
import pages.AutomationPractice_MyAccount;
import pojos.Person;
import utilities.TestCase;
import utilities.Do;
import utilities.Wait;

public class Cmp_CreateAnAccount {
	
	public static void start(Person person) throws ActionException, IOException {
		TestCase.initializeStep("Type email");
		Wait.implicit(5);
		Do.action(Action.TYPE, person.getEmail(), AutomationPractice_Authentication.txt_EmailAddress());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Click on Create Account button");
		Do.action(Action.CLICK, AutomationPractice_Authentication.btn_CreateAnAccount());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Verify If text exist");
		//Wait.Explicit(Expected.VISIBILITY_OF, 5, AutomationPractice_CreateAnAccount.lbl_CreateAnAccount());
		Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_CreateAnAccount.lbl_CreateAnAccount());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Select gender");
		Do.action(Action.CLICK, AutomationPractice_CreateAnAccount.rdo_Title());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Type first name");
		Do.action(Action.TYPE, person.getFirstName(), AutomationPractice_CreateAnAccount.txt_FirstName());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Type last name");
		Do.action(Action.TYPE, person.getLastName(), AutomationPractice_CreateAnAccount.txt_LastName());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Type email");
		Do.action(Action.TYPE, person.getPassword(), AutomationPractice_CreateAnAccount.txt_Password());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Select day of birth");
		Do.action(Action.SELECT, Option.BY_VALUE, person.getDayOfBirth(), AutomationPractice_CreateAnAccount.select_Days());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Select month of birth");
		Do.action(Action.SELECT, Option.BY_VALUE, person.getMonthOfBirth(), AutomationPractice_CreateAnAccount.select_Month());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Select year of birth");
		Do.action(Action.SELECT, Option.BY_VALUE, person.getYearOfBirth(), AutomationPractice_CreateAnAccount.select_Years());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Type address");
		Do.action(Action.TYPE, person.getAddress(), AutomationPractice_CreateAnAccount.txt_Address());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Type city");
		Do.action(Action.TYPE, person.getCity(), AutomationPractice_CreateAnAccount.txt_City());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Type state");
		Do.action(Action.SELECT, Option.BY_VISIBLE_TEXT, person.getState(), AutomationPractice_CreateAnAccount.select_state());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Type Zipe Code");
		Do.action(Action.TYPE, person.getZipCode(), AutomationPractice_CreateAnAccount.txt_ZipCode());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Type Mobile");
		Do.action(Action.TYPE, person.getMobile(), AutomationPractice_CreateAnAccount.txt_MobilePhone());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Type Alias of Address");
		Do.action(Action.TYPE, person.getAlias(), AutomationPractice_CreateAnAccount.txt_Alias());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Click on Register button");
		Do.action(Action.CLICK, AutomationPractice_CreateAnAccount.btn_Register());
		TestCase.status = true;
		TestCase.step();

		TestCase.initializeStep("Verify if account is created");
		Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_MyAccount.lbl_MyAccount());
		TestCase.status = true;
		TestCase.step();

	}

}
