package testCases;

import java.io.IOException;

import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Login;
import pages.Scrum_Metrics_Navbar;
import utilities.Do;
import utilities.TestCase;
import utilities.Wait;

public class US4_AUTC_FR005 {
	public static void execute() throws ActionException, IOException {
		
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
		
		TestCase.initializeStep("Clic en el boton Google");
		Do.action(Action.CLICK, Scrum_Metrics_Login.btn_Google());
		TestCase.step();
		
		TestCase.initializeStep("Verificar que te envie a la pagina de autenticacion de Google");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Login.lbl_ErrorMessage());
		TestCase.step();
	}
}