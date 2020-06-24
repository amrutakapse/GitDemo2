import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ShoppingBase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\work\\chromedriver_win32 (1)_83\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		   WebDriverWait w=new WebDriverWait(driver,5);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		String [] itemsneeded= {"Cucumber","Brocolli","Beetroot","Carrot"};
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		//ShoppingBase base=new ShoppingBase();
	//base.additeams(driver, itemsneeded);//if you want top directly call  the method without creating object of this class, you need to add static in front of your method
	additeams(driver, itemsneeded);
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	//explicit wait wait till next page loads
	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
	

	
	 driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
    driver.findElement(By.cssSelector("button.promoBtn")).click();
    //explicit wait
 
    w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
    
   System.out.println( driver.findElement(By.cssSelector("span.promoInfo")).getText());
   //Assert.assertEquals(driver.findElement(By.cssSelector("span.promoInfo")).getText(), "Code applied ..!");
   
   
	}
	
	public static void additeams(WebDriver driver,String [] itemsneeded)
	{
		List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<product.size();i++)
		{
			String[] name=product.get(i).getText().split("-");
			String formatedname=name[0].trim();
			//see if  the name you got is present in array or not
			//convert array to array list
			List itemsneedlist=Arrays.asList(itemsneeded);
			int j=0;
			if(itemsneedlist.contains(formatedname))
			{
				
				j++;
				//add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
					if(j==itemsneeded.length)
					{
						break;
					}
			}
			
			
			
		}
		
	}

}
