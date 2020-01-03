package testCases;

import components.Cmp_CreateAnAccount;
import components.Cpm_test;
import enums.Action;
import enums.MouseOption;
import exceptions.ActionException;
import pages.AutomationPractice_EveningDresses;
import pages.AutomationPractice_Main;
import pojos.Person;
import utilities.Case;
import utilities.Convert;
import utilities.Do;
import utilities.Wait;

public class BuyAnEveningDress {

	public static void execute() throws ActionException {

		Case.initializeStep("Navigate to the page");
		Do.action(Action.NAVIGATE, "http://automationpractice.com");
		Case.status = true;
		Case.step();

		Case.initializeStep( "Mouse over Women option");
		Do.action(Action.MOUSE, MouseOption.MOUSE_OVER, AutomationPractice_Main.cmb_WomenDresses());
		Case.status = true;
		Case.step();

		Wait.implicit(5);
		Case.initializeStep( "Click to Evening Dresses");
		Do.action(Action.CLICK, AutomationPractice_Main.cmb_opt_EveningDresses());
		Case.status = true;
		Case.step();

		Case.initializeStep( "Mouse over the image of a dress");
		Do.action(Action.MOUSE, MouseOption.MOUSE_OVER, AutomationPractice_EveningDresses.lnk_Dress());
		Case.status = true;
		Case.step();

		Case.initializeStep( "Click to more button");
		Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_More());
		Case.status = true;
		Case.step();
		Wait.implicit(5);

		if (Convert.StringToInt(AutomationPractice_EveningDresses.lbl_Price()) < 65) {
			Case.initializeStep( "Click to Add to Car");
			Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_AddToCar());
			Case.status = true;
			Case.step();

			Case.initializeStep( "Click to proceed to checkout one");
			Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_CheckoutOne());
			Case.status = true;
			Case.step();

			if (Convert.StringToInt(AutomationPractice_EveningDresses.lbl_TotalPrice()) < 65) {
				Case.initializeStep( "Click to proceed to checkout Shopping Summary");
				Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_CheckoutTwo());
				Case.status = true;
				Case.step();
				
				Person persona = new Person("Raul", "Martinez", "raul1026@gmail2228.com", "raul123", "29", "5", "1996",
						"calle 13", "Saltillo", "Arkansas", "92039", "8441002932", "la casa azul");
				Case.isSubComp = true;
				Cmp_CreateAnAccount.start(persona);
				Case.isSubComp = false;
				Case.initializeStep("Verify Personal data");
				if (!AutomationPractice_EveningDresses.list_lbl_Data().getText().contains(persona.toString())) {
					throw new ActionException("Data Is not equal");
				} else {
					Case.step();
					Case.initializeStep( "Click to proceed to checkout in Address");
					Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_ProceedToCheckOut());
					Case.status = true;
					Case.step();

					if (!AutomationPractice_EveningDresses.lbl_ShippingPrice().getText().equals("$2.00")) {
						throw new ActionException("Price Shipping is not: '$2.00'");
					} else {
						System.out.println(AutomationPractice_EveningDresses.lbl_ShippingPrice().getText());
						Case.initializeStep( "Click to Agreed licence");
						Do.action(Action.CLICK, AutomationPractice_EveningDresses.rdo_Agreed());
						Case.status = true;
						Case.step();

						Case.initializeStep( "Click to Button Proceed Shipping");
						Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_ProceedShipping());
						Case.status = true;
						Case.step();

						if (Convert.StringToInt(AutomationPractice_EveningDresses.lbl_TotalPricePayment()) < 65) {
							Case.initializeStep( "Click to Button Pay By Bank Wire");
							Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_PayByBankWire());
							Case.status = true;
							Case.step();

							Case.initializeStep( "Click to Button Confirm My Order");
							Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_ConfirmMyOrder());
							Case.status = true;
							Case.step();
							
							Case.initializeStep( "Verify the information is correct");
							if (Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_EveningDresses.lbl_Amount())
									&& Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_EveningDresses.lbl_Owner())
									&& Do.action(Action.VERIFY_IF_EXIST,
											AutomationPractice_EveningDresses.lbl_Details())
									&& Do.action(Action.VERIFY_IF_EXIST,
											AutomationPractice_EveningDresses.lbl_Bank())) {
								Case.status = true;
								Case.step();
							}
							else {
								throw new ActionException("Invalid Verify");
							}
						} else {
							throw new ActionException("Total Price Payment is more than $65 dollars");
						}

					}
				}
			} else {
				System.out.println("El total rebasa el 65");
			}

		} else {
			System.out.println("El articulo es mayor de 65");
		}

	}

}
