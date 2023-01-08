package guvi_project_2;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Guvi_Project_2_Loginpage extends Guvi_Project_2_Base {

	@Test(dataProvider = "database", priority = 0)
	public void test(String n, String s) throws Exception {
		Guvi_Project_2_Base.loginpage_uidpw(n, s);
		WebElement keywords = driver.findElement(By.xpath("//input[@placeholder='Search']"));
		keywords.sendKeys("Admin" + "\n");
		WebElement adminclick = driver.findElement(By.xpath("//li[@class='oxd-main-menu-item-wrapper']"));
		adminclick.click();
		WebElement select_Userroll = driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		select_Userroll.click();
		WebElement select_admin = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[1]"));
		Robot nat = new Robot();
		while (select_admin.getText().equalsIgnoreCase("Admin") == false) {
			nat.keyPress(KeyEvent.VK_DOWN);
		}
		nat.keyRelease(KeyEvent.VK_DOWN);
		nat.keyPress(KeyEvent.VK_ENTER);
		nat.keyRelease(KeyEvent.VK_ENTER);
		WebElement select_status = driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div"));
		select_status.click();
		WebElement select_enabled = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[4]"));
		Robot nat1 = new Robot();
		while (select_enabled.getText().equalsIgnoreCase("Enabled") == false) {
			nat1.keyPress(KeyEvent.VK_DOWN);
		}
		nat1.keyRelease(KeyEvent.VK_DOWN);
		nat1.keyPress(KeyEvent.VK_ENTER);
		nat1.keyRelease(KeyEvent.VK_ENTER);
		WebElement select_user_ess = driver.findElement(By.xpath("(//div[text()='Admin'])[1]"));
		select_user_ess.click();
		WebElement select_ess = driver.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[1]"));
		Robot nat2 = new Robot();
		while (select_ess.getText().equalsIgnoreCase("ESS") == false) {
			nat2.keyPress(KeyEvent.VK_DOWN);
		}
		nat2.keyRelease(KeyEvent.VK_DOWN);
		nat2.keyPress(KeyEvent.VK_ENTER);
		nat2.keyRelease(KeyEvent.VK_ENTER);
		WebElement select_Enabled1 = driver.findElement(By.xpath("(//div[text()='Enabled'])[1]"));
		select_Enabled1.click();
		WebElement select_disabled = driver
				.findElement(By.xpath("(//div[@class='oxd-select-wrapper']//child::div)[4]"));
		Robot nat3 = new Robot();
		while (select_disabled.getText().equalsIgnoreCase("Disabled") == false) {
			nat3.keyPress(KeyEvent.VK_DOWN);
		}
		nat3.keyRelease(KeyEvent.VK_DOWN);
		nat3.keyPress(KeyEvent.VK_ENTER);
		nat3.keyRelease(KeyEvent.VK_ENTER);

	}
}
