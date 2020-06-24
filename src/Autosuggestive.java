import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\work\\chromedriver_win32 (1)_83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		//type ben
		//using arrow down keep moving down till you got Bengluru International Airport
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BEN");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
		//javascript DOM can extract hidden elements
		//investigate the properties of the object if it have any hidden text
int i=0;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script=" return document.getElementById(\"fromPlaceName\").value";
		String text=(String) js.executeScript(script);

		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			i++;
			driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.ARROW_DOWN);
			text=(String) js.executeScript(script);
			System.out.println(text);
			if(i>10)
			{
				break;
			}
		}
		
		if (i>10)
		{
			System.out.println("elemnet not found");
			
		}
		else
		{
			System.out.println("elemnetfound");
		
			
		}
		
	}

}
