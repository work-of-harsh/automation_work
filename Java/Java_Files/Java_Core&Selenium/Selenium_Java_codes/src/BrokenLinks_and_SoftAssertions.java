import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class BrokenLinks_and_SoftAssertions {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links =  driver.findElements(By.xpath("//li[@class=\"gf-li\"]/a"));    //list of webelements having urls
		SoftAssert sof = new SoftAssert();    //execution will not stop at exception point.
		for (WebElement link : links)
		{      String url = link.getAttribute("href");      //href attribute has url to hit.
			   HttpURLConnection  conn =  (HttpURLConnection) new URL(url).openConnection();       //openConnection method under URL class has methods to be used below.
			   conn.setRequestMethod("HEAD");   
			   //The HEAD method is identical to GET except that the server MUST NOT return a message-body in the response.
			   conn.connect();    //HEAD request is sent and response is captured in "conn" itself.
			   System.out.println(conn.getResponseCode());
			   sof.assertFalse(conn.getResponseCode() >=400, "Link with text " +link.getText() + " has status code " + conn.getResponseCode());  //soft assertion will capture exception at this point but will not stop execution.
		}
       sof.assertAll();   //will throw all exception at once and stop execution.
	}

}
