import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class linkedinLogin {
	
	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the browser name to execute the script");
		String browname = sc.nextLine();
		
		if(browname.equalsIgnoreCase("chrome"))
		{	
		System.setProperty("webdriver.chrome.driver","C:\\\\SVN\\\\Automation\\\\Automation_Course\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		
		myD.get("https://www.linkedin.com/");
		myD.manage().window().maximize();
		
		myD.findElement(By.id("session_key")).sendKeys("admin");
		myD.findElement(By.name("session_password")).sendKeys("1234");
		myD.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/button")).click();
		Thread.sleep(5000);
		String mText=myD.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div[2]/form/div[1]/div/p")).getText();
		System.out.println("Error message: " +mText);
		
		
		Thread.sleep(5000);
		myD.close();
		}
		
		else
		{
			System.out.println("Please enter the valid browser name");
		}
		
		

	}

}
