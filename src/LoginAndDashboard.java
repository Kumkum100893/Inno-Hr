import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginAndDashboard {

	public static void main(String[] args) throws InterruptedException
	
	{
		
	WebDriver driver = new ChromeDriver();
	 //WebDriver driver=new EdgeDriver();
	//WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://marketadvisor.co.in/hrapp/#enckey=5eb1b161bae1b124");
	driver.findElement(By.className("mat-input-element")).sendKeys("amogh");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("siddaganga");
	driver.findElement(By.className("mat-focus-indicator")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[text()=' Apply Leave ']")).click();
	Thread.sleep(5000);
	
	driver.findElement(By.id("mat-select-0")).click();
	driver.findElement(By.xpath("//*[text() =' SICK LEAVE ']")).click();
	//Select dropdown = new Select(staticDropdown);
	//dropdown.selectByIndex(1);
	
	
	
	
	
	
	driver.findElement(By.className("text-primary-normal")).click();
	/**driver.navigate().to("https://marketadvisor.co.in/mob-app/dev/app/#/home" );
	driver.navigate().back();
	driver.get("https://www.google.com/");
	driver.navigate().forward();**/
	
	}

}
