package testCases;

import java.io.IOException;

import components.Cmp_SM_Login;
import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Login;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.TestCase;

public class US4_AUTC_FR003 {
	public static void execute() throws ActionException, IOException {
		User_ScrumMetrics user = new User_ScrumMetrics("bmed123", "");
		Cmp_SM_Login.start(user);

		TestCase.initializeStep("Verificar que aparezca la etiqueta donde se requiere una contrasenia para el usuario");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Login.lbl_Password());
		TestCase.step();
	}
}
