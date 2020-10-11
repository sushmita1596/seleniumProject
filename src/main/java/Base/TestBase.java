package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() throws FileNotFoundException
	{
		prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\sushmita\\eclipse-workspace\\Cucumber1\\src\\main\\java\\"
				+ "config\\config.properties");
		try
		{
			prop.load(ip);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		public static void Initialization()
		{
			String browsername=prop.getProperty("browser");
			if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sushmita\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.get(prop.getProperty("url"));
			
		}

}
