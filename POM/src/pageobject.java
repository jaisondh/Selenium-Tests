
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class pageobject {

   public static void main(String[] args) throws InterruptedException {
	   
	 WebDriver driver = new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      
	 driver.navigate().to("https://usmortgagecalculator.org/");
	 Thread.sleep(1000);
	  
	 driver.manage().window().maximize();
	  
     
      pagemethod.lnk_hmv_calc(driver).clear();
      pagemethod.lnk_hmv_calc(driver).sendKeys("500000");
	  Thread.sleep(1000);
	  
	  pagemethod.lnk_dppercent_calc(driver).clear();
      pagemethod.lnk_dppercent_calc(driver).sendKeys("12");
	  Thread.sleep(1000);
	  
	  
	  pagemethod.txt_mort_amt(driver).clear();
	  pagemethod.txt_mort_amt(driver).sendKeys("440000");      
	  Thread.sleep(1000);
           
	  pagemethod.tot_mont_pay(driver).click();
      String result =  pagemethod.tot_mont_pay(driver).getText();
      Thread.sleep(1000);
      
      if(result.equals("$3,257.85")){      
         System.out.println(" The Result is Pass");
         }
      else {
         System.out.println(" The Result is Fail");
         
         }
      driver.close();
	  
      }
   }