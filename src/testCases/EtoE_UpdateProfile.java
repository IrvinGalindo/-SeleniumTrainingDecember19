package testCases;

import java.awt.AWTException;
import java.io.IOException;

import components.Cmp_LoginOptionNavbar;
import components.Cmp_SM_Login;
import components.Cmp_SM_MyProfileModule;
import components.Cmp_SM_SignOut;
import enums.Action;
import exceptions.ActionException;
import pages.Scrum_Metrics_Submenu;
import pojos.User_ScrumMetrics;
import utilities.Do;
import utilities.TestCase;

public class EtoE_UpdateProfile {

	public static void execute() throws ActionException, IOException, AWTException {
		Cmp_LoginOptionNavbar.start();

		TestCase.isSubComp = true;
		Cmp_SM_Login.start(new User_ScrumMetrics("John", "Contra12*"));
		TestCase.isSubComp = false;

		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_Menu());
		Do.action(Action.CLICK, Scrum_Metrics_Submenu.mnu_MyProfile());
		
		TestCase.isSubComp = true;
		Cmp_SM_MyProfileModule.start("John Smith Lopez", "sLopez@demo.com");
		TestCase.isSubComp = false;
		
		Cmp_SM_SignOut.start();
	}

}