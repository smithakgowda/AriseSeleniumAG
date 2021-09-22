import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javademo {

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver","C:\\SVN\\Automation\\Automation_Course\\chromedriver_win32\\chromedriver.exe");
	 WebDriver myD=new ChromeDriver();
	 myD.get("https://www.google.com/");
	 myD.manage().window().maximize();
	 String vTitle=myD.getTitle();
	 System.out.println("Title of the screen is " +vTitle);
	 Thread.sleep(5000);
	 myD.close();
	 
	}

}
