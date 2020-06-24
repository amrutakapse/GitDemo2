import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertifications {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ssl certifications
		//general chrome profile
		//get desired capabilities
		
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//below is your local browser
		//merge the general browser capabilities with local browser,so it will know that it have to handle ssl cerifications
		
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\work\\chromedriver_win32 (1)_83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(c);
	}

}
