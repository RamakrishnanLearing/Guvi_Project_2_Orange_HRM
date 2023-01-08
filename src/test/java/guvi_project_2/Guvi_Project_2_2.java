package guvi_project_2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Guvi_Project_2_2 extends Guvi_Project_2_Loginpage {
	@Test(dataProvider = "database_loginpage", priority = 2)
	public void test3(String uid, String pw) throws Exception {
		Guvi_Project_2_Base.loginpage_testcase(uid, pw);
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
		driver.findElement(By.name("firstName")).sendKeys("Ram");
		driver.findElement(By.name("middleName")).sendKeys("kirshnan");
		driver.findElement(By.name("lastName")).sendKeys("Jawahar");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active']//following::input)[5]")).clear();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active']//following::input)[5]"))
				.sendKeys("7777");
		driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"))
				.click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active']//following::input)[7]"))
				.sendKeys("Ramakrishnan12");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active']//following::input)[10]"))
				.sendKeys("Ram#12345");
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active']//following::input)[11]"))
				.sendKeys("Ram#12345");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("TC_3:Successfully completed");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// TC_4
		Thread.sleep(2000);
		WebElement list = driver.findElement(By.xpath("//div[@role='tablist']"));
		String main = list.getText();
		System.out.println(main);
		System.out.println("TC_4:Successfully completed");

//		    //TC_5(Personal  Detail)
		Thread.sleep(2000);
		WebElement element1 = driver.findElement(By.linkText("Personal Details"));
		element1.click();
		driver.findElement(By.xpath(
				"/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"))
				.sendKeys("Ram");
		driver.findElement(By.xpath("(//div[@class='oxd-grid-3 orangehrm-full-width-grid']//input)[3]"))
				.sendKeys("15155");
		driver.findElement(By.xpath("(//*[starts-with(text(),'Driver')]//following::input)[1]")).sendKeys("7305776724");
		driver.findElement(By.xpath("(//*[starts-with(text(),'License Expiry Date')]//following::input)[1]"))
				.sendKeys("2022-01-15");
		driver.findElement(By.xpath("(//*[starts-with(text(),'SSN Number')]//following::input)[1]"))
				.sendKeys("9876543210");
		driver.findElement(By.xpath("(//*[starts-with(text(),'SIN Number')]//following::input)[1]")).sendKeys("98765");

		Thread.sleep(5000);
		WebElement nationality = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		nationality.click();
		WebElement nation = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[1]"));
		Robot nat = new Robot();
		while (nation.getText().equalsIgnoreCase("Indian") == false) {
			nat.keyPress(KeyEvent.VK_DOWN);
		}
		nat.keyRelease(KeyEvent.VK_DOWN);
		nat.keyPress(KeyEvent.VK_ENTER);
		nat.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		WebElement marriedStatus = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		marriedStatus.click();
		WebElement MS = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[4]"));
		Robot MsT = new Robot();
		while (MS.getText().equalsIgnoreCase("Single") == false) {
			MsT.keyPress(KeyEvent.VK_DOWN);
		}
		MsT.keyRelease(KeyEvent.VK_DOWN);
		MsT.keyPress(KeyEvent.VK_ENTER);
		MsT.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//*[starts-with(text(),'Date of Birth')]//following::input)[1]"))
				.sendKeys("1992-01-15");
		driver.findElement(By.xpath("(//*[starts-with(text(),'Gender')]//following::span)[1]")).click();
		driver.findElement(By.xpath("(//*[starts-with(text(),'Military Service')]//following::input)[1]"))
				.sendKeys("NO");
		driver.findElement(By.xpath("(//*[starts-with(text(),'Smoker')]//following::span)[1]")).click();
		driver.findElement(By.xpath("(//*[text()=' * Required']//following::button)[1]")).click();
		Thread.sleep(2000);
		WebElement BloodType = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		BloodType.click();
		WebElement blood = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[7]"));
		Robot bloodTypes = new Robot();
		while (blood.getText().equalsIgnoreCase("B+") == false) {
			bloodTypes.keyPress(KeyEvent.VK_DOWN);
		}
		bloodTypes.keyRelease(KeyEvent.VK_DOWN);
		bloodTypes.keyPress(KeyEvent.VK_ENTER);
		bloodTypes.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//div[@class='oxd-form-actions']//following::button)[2]")).click();
		System.out.println("TC_5:Successfully Completed");
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0,-250);");

//			TC_6(Contact  Detail)
		WebElement element2 = driver.findElement(By.linkText("Contact Details"));
		element2.click();
		driver.findElement(By.xpath("(//label[@class='oxd-label']//following::input)[1]")).sendKeys("south");
		driver.findElement(By.xpath("(//label[@class='oxd-label']//following::input)[2]")).sendKeys("south-west");
		driver.findElement(By.xpath("(//label[@class='oxd-label']//following::input)[3]")).sendKeys("Coimbatore");
		driver.findElement(By.xpath("(//label[@class='oxd-label']//following::input)[4]")).sendKeys("Tamil Nadu");
		WebElement Country = driver.findElement(By.xpath("//div[text()='-- Select --']"));
		Country.click();
		Thread.sleep(2000);
		WebElement ctry = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[1]"));
		Robot Count = new Robot();
		while (ctry.getText().equals("India") == false) {
			Count.keyPress(KeyEvent.VK_DOWN);
		}
		Count.keyRelease(KeyEvent.VK_DOWN);
		Count.keyPress(KeyEvent.VK_ENTER);
		Count.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='oxd-form-row']//following::input)[5]")).sendKeys("600043");
		driver.findElement(By.xpath("(//input[@modelmodifiers='[object Object]'])[1]")).sendKeys("9441398783");
		driver.findElement(By.xpath("(//input[@modelmodifiers='[object Object]'])[2]")).sendKeys("9446112804");
		driver.findElement(By.xpath("(//input[@modelmodifiers='[object Object]'])[3]")).sendKeys("7416887835");

		driver.findElement(By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters']//following::input)[9]"))
				.sendKeys("jdr.ramakrishnan@gmail.com");
		driver.findElement(By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters']//following::input)[10]"))
				.sendKeys("ramakrishnan@gmail.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("TC_6 Successfully Completed");

		// TC_7(Emergency contact)
		Thread.sleep(2000);
		driver.findElement(By.linkText("Emergency Contacts")).click();
		driver.findElement(
				By.xpath("(//div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//following::i)[1]"))
				.click();
		driver.findElement(By.xpath("(//form[@class='oxd-form']//following::input)[1]")).sendKeys("Ramakrishnan");
		driver.findElement(By.xpath("(//form[@class='oxd-form']//following::input)[2]")).sendKeys("Brother");
		driver.findElement(By.xpath("(//form[@class='oxd-form']//following::input)[3]")).sendKeys("9876554321");
		driver.findElement(By.xpath("(//form[@class='oxd-form']//following::input)[4]")).sendKeys("1234567890");
		driver.findElement(By.xpath("(//form[@class='oxd-form']//following::input)[5]")).sendKeys("9078563412");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("TC_7 Successfully Completed");

		// TC_8(Dependency)
		driver.findElement(By.linkText("Dependents")).click();
		driver.findElement(By.xpath("(//button[@type='button']//following::i)[4]")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Jawahar");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement Relative = driver.findElement(By.xpath("//div[@class='oxd-select-text-input']"));
		Actions rel = new Actions(driver);
		rel.sendKeys(Relative, "O").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ARROW_DOWN, Keys.RETURN)
				.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("Father");
		driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("1980-05-05");
		driver.findElement(
				By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"))
				.click();
		System.out.println("TC_8 Successfully Completed");

		// TC_9(Jobs)
		Thread.sleep(3000);
		driver.findElement(By.linkText("Job")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("1992-01-15");
		WebElement JobTitle = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input']//following::i)[1]"));
		Actions JT = new Actions(driver);
		JT.sendKeys(JobTitle, "A").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ARROW_DOWN, Keys.RETURN)
				.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		WebElement JobCat = driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[2]"));
		Actions JC = new Actions(driver);
		JC.sendKeys(JobCat, "o").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ARROW_DOWN, Keys.RETURN)
				.sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ENTER).build().perform();
		WebElement SubUnit = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[3]"));
		Actions SU = new Actions(driver);
		SU.sendKeys(SubUnit, "E").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ARROW_DOWN, Keys.RETURN)
				.sendKeys(Keys.ENTER).build().perform();
		WebElement Location = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[4]"));
		Actions LOC = new Actions(driver);
		LOC.sendKeys(Location, "C").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ENTER).build().perform();
		WebElement EmploymentStatus = driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[5]"));
		Actions ES = new Actions(driver);
		ES.sendKeys(EmploymentStatus, "F").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ARROW_DOWN, Keys.RETURN)
				.sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]")).sendKeys("1999-02-01");
		driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[3]")).sendKeys("2000-02-01");
		// String path=System.getProperty("User.dir");
//			WebElement button=driver.findElement(By.xpath("//div[@class='oxd-file-input-div']")).click();
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();", button);
		driver.findElement(By.xpath("//div[@class='oxd-file-input-div']")).click();
		Thread.sleep(2000);
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection SS = new StringSelection("C:\\Users\\ELCOT\\Desktop\\B.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(SS, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("TC_9 Successfully Completed");

		// TC_10
		driver.findElement(By.xpath(
				"//button[@class='oxd-button oxd-button--medium oxd-button--label-danger --termination-button']"))
				.click();
		driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[4]")).sendKeys("2001-05-01");
		WebElement TR = driver.findElement(By.xpath("(//div[@class='oxd-select-text--after'])[6]"));
		Actions DIS = new Actions(driver);
		DIS.sendKeys(TR, "c").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@placeholder='Type here']"))
				.sendKeys("Due to contract not renewed he as been terminated");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		System.out.println("TC_10 Successfully Completed");
		// TC_11
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//button[@class='oxd-button oxd-button--medium oxd-button--ghost-success --termination-button']"))
				.click();
		System.out.println("TC_11 Successfully completed");

		// TC_12(Salary)
		driver.findElement(By.linkText("Salary")).click();
		driver.findElement(By.xpath("(//i[@class='oxd-icon bi-plus oxd-button-icon'])[1]")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("CTC");

		Thread.sleep(2000);

		WebElement Currency = driver.findElement(By.xpath("(//div[text()='-- Select --'])[3]"));
		Currency.click();
		WebElement curr = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[7]"));
		Robot amt = new Robot();
		while (curr.getText().equals("Indian Rupee") == false) {
			amt.keyPress(KeyEvent.VK_DOWN);
		}
		amt.keyRelease(KeyEvent.VK_DOWN);
		amt.keyPress(KeyEvent.VK_ENTER);
		amt.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("10000");
		driver.findElement(By.xpath("(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])"))
				.click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]")).sendKeys("6501");
		Thread.sleep(2000);
		WebElement AccountType = driver.findElement(By.xpath("(//div[text()='-- Select --'])[3]"));
		AccountType.click();
		WebElement AMT = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[10]"));
		Robot AT = new Robot();
		while (AMT.getText().equals("Checking") == false) {
			AT.keyPress(KeyEvent.VK_DOWN);
		}
		AT.keyRelease(KeyEvent.VK_DOWN);
		AT.keyPress(KeyEvent.VK_ENTER);
		AT.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]")).sendKeys("1234");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='oxd-grid-item oxd-grid-item--gutters']//following::input)[6]"))
				.sendKeys("10000");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("TC_SuccessFully Completed");

		// TC_13(TAX)

		driver.findElement(By.linkText("Tax Exemptions")).click();
		WebElement FedralIncome = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		FedralIncome.click();
		WebElement FIT = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[1]"));
		Robot IT1 = new Robot();
		while (FIT.getText().equals("Single") == false) {
			IT1.keyPress(KeyEvent.VK_DOWN);
		}
		IT1.keyRelease(KeyEvent.VK_DOWN);
		IT1.keyPress(KeyEvent.VK_ENTER);
		IT1.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("10");
		Thread.sleep(2000);
		WebElement StateIncome = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		StateIncome.click();
		WebElement state = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[4]"));
		Robot STE = new Robot();
		while (state.getText().equals("Indiana") == false) {
			STE.keyPress(KeyEvent.VK_DOWN);
		}
		STE.keyRelease(KeyEvent.VK_DOWN);
		STE.keyPress(KeyEvent.VK_ENTER);
		STE.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement State = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		State.click();
		WebElement status = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[7]"));
		Robot ST = new Robot();
		while (status.getText().equals("Single") == false) {
			ST.keyPress(KeyEvent.VK_DOWN);
		}
		ST.keyRelease(KeyEvent.VK_DOWN);
		ST.keyPress(KeyEvent.VK_ENTER);
		ST.keyRelease(KeyEvent.VK_ENTER);

		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]")).sendKeys("12");
		Thread.sleep(2000);
		WebElement UnEmployment = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		UnEmployment.click();
		WebElement UNE = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[10]"));
		Robot UN = new Robot();
		while (UNE.getText().equals("Indiana") == false) {
			UN.keyPress(KeyEvent.VK_DOWN);
		}
		UN.keyRelease(KeyEvent.VK_DOWN);
		UN.keyPress(KeyEvent.VK_ENTER);
		UN.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		WebElement WorkState = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		WorkState.click();
		WebElement WSE = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[13]"));
		Robot WS = new Robot();
		while (WSE.getText().equals("Indiana") == false) {
			WS.keyPress(KeyEvent.VK_DOWN);
		}
		WS.keyRelease(KeyEvent.VK_DOWN);
		WS.keyPress(KeyEvent.VK_ENTER);
		WS.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("TC_13 Successfully Completed");

	}
}
