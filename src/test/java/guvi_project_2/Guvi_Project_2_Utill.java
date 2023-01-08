package guvi_project_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Guvi_Project_2_Utill {
	public static WebDriver driver;

	// Browser Launch
	public static void browserLaunch(String name) {

		switch (name) {
		case "Chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("No valid options given choosing the default browser");
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	// Launch the url
	public static void launchUrl(String url) {
		driver.get(url);
	}

	// get properties from config.properties
	public static String getpropvalue(String key) {
		String value = null;
		try {
			Properties prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "./config.properties");
			prop.load(ip);
			value = prop.getProperty(key);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File Not Available");
		}
		return value;
	}

	@DataProvider(name = "database")
	public String[][] dp() {
		File file = new File(System.getProperty("user.dir") + "./Uid_Pw.xlsx");
		FileInputStream f = null;
		try {
			f = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(f);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheetname = wb.getSheetAt(0);
		int totalrows = sheetname.getLastRowNum();
		System.out.println(totalrows);
		Row rowcells = sheetname.getRow(0);
		int totalcloums = rowcells.getLastCellNum();
		System.out.println(totalcloums);
		DataFormatter format = new DataFormatter();
		String testData[][] = new String[totalrows][totalcloums];
		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j < totalcloums; j++) {
				testData[i - 1][j] = format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(testData[i - 1][j]);
			}
		}
		return testData;

	}

	@DataProvider(name = "database_loginpage")
	public String[][] dp_loginpage() {
		File file = new File(System.getProperty("user.dir") + "./Loginpage_db.xlsx");
		FileInputStream f = null;
		try {
			f = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(f);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheetname = wb.getSheetAt(0);
		int totalrows = sheetname.getLastRowNum();
		System.out.println(totalrows);
		Row rowcells = sheetname.getRow(0);
		int totalcloums = rowcells.getLastCellNum();
		System.out.println(totalcloums);
		DataFormatter format = new DataFormatter();
		String testData[][] = new String[totalrows][totalcloums];
		for (int i = 1; i <= totalrows; i++) {
			for (int j = 0; j < totalcloums; j++) {
				testData[i - 1][j] = format.formatCellValue(sheetname.getRow(i).getCell(j));
				System.out.println(testData[i - 1][j]);
			}
		}
		return testData;

	}

}
