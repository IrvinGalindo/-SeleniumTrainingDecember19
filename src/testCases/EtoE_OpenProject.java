package testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebElement;

import components.Cmp_LoginOptionNavbar;
import components.Cmp_SM_Login;
import components.Cmp_SM_SignOut;
import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Project;
import pages.Scrum_Metrics_Submenu;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.Script;
import utilities.TestCase;
import utilities.Wait;

public class EtoE_OpenProject {

	public static void execute(String projectToSearch)
			throws ActionException, IOException, InterruptedException, AWTException {

		Cmp_LoginOptionNavbar.start();

		TestCase.isSubComp = true;
		Cmp_SM_Login.start(new User_ScrumMetrics("IRGAL", "contra123"));
		TestCase.isSubComp = false;

		TestCase.initializeStep("Dar clic en el submenu");
		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_Menu());
		TestCase.step();

		TestCase.initializeStep("Dar clic en la opcion My Project");
		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_MyProject());
		TestCase.step();

		boolean ifExist = false;
		TestCase.initializeStep("Dar clic en el proyecto " + projectToSearch);

		for (int indexProj = 0; indexProj < Scrum_Metrics_Project.lbl_Projects().size(); indexProj++) {
			WebElement element = Scrum_Metrics_Project.lbl_Projects().get(indexProj);

			if (element.getText().contains(projectToSearch)) {
				if (!element.isDisplayed()) {
					Script.scroll(element);
					Wait.implicit(3);
				}
				ifExist = true;
				Do.action(Action.CLICK, element);
				TestCase.step();
				TestCase.initializeStep("Verificar que se despliegue la informacion del proyecto");
				Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Project.lbl_details(indexProj + 1));
				TestCase.step();
				
				TestCase.isSubComp = true;
				Cmp_SM_SignOut.start();
				TestCase.isSubComp = false;

				break;
			}
		}

		if (!ifExist) {
			throw new ActionException("Project not found");
		}

	}

}
