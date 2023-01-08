package guvi_project_2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Guvi_Project_2_1 extends Guvi_Project_2_Base {
	@Test(dataProvider = "database_loginpage", priority = 1)
	public void Test2(String uid, String pw) throws Exception {
		Guvi_Project_2_Base.loginpage_testcase(uid, pw);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		WebElement UR = driver.findElement(By.xpath("(//div[text()='-- Select --']//following::div)[1]"));
		Actions act = new Actions(driver);
		act.sendKeys(UR, "A").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).build().perform();
		Thread.sleep(3000);
		WebElement ST = driver.findElement(By.xpath("(//div[@class='oxd-table-filter-area']//following::i)[2]"));
		Actions act1 = new Actions(driver);
		act1.sendKeys(ST, "E").sendKeys(Keys.ARROW_DOWN, Keys.RETURN).build().perform();

	}
}
