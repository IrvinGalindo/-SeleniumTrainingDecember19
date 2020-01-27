package components;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;

import enums.Action;
import enums.BotKey;
import enums.Expected;
import enums.Option;
import exceptions.ActionException;
import pages.Scrum_Metrics_Project;
import pojos.Project;
import utilities.Do;
import utilities.Press;
import utilities.TestCase;
import utilities.Wait;

public class Cmp_SM_CreateProject {

	public static void start(Project project) throws ActionException, IOException, InterruptedException, AWTException {

		TestCase.initializeStep("Clic en New Project");
		Do.action(Action.CLICK, Scrum_Metrics_Project.lnk_CreateNewProject());
		TestCase.step();

		TestCase.initializeStep("Escribir el nombre del proyecto");
		Do.action(Action.TYPE, project.getNombreproyecto(), Scrum_Metrics_Project.txt_ProjectName());
		TestCase.step();

		TestCase.initializeStep("Escribir la descripcion del proyecto");
		Do.action(Action.TYPE, project.getDescripcion(), Scrum_Metrics_Project.txt_ProjectDesc());
		TestCase.step();

		TestCase.initializeStep("Cambiar la foto");
		Do.action(Action.TYPE, project.getPhotoURL(), Scrum_Metrics_Project.txt_Photo());
		TestCase.step();

		TestCase.initializeStep("Verifica que se haya cambiado la imagen");
		Do.action(Action.VERIFY_IF_EXIST, Scrum_Metrics_Project.img_Photo());
		TestCase.step();

		addMembers(project.getMembers());

		TestCase.initializeStep("Clic en Members ");
		Do.action(Action.CLICK, Scrum_Metrics_Project.btn_Members());
		TestCase.step();

		Press.Key(BotKey.TAB);
		for (WebElement element : Scrum_Metrics_Project.lbl_Members()) {
			for (Map.Entry<String, String> member : project.getMembers().entrySet()) {
				if (element.getText().contains(member.getValue())) {
					TestCase.initializeStep("Verificar que el usuario: " + member.getValue() + " fue creado");
					Do.action(Action.VERIFY_IF_EXIST, element);
					TestCase.step();
					break;
				}
			}
		}

		TestCase.initializeStep("Clic opcion End Date");
		Do.action(Action.CLICK, Scrum_Metrics_Project.checkb_EndDate());
		TestCase.step();

		TestCase.initializeStep("Clic en el icono de calendario Start Date");
		Do.action(Action.CLICK, Scrum_Metrics_Project.btn_StartDate());
		TestCase.step();

		TestCase.initializeStep("Seleccionar el dia de inicio de fecha del proyecto");
		Do.action(Action.CLICK, Scrum_Metrics_Project.btn_DayOfTheMonthSD(project.getStartdate()));
		TestCase.step();

		Wait.Explicit(Expected.ELEMENT_TO_BE_CLICKABLE, 5, Scrum_Metrics_Project.btn_EndDate());
		TestCase.initializeStep("Clic en el icono de calendario End Date");
		Do.action(Action.CLICK, Scrum_Metrics_Project.btn_EndDate());
		TestCase.step();

		TestCase.initializeStep("Seleccionar el dia de final de la fecha del proyecto");
		Do.action(Action.CLICK, Scrum_Metrics_Project.btn_DayOfTheMonthED(project.getEnddate()));
		TestCase.step();

		TestCase.initializeStep("Clic en el boton Create");
		Do.action(Action.CLICK, Scrum_Metrics_Project.btn_Create());
		TestCase.step();

	}

	private static void addMembers(HashMap<String, String> map) throws ActionException, IOException {
		for (Map.Entry<String, String> entry : map.entrySet()) {

			TestCase.initializeStep("Seleccionar el rol");
			Do.action(Action.SELECT, Option.BY_VISIBLE_TEXT, entry.getKey(),
					Scrum_Metrics_Project.select_ProjectMember());
			TestCase.step();

			TestCase.initializeStep("Escribir el nombre de usuario");
			Do.action(Action.TYPE, entry.getValue(), Scrum_Metrics_Project.txt_UserMember());
			TestCase.step();

			TestCase.initializeStep("Clic en Add");
			Do.action(Action.CLICK, Scrum_Metrics_Project.btn_Add());
			TestCase.step();
		}

	}
}
