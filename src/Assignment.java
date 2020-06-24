import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\work\\chromedriver_win32 (1)_83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//get the count of checkboxes in this page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		 driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		String a= driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).getText();
		//System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).getText());
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		//s.selectByVisibleText(a);
		s.selectByValue("option3");
		
		driver.findElement(By.id("name")).sendKeys("option3");
		driver.findElement(By.id("alertbtn")).click();
		String alerttext=driver.switchTo().alert().getText();
		
		if (alerttext.contains("option3"))
		{
			System.out.println("correct executation");
		}

		else
		{
			System.out.println("Wrong executation");
		}
		
		
		
	}

}
