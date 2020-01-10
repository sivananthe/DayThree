import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		WebElement idName = driver.findElement(By.xpath("//input[@class=\"_2zrpKA _1dBPDZ\"]"));
		idName.sendKeys("9486626621");
		
		WebElement pswd = driver.findElement(By.xpath("//input[@class=\"_2zrpKA _3v41xv _1dBPDZ\"]"));
		pswd.sendKeys("ekrjvbksc");
		
		WebElement btnlogin = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
		btnlogin.click();
		driver.quit();

}

}
