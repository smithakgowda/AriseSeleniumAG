import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHover {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SVN\\Automation\\Automation_Course\\chromedriver_win32\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		
		myD.get("https://www.amazon.in/");
		Thread.sleep(3000);
        Actions mouseh = new Actions(myD);
        mouseh.moveToElement((myD.findElement(By.linkText("Hello, Sign in")))).build().perform();
        Thread.sleep(3000);
        myD.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span")).click();
        Thread.sleep(3000);
        
        myD.close();
	}

}
