package main;


import enums.Browser;
import testCases.BuyAnEveningDress;
import utilities.Case;
import utilities.Driver;


public class Main {
	public static void main(String args[]) {
		Driver.open(Browser.CHROME);
		try {
		BuyAnEveningDress.execute();
		}catch (Exception e) {
			System.out.println(e.getMessage());
			Case.status = false;
			Case.printResult();
			return;
		}
		Case.printResult();
		Driver.close();
		/*
		 * Excel.read("./files/searchInGoogle.xlsx"); try {
		 * SearchHexawareInGoogle.iteration(); Driver.Close(); } catch (ActionException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

}
