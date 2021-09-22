import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class diffElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\SVN\\Automation\\Automation_Course\\chromedriver_win32\\chromedriver.exe");
	    WebDriver myD=new ChromeDriver();
		
		myD.get("https://www.google.com/");
		myD.manage().window().maximize();
		Thread.sleep(2000);
		myD.get("https://www.mortgagecalculator.org/");
		myD.manage().window().maximize();
		Thread.sleep(2000);
		myD.findElement(By.id("homeval")).sendKeys("2000");
		myD.findElement(By.id("downpayment")).sendKeys("200");
		myD.findElement(By.xpath("//input[@value='percent']")).click();
		if(myD.findElement(By.xpath("//input[@value='percent']")).isSelected())
		{
			System.out.println("PASS : Radio Button Selected");
		}
		else
		{
			System.out.println("FAIL : Radio Button Not Selected");
		}

		
		Select monthSelect=new Select(myD.findElement(By.name("param[start_month]")));
		monthSelect.selectByValue("12");
		Thread.sleep(5000);
		monthSelect.selectByIndex(4);
		Thread.sleep(5000);
		monthSelect.selectByVisibleText("Jul");
		Thread.sleep(5000);
		
		myD.findElement(By.xpath("//input[@value='Calculate']")).click();
		
		
		String vMPay=myD.findElement(By.xpath("//div[@class='repayment-block']/div[1]/div[1]/h3")).getText();
		System.out.println("Total Montly Payment is "+vMPay);
		
		Thread.sleep(5000);
		myD.close();
		

	}

}
