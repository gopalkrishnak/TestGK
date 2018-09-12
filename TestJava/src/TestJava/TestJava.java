package TestJava;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestJava {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello Gopal");
		//ChromeDriverManager.getInstance().setup();
		System.setProperty("webdriver.gecko.driver","C:/Selenium/Geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		String homepage = driver.getWindowHandle();
		System.out.println(homepage);
		
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("krishnaaw@hotmail.co.uk");
		Dimension size = driver.findElement(By.id("email")).getSize();
		System.out.println(size);
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Great123!");
		driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"navItem_100003234422333\"]/a/div")).click();
		
		//Alert alert=driver.switchTo().alert();
		//alert.dismiss();
		//driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).clear();
		//driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"navItem_100003234422333\"]/a/div")).click();
		//driver.quit();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
	}

}
