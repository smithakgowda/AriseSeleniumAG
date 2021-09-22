import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class casestudy {

	public static void main(String[] args) throws InterruptedException {
		 int a=0,b=0;
	        System.setProperty("webdriver.chrome.driver","C:\\SVN\\Automation\\Automation_Course\\chromedriver_win32\\chromedriver.exe");
	        WebDriver myD=new ChromeDriver();
	        myD.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
	        myD.manage().window().maximize();
	        String food="1000",Clothing="2000",shelter="500";
	        myD.findElement(By.id("food")).sendKeys(food);
	        Thread.sleep(2000);
	        myD.findElement(By.id("clothing")).sendKeys(Clothing);
	        Thread.sleep(2000);
	        myD.findElement(By.id("shelter")).sendKeys(shelter);
	        Thread.sleep(2000);
	        String totalMonthlyExpenses= myD.findElement(By.id("totalMonthlyExpenses")).getText();
	        String totalMonthlyIncome= myD.findElement(By.id("totalMonthlyIncome")).getText();
	        try {
	         a=Integer.valueOf(totalMonthlyExpenses);
	         b=Integer.valueOf(totalMonthlyIncome);
	        }
	        catch(Exception e){
	        }
	        if(a>b) {
	            System.out.println("Expense is High..");
	        }
	        else {
	            System.out.println("Income is High..");
	            }
	         Thread.sleep(3000);
	         myD.close();

	}

}
