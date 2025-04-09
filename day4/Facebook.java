package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		//Launch browser
				ChromeDriver driver = new ChromeDriver();
				//Load Url
				driver.get("https://www.facebook.com/");
				//maximize window
				driver.manage().window().maximize();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				//Click on the Create new account button
				driver.findElement(By.linkText("Create new account")).click();
				//Enter the First name.
				driver.findElement(By.name("firstname")).sendKeys("Test");
				//Enter the Surname.
				driver.findElement(By.name("lastname")).sendKeys("User");
				//Enter the Mobile number or email address.
				driver.findElement(By.name("reg_email__")).sendKeys("121364587");
				//Enter the New password.
				driver.findElement(By.id("password_step_input")).sendKeys("Test56@ab");
				//Handle all three dropdowns in Date of birth
				WebElement day = driver.findElement(By.id("day"));
				Select dayDropdown =new Select(day);
				dayDropdown.selectByValue("6");
				WebElement month = driver.findElement(By.id("month"));
				Select monthDropdown =new Select(month);
				monthDropdown.selectByVisibleText("May");
				WebElement year = driver.findElement(By.id("year"));
				Select yearDropdown =new Select(year);
				yearDropdown.selectByIndex(10);
				
				//Select the radio button in Gender.
				driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();


				

				




	}

}
