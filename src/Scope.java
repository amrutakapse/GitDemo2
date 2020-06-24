import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\work\\chromedriver_win32 (1)_83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//get the count of links in this page
		System.out.println(driver.findElements(By.tagName("a")).size());

		//get the count of links in footer section
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		//get the count of links in footer section 1st coloumn
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		//click on each link

		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
		
			String clickonlinkstab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkstab);
		}
		
		  Set<String>s =driver.getWindowHandles(); 
		  Iterator<String> it=s.iterator();
		  
		  while(it.hasNext())
		  { 
		  driver.switchTo().window(it.next());
		  System.out.println(driver.getTitle());
		  
		  }
		 
		}

	}

