package components;

import java.io.IOException;

import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Login;
import pages.Scrum_Metrics_Submenu;
import utilities.Do;
import utilities.TestCase;
import utilities.Wait;

public class Cmp_SM_SignOut {

	public static void start() throws ActionException, IOException {
		TestCase.initializeStep("Clic en  menu izquierdo");
		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_Menu());
		TestCase.step();

		Wait.implicit(5);
		TestCase.initializeStep("Clic en Sign Out");
		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_SignOut());
		TestCase.step();

		Wait.implicit(5);
		TestCase.initializeStep("Verificar que te dirija a la pagina de inicio de sesion");
		if (Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Login.lbl_Login())) {
			TestCase.step();
		}
	}

}
