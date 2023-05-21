package smarttech.ny.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParentClass {
	
	public static Properties prop;
	public static FileInputStream ip;
	public static WebDriver driver;
	 public ParentClass() {
		 
		 try {
			 prop = new Properties();
			 ip = new FileInputStream("./src/main/java/smarttech/ny/config/Config.properties");
			 prop.load(ip);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	 }
	
	public void initialization() {
		
		String browser = prop.getProperty("browserName");
		
		if(browser.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		
		else if(browser.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else {
			System.out.println("There is no driver");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("QA_ENV"));
		
		/*driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("QA_ENV"));*/
		
		
			    
			    
		
	}

}
