import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");

		WebElement from = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		from.sendKeys("chennai");

		WebElement to = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		to.sendKeys("madurai");

		WebElement btn = driver.findElement(By.xpath("//button[@class='booking fRight large']"));
		btn.click();

	}
}
