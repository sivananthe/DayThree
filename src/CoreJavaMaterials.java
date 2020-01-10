import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoreJavaMaterials {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\sivanane\\\\eclipse-workspace\\\\DayThreeTask\\\\driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologies.in/selenium-training.php");
		WebElement cjm = driver.findElement(By.xpath("(//strong[contains(text(),'Chennai')])[1]"));
		//cjm.click();
		String text = cjm.getText();
		System.out.println(text);
		
	}
}
