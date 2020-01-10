import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		WebElement clickAt = driver.findElement(By.className("r2iyh"));
		clickAt.click();
		WebElement mobile = driver.findElement(By.id("mobile"));
		mobile.sendKeys("9486626621");
		WebElement name = driver.findElement(By.id("name"));
		name.sendKeys("sivananth");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("esivananth@gmail.com");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("ofkgnwod");
		WebElement btnCont = driver.findElement(By.xpath("//*[@id='overlay-sidebar-root']/div/div/div[2]/div/div/div/div[2]/form/div[3]/a"));
		btnCont.click();
		
	}

}
