package TestMaven2.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Author Sanjeev Kumar
public class TestBase {

	WebDriver driver;
	public TestBase()
	{
		try {
			FileInputStream inp=new FileInputStream("C:\\Users\\sanjeev kumar\\eclipse-workspace\\Testing23\\src\\test\\java\\TestMaven2\\Configuration\\config.properties");
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void initilazation()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void termination()
	{
		driver.close();
	}
}

