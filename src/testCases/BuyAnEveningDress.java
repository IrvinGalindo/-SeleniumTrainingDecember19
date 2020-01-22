package testCases;

import java.io.IOException;

import components.Cmp_CreateAnAccount;
import enums.Action;
import enums.Expected;
import enums.MouseOption;
import exceptions.ActionException;
import pages.AutomationPractice_EveningDresses;
import pages.AutomationPractice_Main;
import pojos.Person;
import utilities.TestCase;
import utilities.Convert;
import utilities.Do;
import utilities.Wait;

public class BuyAnEveningDress {

	public static void execute() throws ActionException, IOException {

		TestCase.initializeStep("Navigate to the page");
		Do.action(Action.NAVIGATE, "http://automationpractice.com");
		
		TestCase.step();

		TestCase.initializeStep( "Mouse over Women option");
		Do.action(Action.MOUSE, MouseOption.MOUSE_OVER, AutomationPractice_Main.cmb_WomenDresses());
		
		TestCase.step();

		Wait.implicit(5);
		TestCase.initializeStep( "Click to Evening Dresses");
		Do.action(Action.CLICK, AutomationPractice_Main.cmb_opt_EveningDresses());
		
		TestCase.step();

		TestCase.initializeStep( "Mouse over the image of a dress");
		Do.action(Action.MOUSE, MouseOption.MOUSE_OVER, AutomationPractice_EveningDresses.lnk_Dress());
		
		TestCase.step();

		Wait.Explicit(Expected.VISIBILITY_OF, 2, AutomationPractice_EveningDresses.btn_More());
		TestCase.initializeStep( "Click to more button");
		Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_More());
		
		TestCase.step();
		Wait.implicit(5);

		if (Convert.StringToInt(AutomationPractice_EveningDresses.lbl_Price()) < 65) {
			TestCase.initializeStep( "Click to Add to Car");
			Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_AddToCar());
			
			TestCase.step();

			TestCase.initializeStep( "Click to proceed to checkout one");
			Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_CheckoutOne());
			
			TestCase.step();

			if (Convert.StringToInt(AutomationPractice_EveningDresses.lbl_TotalPrice()) < 65) {
				TestCase.initializeStep( "Click to proceed to checkout Shopping Summary");
				Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_CheckoutTwo());
				
				TestCase.step();
				
				Person persona = new Person("Raul", "Martinez", "raul102340@gmail2228.com", "raul123", "29", "5", "1996",
						"calle 13", "Saltillo", "Arkansas", "92039", "8441002932", "la casa azul");
				TestCase.isSubComp = true;
				Cmp_CreateAnAccount.start(persona);
				TestCase.isSubComp = false;
				TestCase.initializeStep("Verify Personal data");
				if (!AutomationPractice_EveningDresses.list_lbl_Data().getText().contains(persona.toString())) {
					throw new ActionException("Data Is not equal");
				} else {
					TestCase.step();
					TestCase.initializeStep( "Click to proceed to checkout in Address");
					Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_ProceedToCheckOut());
					
					TestCase.step();

					if (!AutomationPractice_EveningDresses.lbl_ShippingPrice().getText().equals("$2.00")) {
						throw new ActionException("Price Shipping is not: '$2.00'");
					} else {
						System.out.println(AutomationPractice_EveningDresses.lbl_ShippingPrice().getText());
						TestCase.initializeStep( "Click to Agreed licence");
						Do.action(Action.CLICK, AutomationPractice_EveningDresses.rdo_Agreed());
						
						TestCase.step();

						TestCase.initializeStep( "Click to Button Proceed Shipping");
						Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_ProceedShipping());
						
						TestCase.step();

						if (Convert.StringToInt(AutomationPractice_EveningDresses.lbl_TotalPricePayment()) < 65) {
							TestCase.initializeStep( "Click to Button Pay By Bank Wire");
							Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_PayByBankWire());
							
							TestCase.step();

							TestCase.initializeStep( "Click to Button Confirm My Order");
							Do.action(Action.CLICK, AutomationPractice_EveningDresses.btn_ConfirmMyOrder());
							
							TestCase.step();
							
							TestCase.initializeStep( "Verify the information is correct");
							if (Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_EveningDresses.lbl_Amount())
									&& Do.action(Action.VERIFY_IF_EXIST, AutomationPractice_EveningDresses.lbl_Owner())
									&& Do.action(Action.VERIFY_IF_EXIST,
											AutomationPractice_EveningDresses.lbl_Details())
									&& Do.action(Action.VERIFY_IF_EXIST,
											AutomationPractice_EveningDresses.lbl_Bank())) {
								
								TestCase.step();
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
