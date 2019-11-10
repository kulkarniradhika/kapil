import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath
{
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "T://chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Samiran");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Panse");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("8055186907");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("XYZ123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text() = 'Male']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[text() ='Sign Up']")).click();
		
		
		driver.quit();
	}

}
