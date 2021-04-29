import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//WedDriver -Interface Chrome, Firefox,Edge
//@Author Sanjeev Kumar
public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring and instatiating driver object
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/"); 
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getTitle());
		//driver.navigate().back();
		//driver.close();
		//try
		//{
			//driver.findElement(By.linkText("")));
		//}
		//catch(Exception e)
		//{
			
		//}
		/*
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("test");
		//driver.findElement(By.xpath("//input[name='pass']")).sendKeys("login");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("login");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"u_0_l_B0\"]")).click();
		\\driver.findElement(by/)
		*/
		Boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img")).isDisplayed();
		if(b)
		{
			System.out.println("Logo showing");
		}
		else
		{
			System.out.println("Logo not showing");
		}
		
		
		
	}

}

