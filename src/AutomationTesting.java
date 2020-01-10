import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sivanane\\eclipse-workspace\\DayThreeTask\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtName = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[1]/input"));
		txtName.sendKeys("sivananth");
		WebElement txtLname = driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[1]/div[2]/input"));
		txtLname.sendKeys("E");
		WebElement address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		address.sendKeys("GounderPlayam Perambalur");
		WebElement eMail = driver.findElement(By.xpath("//input[@type='email']"));
		eMail.sendKeys("esivananth@gmail.com");
		WebElement ph = driver.findElement(By.xpath("//input[@type='tel']"));
		ph.sendKeys("9486626621");
		WebElement rdoGender = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
		rdoGender.click();
		WebElement rdoHobbies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		rdoHobbies.click();
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pass.sendKeys("sdlvknsd");
		WebElement conPass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		conPass.sendKeys("sdlvknsd");
		WebElement btnSub = driver.findElement(By.xpath("//button[@id='submitbtn']"));
		btnSub.click();

	
	}

}
