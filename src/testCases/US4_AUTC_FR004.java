package testCases;

import java.io.IOException;

import components.Cmp_SM_Login;
import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Login;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.TestCase;

public class US4_AUTC_FR004 {
	public static void execute() throws ActionException, IOException {
		User_ScrumMetrics user = new User_ScrumMetrics("bmed123", "contramala");
		Cmp_SM_Login.start(user);

		TestCase.initializeStep("Verificar que se limpie el campo nombre de usuario");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Login.txt_Username());
		TestCase.step();
		
		TestCase.initializeStep("Verificar que se limpie el campo contrasenia");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Login.txt_Password());
		TestCase.step();
		
		TestCase.initializeStep("Verificar que se muestre un mensaje de error");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Login.lbl_ErrorMessage());
		TestCase.step();
		
	}
}