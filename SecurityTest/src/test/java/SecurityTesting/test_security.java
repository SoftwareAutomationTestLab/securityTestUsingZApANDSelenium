package SecurityTesting;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class test_security {

   
  @Test
  public void securitytest() throws  java.net.MalformedURLException{
      // TODO Auto-generated method stub
        String PROXY = "localhost:8090";
      //  System.setProperty("webdriver.gecko.driver", new File("geckodriver").getAbsolutePath());
      //  System.setProperty("webdriver.chrome.driver", new File("chromedriver_linux").getAbsolutePath());

        org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
        proxy.setHttpProxy(PROXY)
             .setFtpProxy(PROXY)
             .setSslProxy(PROXY);
              ChromeOptions chromeoptions = new ChromeOptions();
               chromeoptions.addArguments("--auto-open-devtools-for-tabs");
               chromeoptions.setHeadless(true); 
              // chromeoptions.setAcceptInsecureCerts(true);
              
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);
        //capabilities.setCapability("marionette", true);
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
         capabilities.setCapability(ChromeOptions.CAPABILITY,chromeoptions);
     
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
      driver.get("https://rap.tbportals.niaid.nih.gov/#!/dashboard/home");
      System.out.println("Launched the RAP");
  }
  
}
