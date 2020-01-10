import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.name("emailOrPhone"));
		user.sendKeys("esivadfgnanth@gmail.com");
		WebElement firstName = driver.findElement(By.xpath("//input[@name='fullName']"));
		firstName.sendKeys("Sivananth");
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("sivananthes");
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("23420834sgG#");
		WebElement signUp = driver.findElement(By.xpath("//button[@type='submit']"));
		signUp.click();
		
	}

}
