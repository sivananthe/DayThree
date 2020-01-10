import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greens {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		WebElement clickA = driver.findElement(By.xpath("//*[@id='nav-wrapper']/ul/li[6]/a"));
		clickA.click();
		WebElement txtName = driver.findElement(By.id("InputName"));
		txtName.sendKeys("Sivananth");
		WebElement txtEmail = driver.findElement(By.id("InputEmail1"));
		txtEmail.sendKeys("esivananth@gmail.com");
		WebElement txtSubject = driver.findElement(By.id("InputSubject"));
		txtSubject.sendKeys("9486626621");
		WebElement txtCmt = driver.findElement(By.name("comments"));
		txtCmt.sendKeys("Selenium");
		//driver.quit();
	
	}

}
