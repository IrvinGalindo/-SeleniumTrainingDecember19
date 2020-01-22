package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class TestCase {
	private static String name;
	private static String startDate;
	private static String endDate;
	private static int stepNum = 0;
	private static int subStepNum = 1;
	public static boolean status = true;
	public static boolean isSubComp = false;
	private final static String pattern = "MMM dd, yyyy HH-mm-ss";
	private static SimpleDateFormat simpleDateFormat;
	private static String result;
	private static ArrayList<String> steps = new ArrayList<String>();

	public static void start(String testCaseName) {
		name = testCaseName;
		simpleDateFormat = new SimpleDateFormat(pattern);
		startDate = simpleDateFormat.format(new Date());
	}

	public static String getImageUri() {
		String baseUri = "C:/Temp/frame-images/" + name + "_" + startDate + "/";
		if(isSubComp) {
			stepNum = (subStepNum == 0) ? (stepNum += 1) : stepNum;
		}
		baseUri += (isSubComp) ? stepNum + "." + subStepNum : stepNum;
		return baseUri += ".jpg";
	}

	public static void finish() {
		endDate = simpleDateFormat.format(new Date());

		try {
			performReport();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initializeStep(String stepDescription) {
		if (isSubComp) {
			stepNum = (subStepNum == 0) ? (stepNum += 1) : stepNum;
			result = "<th scope='row'>" + stepNum + "." + subStepNum++ + "</th>";
		} else {
			result = "<th scope='row'>" + (stepNum += 1) + "</th>";
			subStepNum = 0;
		}
		
		result += "<td>" + stepDescription + "</td>";
	}

	public static void step() {
		result += status ? "<td>Success</td>" : " <td>Fail</td>";
		result += "<td> <a href='" + getImageUri() + "'>Image </a></td>";
		steps.add(result);

	}

	private static void performReport() throws IOException {
		File input = new File("./report/report.html");
		Document doc = Jsoup.parse(input, "UTF-8");
		Element table = doc.select("tbody#body_infoTable").first();

		table.append("<tr>");
		table.append("<td>" + name + "</td> <td>" + startDate + "</td> <td>" + endDate + "</td>");

		table.append("</tr>");

		table = doc.select("tbody#body_stepsTable").first();
		table.append("<tr>");
		for (String step : steps) {
			table.append(step);
		}
		table.append("</tr>");
		final File f = new File(System.getProperty("user.home") + "/Desktop/Reports/" + name + "/" + startDate + ".html");
		FileUtils.writeStringToFile(f, doc.outerHtml(), "UTF-8");

		Desktop.getDesktop().browse(f.toURI());

	}
}
