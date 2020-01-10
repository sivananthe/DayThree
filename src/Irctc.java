//doubt
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.irctc.co.in/nget/train-search");
		
		WebElement register = driver.findElement(By.xpath("(//a[@class='ng-star-inserted'])[2]"));
		register.click();
		WebElement user = driver.findElement(By.xpath("//input[@id='userName']"));
		user.sendKeys("sivananth");
		WebElement pass = driver.findElement(By.xpath("//input[@id='usrPwd']"));
		pass.sendKeys("qwerty456");
		WebElement conpass = driver.findElement(By.xpath("//input[@id='cnfUsrPwd']']"));
		conpass.sendKeys("qwerty456");
		
	}

}
