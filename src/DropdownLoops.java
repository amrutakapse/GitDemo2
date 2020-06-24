import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownLoops {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\work\\chromedriver_win32 (1)_83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.name("passenger")).click();
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.xpath("(//button[@class='pax-plus btn btn-info'])[1]")).click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary pax-done btn-pad-y']")).click();

	}

}
//div[@class='passenger-dropdown pax-selection-row']/ul/li/div/button[2]/span[1]