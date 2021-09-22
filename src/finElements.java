import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class finElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\SVN\\Automation\\Automation_Course\\chromedriver_win32\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		
		myD.get("https://www.google.com/");
		int button=myD.findElements(By.xpath("//input[@type='submit']")).size();
		System.out.println("Total no of buttons: "+button);
		
		Thread.sleep(3000);
		myD.close();
		

	}

}
