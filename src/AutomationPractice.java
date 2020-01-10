import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("sivananth");
		WebElement lastName = driver.findElement(By.id("lastname"));
		lastName.sendKeys("E");
		WebElement rdobtn = driver.findElement(By.id("sex-0"));
		rdobtn.click();
		WebElement exper = driver.findElement(By.id("exp-0"));
		exper.click();
		WebElement date = driver.findElement(By.id("datepicker"));
		date.sendKeys("12/12/19");
		WebElement prof = driver.findElement(By.id("profession-1"));
		prof.click();
	}

}
