package Expediapage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class expediatricket {
	public static WebDriver driver;
 
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.out.println( "Hello World!" );
      System.setProperty( "webdriver.chrome.driver","C:\\Users\\Kiran\\eclipse-workspace\\softwaretestingproject\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.get("https://www.expedia.com");
      driver.manage().window().maximize();
      Thread.sleep(10000);
      System.out.println("this is before test");
      
      
  }

  @Test (priority=1)
  public void Test1() throws InterruptedException {
	  WebElement flight= driver.findElement(By.xpath("//*[text()='Flights']"));
	  flight.click();
	  System.out.println("this is test 1");
	  Thread.sleep(1000);
  }
  @Test (priority=2)
  public void Test2() throws InterruptedException {
	  WebElement leaving=driver.findElement(By.xpath("(//*[@class='uitk-fake-input uitk-form-field-trigger'])[1]"));
	  leaving.click();
	  System.out.println("this is test 2");
	  Thread.sleep(1000);
  }
  
  @Test (priority=3)
  public void Test3() throws InterruptedException {
	  WebElement leavingfrom=driver.findElement(By.xpath("(//*[@class='uitk-field-input uitk-typeahead-input'])[1]"));
	  leavingfrom.sendKeys("Washington (IAD - Washington Dulles Intl.)");
	  Thread.sleep(1000);
	  Actions ob=new Actions(driver);
	  ob.sendKeys(leavingfrom,Keys.ENTER).perform();
	  Thread.sleep(1000);
  }
    
  @Test (priority=4)
  public void Test4() throws InterruptedException {
	  WebElement goingto=driver.findElement(By.xpath("(//*[@class='uitk-fake-input uitk-form-field-trigger'])[2]"));
	  goingto.click();
	  Thread.sleep(1000);
	   }
  
  @Test (priority=5)
 public void Test5() throws InterruptedException {
	  WebElement going2=driver.findElement(By.xpath("//*[@id='location-field-leg1-destination']"));
	  going2.sendKeys("Kathmandu (KTM-Tribhuvan Intl.)");
	  Thread.sleep(1000);
	  Actions ob=new Actions(driver);
	  ob.sendKeys(going2,Keys.ENTER).perform();
	  Thread.sleep(1000);
		  }
  @Test (priority=6)
  public void Test6() throws InterruptedException {
	  WebElement departing=driver.findElement(By.xpath("(//*[@class='uitk-faux-input uitk-form-field-trigger'])[1]"));
	  departing.click();
	  Thread.sleep(1000);}

  @Test (priority=7)
  public void Test7( ) throws InterruptedException {
	  WebElement date2=driver.findElement(By.xpath(" (//*[@class='uitk-date-picker-day uitk-new-date-picker-day'])[26]"));
	  date2.click();
	  Thread.sleep(1000); }
  
  @Test (priority=8)
  public void Test8( ) throws InterruptedException {
	  WebElement done=driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']"));
	  done.click();
	  Thread.sleep(1000); }
 
  @Test (priority=9)
  public void Test9() throws InterruptedException {
	  WebElement returning=driver.findElement(By.xpath("(//*[@class='uitk-faux-input uitk-form-field-trigger'])[2]"));
	  returning.click();
	  Thread.sleep(1000); }
  
  @Test (priority=10)
  public void Test10() throws InterruptedException {
	  WebElement returndate=driver.findElement(By.xpath("(//*[@class='uitk-date-picker-day uitk-new-date-picker-day'])[37]"));
	  returndate.click();
	  Thread.sleep(1000); }
  
  @Test (priority=11)
  public void Test11( ) throws InterruptedException {
	  WebElement done2=driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']"));
	  done2.click();
	  Thread.sleep(1000); }
  
  @Test (priority=12)
  public void Test12( ) throws InterruptedException {
	  WebElement submit=driver.findElement(By.xpath("(//*[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary'])[1]"));
	  submit.click();
	  Thread.sleep(3000); }
 
  @Test (priority=13)
  public void Test13() throws InterruptedException {
	  WebDriverWait ob = new WebDriverWait(driver, 50); 
	  ob.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@class='uitk-card-link'])[1]")));
	  Thread.sleep(5000);
	  WebElement flight1= driver.findElement(By.xpath("(//*[@class='uitk-card-link'])[1]"));
	  flight1.click();
	  Thread.sleep(1000);}
	 
	  
	  @Test (priority=14)
	  public void Test14() throws InterruptedException {
		  WebElement select1=driver.findElement(By.xpath("//*[text()='Select']"));
		  select1.click();
		  Thread.sleep(10000);
		  
	  }
	  @Test (priority=15)
	  public void Test15() throws InterruptedException {
		  WebElement flight2 = driver.findElement(By.xpath("(//*[@class='uitk-card-link'])[1]"));
		  flight2.click();
		  Thread.sleep(3000);}
	  
	  @Test (priority=16)
	  public void Test16() throws InterruptedException {
		  WebElement sel=driver.findElement(By.xpath("//*[text()='Select']"));
		  sel.click();
		  Thread.sleep(10000);}
	  
	  @Test (priority=17)
	  public void Test17() throws InterruptedException {
		  Set<String> winsession= driver.getWindowHandles();
		  Iterator<String> itr= winsession.iterator(); 
		  String win1= itr.next();
		  String win2= itr.next();
		  System.out.println("session id  of 1st window=" +win1);
		  System.out.println("session id  of 2nd window="+win2);
		  driver.switchTo().window(win2);
		  WebElement checkout=driver.findElement(By.xpath("//*[text()='Check out']"));
		  checkout.click();
		  Thread.sleep(1000);
		  
		 	  }	  
		  
	  @Test (priority=18)
	  public void Test18() throws InterruptedException {
		  WebElement firstname=driver.findElement(By.xpath("//*[@id='firstname[0]']"));
		  firstname.sendKeys("kiran");
		  Thread.sleep(3000);
	  }
	  
	  @Test (priority=19)
	  public void Test19() throws InterruptedException {
		  WebElement middlename=driver.findElement(By.xpath("(//*[@class='text cko-field always-include gb-whitelist'])[1]"));
		 middlename.sendKeys("kb");
		  Thread.sleep(3000);}
	  
	  @Test (priority=20)
	  public void Test20() throws InterruptedException {
		  WebElement lastname=driver.findElement(By.xpath("//*[@id='lastname[0]']"));
		 lastname.sendKeys("bhattarai");
		  Thread.sleep(3000);}
	  
	  @Test (priority=21)
	  public void Test21() throws InterruptedException {
		  WebElement country=driver.findElement(By.xpath("//*[@class='cko-field always-include gb-whitelist alpha3CountryCode']"));
		 country.sendKeys("India +91");
		 
	  Actions ob=new Actions(driver);
	  ob.sendKeys(country,Keys.ENTER).perform();
	  Thread.sleep(3000);} 
	 
	  
	  
	  @Test (priority=22)
	  public void Test22() throws InterruptedException {
		  WebElement phonenumber=driver.findElement(By.xpath("//*[@id='phone-number[0]']"));
		 phonenumber.sendKeys("240-419-4141");
		  Thread.sleep(3000);}
	  
	 
	  @Test (priority=23)
	  	  public void Test23() throws InterruptedException {
		  WebElement password=driver.findElement(By.xpath("//*[@id='passport[0]']"));
		 password.sendKeys("India");
		 
	  Actions ob=new Actions(driver);
	  ob.sendKeys(password,Keys.ENTER).perform();
	  Thread.sleep(3000);} 
	 
	  
	  
	  
	  @Test (priority=24)
	  public void Test24() throws InterruptedException {
		  WebElement gender=driver.findElement(By.xpath("//*[@id='gender_male[0]']"));
		 gender.click();
		  Thread.sleep(3000);}
	  
	  @Test (priority=25)
	  public void Test25() throws InterruptedException {
		  WebElement month=driver.findElement(By.xpath("//*[@id='date_of_birth_month0']"));
		 month.sendKeys("10-oct");
		 
	  Actions ob=new Actions(driver);
	  ob.sendKeys(month,Keys.ENTER).perform();
	  Thread.sleep(3000);}
	  
	  @Test (priority=26)
	  public void Test26() throws InterruptedException {
		  WebElement day=driver.findElement(By.xpath("//*[@id='date_of_birth_day[0]']"));
		 day.sendKeys("10");
		 
	  Actions ob=new Actions(driver);
	  ob.sendKeys(day,Keys.ENTER).perform();
	  Thread.sleep(3000);}
	  
	  @Test (priority=27)
	  public void Test27() throws InterruptedException {
		  WebElement year=driver.findElement(By.xpath("//*[@id='date_of_birth_year[0]']"));
		 year.sendKeys("1996");
		 
	  Actions ob=new Actions(driver);
	  ob.sendKeys(year,Keys.ENTER).perform();
	  Thread.sleep(3000);}
  
	 	
  @AfterTest
  public void afterTest() throws InterruptedException {
	  driver.close();
	  Thread.sleep(3000);
	  
  }

}
