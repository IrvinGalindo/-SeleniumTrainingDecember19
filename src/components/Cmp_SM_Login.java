package components;

import java.io.IOException;

import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Login;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.TestCase;

public class Cmp_SM_Login {

	public static void start(User_ScrumMetrics user) throws ActionException, IOException {

		TestCase.initializeStep("Escribir nombre de usuario");
		Do.action(Action.TYPE, user.getUsername(), Scrum_Metrics_Login.txt_Username());
		TestCase.step();

		TestCase.initializeStep("Escribir contrasenia");
		Do.action(Action.TYPE, user.getPassword(), Scrum_Metrics_Login.txt_Password());
		TestCase.step();

		TestCase.initializeStep("Clic en el boton de Login");
		Do.action(Action.CLICK, Scrum_Metrics_Login.btn_Login());
		TestCase.step();
	}
}
