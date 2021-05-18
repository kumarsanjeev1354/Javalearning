import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//@Author Sanjeev Kumar
public class AmazonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Automation\\Selenium\\geckodriver-v0.29.1-win64\\geckodriver.exe");	
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://182.76.176.205/hrm/login.php/");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("oxymeter microtek");
		driver.findElement(By.id("nav-search-submit-button")).click();
		//System.out.println(driver.getTitle());
		String t=driver.getTitle();
		System.out.println("Title of page is:"+t);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/h2/a/span")).click();
		driver.manage().window().maximize();
		
		try
		{
			/*JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,450)", "");*/
			driver.wait();
			driver.findElement(By.name("submit.add-to-cart")).click();
			String s1="Added to Cart";
			WebElement d=driver.findElement(By.xpath("//*[@id=\"huc-v2-order-row-confirm-text\"]/h1"));
			if(s1.equals(d))
			{
				System.out.println("Item Added to cart");
			}
			else
			{
				System.out.println("Item not added");
			}
			
		}
		catch(Exception e)
		{
			
			System.out.println("Wrong path");
		}
		
		//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div[4]/div[1]/div[5]/div/div/div/form/div/div/div/div/div[2]/div/div[33]/div[1]/span/span/span/input")).click();
		/*String s1="Added to Cart";
		WebElement d=driver.findElement(By.xpath("//*[@id=\"huc-v2-order-row-confirm-text\"]/h1"));
		if(s1.equals(d))
		{
			System.out.println("Item Added to cart");
		}
		else
		{
			System.out.println("Item not added");
		}
		driver.close();
		*/
		
		driver.close();
	}

}

