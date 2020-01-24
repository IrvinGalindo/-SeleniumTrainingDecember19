package testCases;

import java.io.IOException;

import components.Cmp_SM_Login;
import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Submenu;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.TestCase;

/*
 * Iniciar sesión con un usuario registrado.
 * Validar que la aplicación permita iniciar sesión con un usuario valido y muestre la pagina principal.
 */

public class US4_AUTC_FR001 {
	public static void execute() throws ActionException, IOException {
		
		User_ScrumMetrics user = new User_ScrumMetrics("bmed123", "contra123");
		Cmp_SM_Login.start(user);
		
		TestCase.initializeStep("Verifica el encabezado que contenga el nombre de usuario");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Submenu.h1_Name());
		TestCase.step();
	}

}
