package testCases;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;

import components.Cmp_RegisterModule;
import components.Cmp_SM_CreateProject;
import components.Cmp_SM_Login;
import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Project;
import pages.Scrum_Metrics_Submenu;
import pojos.Project;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.TestCase;
import utilities.Wait;

public class EndToEnd_ScrumMetrics_1 {

	public static void execute() throws ActionException, IOException, InterruptedException, AWTException {

		Cmp_RegisterModule
				.start(new User_ScrumMetrics("OldBran", "contra123", "Brandon Medina Urbina", "OldBran@gmail.com"));
		Wait.implicit(5);
		TestCase.isSubComp = true;
		Cmp_SM_Login.start(new User_ScrumMetrics("OldBran", "contra123"));
		TestCase.isSubComp = false;

		TestCase.initializeStep("Clic en New Project");
		Do.action(Action.CLICK, Scrum_Metrics_Project.lnk_CreateNewProject());
		TestCase.step();

		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("Scrum Master", "OldBran");
		hashMap.put("Product Owner", "IRGAL");
		hashMap.put("Team Member", "jarasdeboy");

		Project project = new Project("EtoEPruebaOne", "Descripcion", "C:\\Users\\Training\\Desktop\\Koala.jpg",
				hashMap, "1 January 2020", "31 January 2020");

		TestCase.isSubComp = true;
		Cmp_SM_CreateProject.start(project);
		TestCase.isSubComp = false;

		TestCase.initializeStep("Clic en el menu izquierdo");
		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_Menu());
		TestCase.step();

		Wait.implicit(5);
		TestCase.initializeStep("Clic en el apartado My Projects");
		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_MyProject());
		TestCase.step();

		TestCase.initializeStep("Dar refresh a la pagina para visualizar los proyectos");
		Do.action(Action.REFRESH);
		TestCase.step();

		Wait.implicit(5);
		TestCase.initializeStep("Verificar que el proyecto haya sido creado");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Project.lbl_Project(project.getNombreproyecto()));
		TestCase.step();

		TestCase.initializeStep("Clic en el menu izquierdo");
		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_Menu());
		TestCase.step();

		Wait.implicit(5);
		TestCase.initializeStep("Clic en Sign Out");
		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_SignOut());
		TestCase.step();

	}
}
