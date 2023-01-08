package guvi_project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Guvi_Project_2_Base extends Guvi_Project_2_Utill {
	@BeforeMethod
	public void browserLaunch() {
		browserLaunch(getpropvalue("ch"));
		launchUrl(getpropvalue("url"));
	}

	public static void loginpage_uidpw(String n, String s) {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(n);
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys(s);
		WebElement submit = driver
				.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		submit.click();
	}

	public static void loginpage_testcase(String uid, String pw) {
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys(uid);
		WebElement psw = driver.findElement(By.name("password"));
		psw.sendKeys(pw);
		WebElement submit = driver
				.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		submit.click();
	}

	@AfterMethod
	public void afterTest() {
		// driver.quit();
	}

}
