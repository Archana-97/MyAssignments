package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) {
		//Launch browser
//				ChromeDriver driver = new ChromeDriver();
				EdgeDriver driver = new EdgeDriver();
				//Load Url
				driver.get("http://leaftaps.com/opentaps/control/main");
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
				//Click on Leads tab
				driver.findElement(By.linkText("Leads")).click();
				//Click on the "Create Lead" button.
				driver.findElement(By.linkText("Create Lead")).click();
				//Enter a FirstName
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Archana");
				//Enter a last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K M");
				//Enter a CompanyName
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TTC");
				//Enter a Title 
				String Title = "Automation";
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys(Title);
				//Click the "Create Lead" button.
				driver.findElement(By.name("submitButton")).click();
				//Verify that the Title is displayed correctly.
				String TitleNew = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
				System.out.println(TitleNew);
				if(TitleNew.equals(Title))
				{
					System.out.println("Title displayed corrrectly");
				}
				else
				{
					System.out.println("Title is not displayed corrrectly");
				}
				
				driver.close();

			
	}

}
