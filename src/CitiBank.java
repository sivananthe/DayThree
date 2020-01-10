import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitiBank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();
		//WebElement CloseBtn = driver.findElement(By.xpath("//div[@id='div-close']"));
		//CloseBtn.click();
		WebElement Login = driver.findElement(By.xpath("//span[text()=txtSign]"));
		Login.click();
	}
}
