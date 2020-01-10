import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions acc = new Actions(driver);

		WebElement txtUserName = driver.findElement(By.id("email"));
		acc.keyDown(txtUserName, Keys.SHIFT).sendKeys(txtUserName,"sivananth").keyUp(txtUserName, Keys.SHIFT).perform();
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("selenium");
		WebElement btnLogin = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		//btnLogin.click();
		acc.doubleClick(txtUserName).perform();
		acc.doubleClick(txtpassword).perform();

		
		//driver.quit();
	}
}
