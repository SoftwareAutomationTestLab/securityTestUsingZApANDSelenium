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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
public class test_securityold {

    static final String ZAP_PROXY_ADDRESS="localhost";
    static final int ZAP_PROXY_PORT=8090;
    static final String ZAP_API=null;
    public WebDriver driver;
    public ClientApi api;
    
   /* @BeforeMethod
    public void setup() {
       /* String proxyserverurl=ZAP_PROXY_ADDRESS+":"+ZAP_PROXY_PORT;
        Proxy proxy=new Proxy();
        proxy.setHttpProxy(proxyserverurl);
        proxy.setSslProxy(proxyserverurl);
       

        ChromeOptions co=new ChromeOptions();
        co.setAcceptInsecureCerts(true);
         co.setHeadless(true);
co.addArguments("--disable-dev-shm-usage");
        co.setProxy(proxy);
      WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(co);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        api=new ClientApi(ZAP_PROXY_ADDRESS,ZAP_PROXY_PORT,ZAP_API);*/
 /*ChromeOptions chromeoptions = new ChromeOptions();
 chromeoptions.addArguments("--ignore-certificate-errors");
 chromeoptions.addArguments("--proxy-server=localhost:8080");
 chromeoptions.setHeadless(true);
         String PROXY = "localhost:8080";


      //  System.setProperty("webdriver.gecko.driver", new File("geckodriver").getAbsolutePath());
      //  System.setProperty("webdriver.chrome.driver", new File("chromedriver_linux").getAbsolutePath());

        org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
        proxy.setHttpProxy(PROXY);
            
            proxy.setSslProxy(PROXY);
             
               //chromeoptions.addArguments("--auto-open-devtools-for-tabs");
                
              // chromeoptions.setAcceptInsecureCerts(true);

            // Set Desired Capabilities 
DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
capabilities.setCapability("proxy",proxy);
capabilities.setCapability(ChromeOptions.CAPABILITY, chromeoptions);
/*capabilities.setCapability(CapabilityType.PROXY, proxy); 
capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true); 
capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,
 true); 
capabilities.setCapability(ChromeOptions.CAPABILITY, chromeoptions);*/
              
       /* DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PROXY, proxy);
        //capabilities.setCapability("marionette", true);
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
         capabilities.setCapability(ChromeOptions.CAPABILITY,chromeoptions);*/

         //chromeoptions.setCapability("proxy", proxy);
     
        
     /*   WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         // api=new ClientApi(ZAP_PROXY_ADDRESS,ZAP_PROXY_PORT,ZAP_API);
    }*/
  @Test
  public void securitytest() {
    String PROXY = "0.0.0.0:8080";

       WebDriverManager.chromedriver().setup();
      org.openqa.selenium.Proxy proxy = new org.openqa.selenium.Proxy();
        proxy.setHttpProxy(PROXY);
            
            proxy.setSslProxy(PROXY);
      ChromeOptions chromeoptions = new ChromeOptions();
      chromeoptions.addArguments("--ignore-certificate-errors");
   //  chromeoptions.addArguments("--proxy-server=localhost:8080");
       chromeoptions.setHeadless(true);
       DesiredCapabilities capabilities = DesiredCapabilities.chrome(); 
capabilities.setCapability("proxy",proxy);
capabilities.setCapability(ChromeOptions.CAPABILITY, chromeoptions);

       driver = new ChromeDriver(capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.get("https://rap.tbportals.niaid.nih.gov/");
      System.out.println("Launched the RAP");
  }
/*  @AfterMethod
  public void teardown() throws ClientApiException {
	  
	  if(api!=null) {
		  String title="RAP ZAP Security Report";
		  String template="traditional-html";
		  String description="This is RAP Security Test Report";
		  String reportfilename="rap-zap-report.html";
		  String targetFolder=System.getProperty("src/test/resources/");
		  ApiResponse response=api.reports.generate
		(title, template, null, description, null, null, null, null, null, reportfilename, null, targetFolder, null);
		  System.out.println("Report generated"+response.toString());
	  }
	  driver.quit();
  }*/
}
