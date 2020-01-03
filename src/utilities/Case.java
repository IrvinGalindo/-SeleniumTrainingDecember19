package utilities;

import java.util.ArrayList;

public class Case {
	private static int stepNum = 0;
	private static int subStepNum = 1;
	public static boolean status;
	public static boolean isSubComp = false;
	private static String result;
	private static ArrayList<String> steps = new ArrayList<String>();

	public static void initializeStep(String stepDescription) {
		if (isSubComp) {		
			stepNum = (subStepNum == 0) ? (stepNum+=1) : stepNum;
			result = "Step " + stepNum + "." + subStepNum++ + ": " + stepDescription;
			
		} else {
			result = "Step " + (stepNum+=1) + ": " + stepDescription;
			subStepNum = 0;
		}
	}
	
	public static void step() {
		result += status ? " Status: Success" : " Status: Fail";
		steps.add(result);
	}

	public static void printResult() {
		for (String step : steps) {
			System.out.println(step);
		}
	}

}
