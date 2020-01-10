import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCreate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sivanane\\\\eclipse-workspace\\\\DayThreeTask\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("sivananth");
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Elaya");
		WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("esivananth@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name='Passwd']"));
		pass.sendKeys("qwerty");
		WebElement conpass = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		conpass.sendKeys("qwerty");
		WebElement btnNext = driver.findElement(By.xpath("//*[@id=\'accountDetailsNext\']/span/span"));
		btnNext.click();
	}

}
