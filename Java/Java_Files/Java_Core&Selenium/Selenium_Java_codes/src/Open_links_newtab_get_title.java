import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_links_newtab_get_title {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//lecture 93
		//1. Give me the count of links on the page.
			
				
			System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
			WebDriver driver = new ChromeDriver (); // we need to create object to access methods of a class
				
				driver.get("http://qaclickacademy.com/practice.php");
				
				System.out.println(driver.findElements(By.tagName("a")).size());
				//2. Count of footer section links count
				WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope , "footerdriver" is the new "driver".
				
				System.out.println(footerdriver.findElements(By.tagName("a")).size());
				
				//// Limiting webdriver scope again.
				WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
				System.out.println(coloumndriver.findElements(By.tagName("a")).size());
				
				//4- click on each link in the coloumn and check if the pages are opening-
				for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
				{
					
					String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);   //pressing keys together
					
					coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);  //opening link in new tab
					Thread.sleep(5000L);
					
				}
				 Set<String> abc=driver.getWindowHandles();//4 new tabs opened)
				 Iterator<String> it=abc.iterator();
				System.out.println(abc.size());  //total 5 tabs, 1 current, 4 new.
				 while(it.hasNext())    //condition true if iteration has more elements.
				{
					
				   driver.switchTo().window(it.next());
				   System.out.println(driver.getTitle());   //print title
				
				}
					
					
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}

	}


