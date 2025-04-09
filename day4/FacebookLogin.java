package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		//Launch browser
		ChromeDriver driver = new ChromeDriver();
		//Load Url
		driver.get("https://www.facebook.com/");
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter email
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		//Enter password
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		//Click on Login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Click on the ‘Find your account and log in.’ link
		driver.findElement(By.linkText("Find your account and log in.")).click();
		//Verify the title of the current web page.
		String title = driver.findElement(By.className("uiHeaderTitle")).getText();
		System.out.println(title);
		driver.close();
		

	}

}
