package testCases;


import components.Cmp_CreateAnAccount;
import enums.Action;
import exceptions.ActionException;
import pojos.Person;
import utilities.Case;
import utilities.Do;

public class CreateAccountInAutomationPracticePage {

	public static void execute() throws ActionException {

		Case.step(Case.stepNum++, "Navigate to the page");
		Do.action(Action.NAVIGATE, "http://automationpractice.com/index.php?controller=authentication&back=identity");
		Case.status = true;
		Case.printResult();
		Person persona = new Person("Raul", "Martinez", "raulMar@gmail.com", 
				"raul123", "29", "05", "96", "calle 13", "Saltillo","Arkansas", "92039", "8441002932", "la casa azul");
		Cmp_CreateAnAccount.start(persona);
		
	}

}
