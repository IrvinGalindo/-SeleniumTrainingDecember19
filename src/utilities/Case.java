package utilities;

public class Case {
	public static int stepNum = 1;
	public static boolean status;
	private static String result;
	
	public static void step(int stepNum, String stepDescription) {
		result = "Step " + stepNum + ": " + stepDescription;
	}
	
	
	public static void printResult() {
		result += status ? " Status: Success"  : " Status: Fail";
		System.out.println(result);
	}

}
