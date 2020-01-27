package components;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;

import enums.Action;
import enums.Alerts;
import enums.Expected;
import enums.LocatorType;
import exceptions.ActionException;
import pages.Scrum_Metrics_Register;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.Find;
import utilities.TestCase;
import utilities.Wait;

public class Cmp_RegisterModule {

	public static void execute(User_ScrumMetrics user) throws NoSuchElementException, ActionException, IOException, AWTException {

		Cmp_RegisterOptionNavbar.start();

		if (Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Register.lbl_CreateNewUser())) {

			TestCase.initializeStep("Escribir un nombre en el campo FullName");
			Do.action(Action.TYPE, user.getFullName(), Scrum_Metrics_Register.txt_FullName());
			TestCase.step();

			TestCase.initializeStep("Escribir un email en el campo Email");
			Do.action(Action.TYPE, user.getEmail(), Scrum_Metrics_Register.txt_Email());
			TestCase.step();

			TestCase.initializeStep("Escribir un username en el campo Username");
			Do.action(Action.TYPE, user.getUsername(), Scrum_Metrics_Register.txt_UserName());
			TestCase.step();

			TestCase.initializeStep("Escribir la contrasenia en el campo Password");
			Do.action(Action.TYPE, user.getPassword(), Scrum_Metrics_Register.txt_Password());
			TestCase.step();

			TestCase.initializeStep("Escribir la contrasenia en el campo Confirm Password");
			Do.action(Action.TYPE, user.getPassword(), Scrum_Metrics_Register.txt_ConfirmPassword());
			TestCase.step();

			TestCase.initializeStep("Aceptar terminos y condiciones");
			Do.action(Action.CLICK, Scrum_Metrics_Register.chck_TermsConditions());
			TestCase.step();

			TestCase.initializeStep("Dar clic en el boton Create an account");
			Do.action(Action.CLICK, Scrum_Metrics_Register.btn_CreateAnAccount());
			TestCase.step();

			Wait.implicit(5);
			TestCase.initializeStep("Verificar que el mensaje en alerta sea User created");
			Do.action(Alerts.CLICK_ACCEPT);
			TestCase.step();

			Wait.Explicit(Expected.VISIBILITY_OF, 10, Find.element(LocatorType.CSSSELECTOR, "div#outer-div>div>h1"));
			TestCase.initializeStep("Verificar que la pagina te redirija al modulo de inicio de sesion");
			Do.action(Action.CLICK, Find.element(LocatorType.CSSSELECTOR, "div#outer-div>div>h1"));
			TestCase.step();

		} else {
			throw new ActionException("Create an account label not found");
		}
	}

}
