package TestDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class LearningAdvanceReport {

	public static void main(String[] args) {

		// Create The SparkReport
		ExtentSparkReporter spark = new ExtentSparkReporter("./AdvanceReports/report.html");

		// Configure the Sparkreport Information
		spark.config().setDocumentTitle("Regression testing For The Swag Labs");
		spark.config().setReportName("Regression Suite");
		spark.config().setTheme(Theme.DARK);

		// Create the Extent Report
		ExtentReports report = new ExtentReports();

		// Attach the spark report ansd extent report
		report.attachReporter(spark);

		// Configure the system information
		report.setSystemInfo("Device Name", "Ananth");
		report.setSystemInfo("Operating System", "WINDOWS 11");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Browser Version", "138.0.7204.184");

		// Create Test Information
		ExtentTest test = report.createTest("Regressiontest");

		// Steps Information
		test.log(Status.INFO, "Step1: Launching The Browser Successful");

		test.log(Status.INFO, "Step2: Navigating To Application via URL Successful");

		test.log(Status.PASS, "Step3: Verified the web page Successful ");

		if (true == true) {
			test.log(Status.PASS, "Step4: Verified the webelements Displayed");

		} else {
			test.log(Status.FAIL, "Step4: Verified the webelements not Displayed");

		}
		test.log(Status.SKIP, "Step5: Element is Hidden");

		// Flush the report Information
		report.flush();

		System.out.println("Execution Done");

	}

}
