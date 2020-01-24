package testCases;

import java.io.IOException;
import components.Cmp_SM_Login;
import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Login;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.TestCase;

public class US4_AUTC_FR002 {
	public static void execute() throws ActionException, IOException {

		User_ScrumMetrics user = new User_ScrumMetrics("", "contra123");
		Cmp_SM_Login.start(user);
		
		TestCase.initializeStep("Verificar que aparezca la etiqueta donde se requiere un nombre de usuario");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Login.lbl_Username());
		TestCase.step();
	}
}
