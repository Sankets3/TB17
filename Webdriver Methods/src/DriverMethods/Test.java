package DriverMethods;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args)
	{
		System.out.println("Hello Selenium");
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\Automation Seleniunm\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
                driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println(title);
		
		String curl=driver.getCurrentUrl();
		System.out.println(curl);
		
		Set<Cookie> cookie=driver.manage().getCookies();
		System.out.println(cookie);
		
		String wkey=driver.getWindowHandle();
		System.out.println(wkey);
		
		Set<String> key=driver.getWindowHandles();
		System.out.println(key);
		
	        // String ps=dr.getPageSource(); 
		//System.out.println(ps);
		
		driver.navigate().to("https://auto.mahindra.com/suv/thar");
		
	    driver.close();
	    
	    driver.quit();
	}

}
