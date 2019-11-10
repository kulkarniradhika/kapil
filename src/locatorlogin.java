import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class locatorlogin 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "T://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
	
		Thread.sleep(2000);
		driver.navigate().to("https://accounts.google.com");
		
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("dharmale.kapil@gmail.com");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9665245692");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	
	Thread.sleep(2000);
	driver.navigate().back();
	
	Thread.sleep(2000);
	driver.navigate().back();
	
	Thread.sleep(2000);
	String s=driver.getCurrentUrl();
	System.out.println(s);
	
	s=driver.getTitle();
     System.out.println(s);
	driver.quit();
	 
		
	}

}
