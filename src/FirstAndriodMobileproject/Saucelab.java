package FirstAndriodMobileproject;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.appium.java_client.AppiumDriver;

public class Saucelab {
	
	
	AppiumDriver driver;

	@BeforeClass
	public void setUp() throws MalformedURLException 
	{
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("appium:automationName", "UiAutomator2");
		capabilities.setCapability("appium:platformVersion", "13"); 
		capabilities.setCapability("appium:deviceName","emulator-5554");
		capabilities.setCapability("appium:platformName","Android");
		capabilities.setCapability("appium:app", "C:\\Users\\Surendra\\Downloads\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		capabilities.setCapability("appium:appWaitForLaunch", false);
		capabilities.setCapability("appium:appPackage", "com.google.android.packageinstaller");
		capabilities.setCapability("appium:appActivity","com.swaglabsmobileapp.MainActivity");
		
		URL url = new URL("http://127.0.0.1:4723");
		driver = new AppiumDriver(capabilities);
		
		//driver = new AppiumDriver(new URL("http://127.0.0.1:4723"), capabilities);

	}
	@Test
	public void launch_url() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement userid=driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Username\"]"));
		userid.sendKeys("standard_user");
		WebElement password=driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"test-Password\"]"));
		password.sendKeys("secret_sauce");
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")).click();
		TakesScreenshot ts=(driver);
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("D:\\Pallavi\\demo\\Mobile Testing\\Screenshot\\photo.png");
Files.copy(src, trg)	;	
		
	
		
		

		
		
		}
	
	}
