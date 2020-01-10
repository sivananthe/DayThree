import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		WebElement signIn = driver.findElement(By.className("dropdownWrapper hard-hidden"));
		signIn.click();
		WebElement email = driver.findElement(By.xpath("//input[@name='username']"));
		email.sendKeys("mukeshkaarmegam@gmail.com");
		
		WebElement btn = driver.findElement(By.xpath("//button[@id='checkUser']"));
		btn.click();

		
		WebElement mobNum = driver.findElement(By.xpath("//input[@id='j_number']"));
		mobNum.sendKeys("9791718567");
		
		
	}
	

}
