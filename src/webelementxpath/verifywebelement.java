package webelementxpath;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class verifywebelement
{
	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webdiver.chrome.driver", "T://chromedriver.exe");
      
      WebDriver driver=new ChromeDriver();
      
      driver.get("https://www.google.com");
		
      driver.navigate().to("https://www.facebook.com/");
      Thread.sleep(2000);
      
      driver.manage().window().maximize();
     
      driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kapil");
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("dharmale");
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("dharmale.kapil@gmail.com");
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//input[@id='u_0_x']")).sendKeys("123456");
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//input[@id='u_0_5']")).click();
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
      Thread.sleep(2000);
      
      driver.navigate().back();
      Thread.sleep(2000);
      
      driver.navigate().refresh();
      Thread.sleep(2000);
      
      String D=driver.getTitle();
      System.out.println(D);
      
      String m=driver.getCurrentUrl();
      System.out.println(m);
      
      String s1=driver.getCurrentUrl();
      String s2="facebook.com";
      if(s1.equals(s2))
      {
    	  System.out.println("same");
      }
      else
      {
    	  System.out.println("different");
      }
      
      Dimension k=new Dimension(300, 400);
      driver.manage().window().setSize(k);
      Thread.sleep(2000);
      
      Point p=new Point(100, 200);
      driver.manage().window().setPosition(p);
      Thread.sleep(2000);
      
      driver.quit();
      
	}

}
