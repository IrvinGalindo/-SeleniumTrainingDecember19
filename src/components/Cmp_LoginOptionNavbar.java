package components;

import java.io.IOException;

import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Navbar;
import utilities.Do;
import utilities.TestCase;
import utilities.Wait;

public class Cmp_LoginOptionNavbar {

	public static void start() throws ActionException, IOException {

		TestCase.initializeStep("Navegar a la pagina de Scrum Metrics");
		Do.action(Action.NAVIGATE, "http://192.168.0.106:3000");
		TestCase.step();

		TestCase.initializeStep("Clic en Getting Started");
		Do.action(Action.CLICK, Scrum_Metrics_Navbar.btn_GettingStared());
		TestCase.step();

		TestCase.initializeStep("Clic en Login");
		Do.action(Action.CLICK, Scrum_Metrics_Navbar.menu_Login());
		TestCase.step();

		Wait.implicit(5);

	}

}
