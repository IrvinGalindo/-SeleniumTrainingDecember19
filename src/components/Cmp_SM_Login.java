package components;

import java.io.IOException;

import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Login;
import pages.Scrum_Metrics_Navbar;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.TestCase;
import utilities.Wait;

public class Cmp_SM_Login {

	public static void start(User_ScrumMetrics user) throws ActionException, IOException {
		TestCase.initializeStep("Navegar a la pagina de Scrum Metrics");
		Do.action(Action.NAVIGATE, "http://192.168.0.106:3000");
		TestCase.step();

		TestCase.initializeStep("Clic en Getting Started");
		Do.action(Action.CLICK, Scrum_Metrics_Navbar.btn_GettingStared());
		TestCase.step();

		Wait.implicit(5);
		TestCase.initializeStep("Clic en Login");
		Do.action(Action.CLICK, Scrum_Metrics_Navbar.menu_Login());
		TestCase.step();

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
