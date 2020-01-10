import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement signin = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		signin.click();
		WebElement createAcc = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		createAcc.click();
		WebElement name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		name.sendKeys("sivananth");
		WebElement phno = driver.findElement(By.xpath("//input[@type='tel']"));
		phno.sendKeys("9486626621");
		WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("esivananth@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("dflbmdsvd");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}
}
