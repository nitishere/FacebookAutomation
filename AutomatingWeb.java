package practiceproject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AutomatingWeb{

public static void main( String[] args) throws InterruptedException {
	WebDriver driver= new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("nitshmittal0111@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("nitish@n1");
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Create new account")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("Nitish");
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("Mittal");
	Thread.sleep(2000);
	WebElement drop=driver.findElement(By.name("birthday_day"));
	Select sc= new Select(drop);
	sc.selectByVisibleText("1");
	Thread.sleep(2000);
	WebElement drop1=driver.findElement(By.id("month"));
	Select sci=new Select(drop1);
	sci.selectByVisibleText("Nov");
	Thread.sleep(2000);
	WebElement drop2=driver.findElement(By.id("year"));
	Select scy=new Select(drop2);
	scy.selectByVisibleText("2002");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys("nitishmittal0111@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_passwd__")).sendKeys("Nitish@N1");
	Thread.sleep(2000);
	driver.findElement(By.name("websubmit")).click();
	//WebElement button=driver.findElement(By.id("u_6_3_Gd"));
	//Actions ac=new Actions(driver);
	//ac.moveToElement(button).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Yes,Find My Account']")).click();
	Thread.sleep(2000);
	
	}
}
