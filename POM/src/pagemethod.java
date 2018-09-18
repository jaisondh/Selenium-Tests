import org.openqa.selenium.*;
 
public class pagemethod 
{
   private static WebElement element = null;
 

   public static WebElement lnk_hmv_calc(WebDriver driver)
   {
      element = driver.findElement(By.id("homeprice"));
      return element;
   }
	
   public static WebElement lnk_dppercent_calc(WebDriver driver)
   {
      element = driver.findElement(By.id("downpayment"));
      return element;
   }
	
   public static WebElement txt_mort_amt(WebDriver driver)
   {
      element = driver.findElement(By.id("mortgageamount"));
      return element;
   }
   
   public static WebElement tot_mont_pay(WebDriver driver)
   {
      element = driver.findElement(By.id("periodicpayment"));
      return element;
   }	
}