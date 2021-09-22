import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\SVN\\Automation\\Automation_Course\\chromedriver_win32\\chromedriver.exe");
	    WebDriver myD=new ChromeDriver();
		
		myD.get("https://www.amazon.in/");
		myD.manage().window().maximize();
		Thread.sleep(2000);
		
		myD.findElement(By.id("twotabsearchtextbox")).sendKeys("samsungm32");
		myD.findElement(By.id("nav-search-submit-button")).click();
		
		

	}

}
