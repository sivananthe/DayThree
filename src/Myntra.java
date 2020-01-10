import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sivanane\\\\eclipse-workspace\\\\DayThreeTask\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("esivananth@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("sdF$fv3r23");
		WebElement num = driver.findElement(By.xpath("//input[@type='number']"));
		num.sendKeys("9486626621");
		WebElement gender = driver.findElement(By.xpath("//input[@id='male']"));
		gender.click();
		WebElement btn = driver.findElement(By.xpath("//button[@class='register-register-button']"));
		btn.click();
	}
}
