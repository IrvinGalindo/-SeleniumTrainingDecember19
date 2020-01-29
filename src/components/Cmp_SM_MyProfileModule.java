package components;

import java.awt.AWTException;
import java.io.IOException;

import enums.Action;
import enums.Alerts;
import exceptions.ActionException;
import pages.Scrum_Metrics_MyProfile;
import utilities.Do;
import utilities.TestCase;

public class Cmp_SM_MyProfileModule {

	public static void start(String fullName, String email) throws ActionException, IOException, AWTException {
		
		TestCase.initializeStep("Dar clic en el boton Unlock/Lock name");
		Do.action(Action.CLICK, Scrum_Metrics_MyProfile.btn_UnlockName());
		TestCase.step();
		
		TestCase.initializeStep("Escribir el nuevo nombre");
		Do.action(Action.TYPE, fullName, Scrum_Metrics_MyProfile.lbl_FullName());
		TestCase.step();
		
		TestCase.initializeStep("Dar clic en el boton Unlock/Lock email");
		Do.action(Action.CLICK, Scrum_Metrics_MyProfile.btn_UnlockEmail());
		TestCase.step();
		
		TestCase.initializeStep("Escribir el nuevo email");
		Do.action(Action.TYPE, email, Scrum_Metrics_MyProfile.lbl_Email());
		TestCase.step();
		
		TestCase.initializeStep("Dar clic en el boton save");
		Do.action(Action.CLICK, Scrum_Metrics_MyProfile.btn_Save());
		TestCase.step();
		
		TestCase.initializeStep("Seleccionar el boton Accept en el alert");
		Do.action(Alerts.CLICK_ACCEPT);
		TestCase.step();
		
		TestCase.initializeStep("Refrescar la pagina");
		Do.action(Action.REFRESH);
		TestCase.step();
		
		TestCase.initializeStep("Validar que el nombre cambio en el label");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_MyProfile.lnk_Profile());
		TestCase.step();
	}
}
