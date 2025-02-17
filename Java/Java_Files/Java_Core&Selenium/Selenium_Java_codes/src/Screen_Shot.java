import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.apache.commons.io.FileUtils;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/Lenovo/AppData/Local/Programs/Python/Python37/Scripts/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);    //this ignores ssl certificate.
		WebDriver driver = new ChromeDriver (options);
		driver.manage().deleteAllCookies();   //deleting cookies
		driver.get("https://www.screener.in");
		driver.manage().window().maximize();   //maximize browser
		File scn_shot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);      //we casted driver object into TakesScreenshot method, TakesScreenshot method becomes equal to driver object.
		                                                                             //scn_shot object has screenshot file.
		FileUtils.copyFile(scn_shot, new File("C:\\Users\\Lenovo\\eclipse-workspace\\Introduction\\src"));
		driver.close();
	}

}
