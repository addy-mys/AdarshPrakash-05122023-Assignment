package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import base.Baseclass;

public class TestUtils extends Baseclass{
	public static ExtentReports extentreports;
		public static ExtentTest extentTest;
		public void Screenshots() throws IOException {
			
			Date currentdate =new Date();
			String screenshotfilename = currentdate.toString().replace(" ", "-").replace(":", "-");
			File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    	FileUtils.copyFile(screenshotFile, new File(".//screenshot//" + screenshotfilename + ".png"));
		}
		
		@BeforeSuite
		public void InitExentReport() {
	 
			ExtentSparkReporter sparkreporter = new ExtentSparkReporter("testreport_extent.html");
			extentreports = new ExtentReports();
			extentreports.attachReporter(sparkreporter);
	 
			extentreports.setSystemInfo("Operating Sytsem : ", System.getProperty("os.name"));
			extentreports.setSystemInfo("JAVA Version : ", System.getProperty("java.version"));
	 
		}
	 
		// To Generate the extent report
		@AfterSuite
		public void generateReports() throws IOException {
	 
			extentreports.flush();
			Desktop.getDesktop().browse(new File("testreport_extent.html").toURI());
		}
	 
	}
