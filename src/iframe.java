import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "T://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		System.out.println("<<<<<<<<<<<<<001>>>>>>>>>>>>");
		/*
		 * driver.switchTo().frame("iframeResult");
		 * 
		 * driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
		 * Thread.sleep(4000); driver.switchTo().parentFrame();
		 * 
		 * 
		 * driver.close();
		 */
		driver.switchTo().frame("single_tab_div resp-tab-content resp-tab-content-active");
		Thread.sleep(2000);
		System.out.println("<<<<<<<<<<<<<002>>>>>>>>>>>>");
		//driver.findElement(By.xpath("//input[@id='custom_field_text_field_1016375']")).sendKeys("kapil");
		
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		System.out.println("<<<<<<<<<<<<<003>>>>>>>>>>>>");
		driver.switchTo().frame("screen optin-form-screen");
		Thread.sleep(2000);
		System.out.println("<<<<<<<<<<<<<004>>>>>>>>>>>>");
		driver.findElement(By.xpath("//input[@id='custom_field_text_field_1016375']")).sendKeys("kapil");
		Thread.sleep(2000);
		System.out.println("<<<<<<<<<<<<<005>>>>>>>>>>>>");
		driver.switchTo().defaultContent();
		
	
	}
	
}
