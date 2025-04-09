package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaftapsAccounts {

	public static void main(String[] args) {
		//Launch browser
//		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		//Load Url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//maximize window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter Username
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on Accounts tab
		driver.findElement(By.linkText("Accounts")).click();
		//click on create account button
		driver.findElement(By.linkText("Create Account")).click();
		//Declare a variable for storing account name
		String accountName = "Archana";
		//Pass the account name in the variable to input field
		driver.findElement(By.id("accountName")).sendKeys(accountName);
		//Enter description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Select industry
		WebElement Sourceelement1 = driver.findElement(By.name("industryEnumId"));
		Select dropdown1 = new Select(Sourceelement1);
		dropdown1.selectByIndex(3);
		//Select ownership
		WebElement Sourceelement2 = driver.findElement(By.name("ownershipEnumId"));
		Select dropdown2 = new Select(Sourceelement2);
		dropdown2.selectByVisibleText("S-Corporation");
		//Select source
		WebElement Sourceelement3 = driver.findElement(By.id("dataSourceId"));
		Select dropdown3 = new Select(Sourceelement3);
		dropdown3.selectByValue("LEAD_EMPLOYEE");
		//Select marketing campaign
		WebElement Sourceelement4 = driver.findElement(By.id("marketingCampaignId"));
		Select dropdown4 = new Select(Sourceelement4);
		dropdown4.selectByIndex(6);
		//Select state/province
		WebElement Sourceelement5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropdown5 = new Select(Sourceelement5);
		dropdown5.selectByValue("TX");
		//Click on Create Account button 
		driver.findElement(By.className("smallSubmit")).click();
		//Verify account name displaying correctly.
		WebElement nameAfterCreation = wait.until(
	            ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='tabletext'])[3]")));
		String Account = nameAfterCreation.getText();
		String name = Account.split(" ")[0];
		System.out.println(name);
		System.out.println(accountName);

		if (name.equals(accountName))
		{
			System.out.println("Account created successfully for the user " + accountName);
		}
		else
		{
			System.out.println("Account name is wrong for the user " + accountName);
		}
		
		//Close the browser
		driver.close();

	}

}
