package components;

import java.io.IOException;

import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Navbar;
import utilities.Do;
import utilities.TestCase;
import utilities.Wait;

public class Cmp_RegisterOptionNavbar {

	public static void start() throws ActionException, IOException {
		TestCase.initializeStep("Navegar a la pagina Scrum Metric");
		Do.action(Action.NAVIGATE, "http://192.168.0.106:3000");
		TestCase.step();

		TestCase.initializeStep("Dar clic en el boton Getting Started");
		Do.action(Action.CLICK, Scrum_Metrics_Navbar.btn_GettingStared());
		TestCase.step();

		TestCase.initializeStep("Seleccionar la opcion Register");
		Do.action(Action.CLICK, Scrum_Metrics_Navbar.menu_Register());
		TestCase.step();

		Wait.implicit(5);
	}

}
