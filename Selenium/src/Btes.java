import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//@Author Sanjeev Kumar
public class Btes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\Automation\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://online.btes.co.in/");
		driver.findElement(By.xpath("/html/body/nav/div/ul/li[2]/div/span/a")).click();
	}

}

