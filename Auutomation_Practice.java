package automation_1st_mav_test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.TakesScreenshot;

public class Auutomation_Practice {
	public static WebDriver driver;
	public static String browser="Chrome";

	@BeforeMethod
	 void main() {
		// TODO Auto-generated method stub
		if(browser.equals("Chrome"))
		{
			WebDriverManager.chromedriver().clearDriverCache().setup();
			WebDriverManager.chromedriver().clearResolutionCache().setup();
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else if(browser.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
	}
	@Test
	void Login()
	{
		driver.get("https://www.godaddy.com/en-in");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.godaddy.com/en-in","validating the URL");
		Assert.assertEquals(driver.getTitle(), "Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
		System.out.println(driver.getPageSource().contains(driver.getTitle()));
		Assert.assertEquals(false, driver.getPageSource().contains(driver.getTitle()),"Verified that the title is contained in page source");
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated( By.xpath("//span[text()='Domains']/.."))).click();
		//driver.findElement(By.xpath("//span[text='Domains']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.linkText("Search for Domain Names")).click();
		Assert.assertEquals("Search & Buy Available Domains - Register a Domain with GoDaddy", driver.getTitle());
		LocalDate date= LocalDate.now();
		File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(Source, new File(".//Screenshot//"+date+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	@Test
	void dropdown()
	{
		driver.navigate().to("https://formstone.it/components/dropdown/demo/");
		Select select= new Select(driver.findElement(By.id("demo_basic")));
		select.selectByVisibleText("One");
		select.selectByIndex(1);
		select.selectByValue("2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2) );
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		Select select1=new Select(driver.findElement(By.id("demo_multiple")));
		select1.selectByValue("1");
		select1.selectByValue("2");
		select1.selectByValue("4");
		for(WebElement i: select.getAllSelectedOptions())
		{
			System.out.println(String.valueOf(i.getText()));
			System.out.println(i.getAttribute("value"));
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2) );
		select1.deselectByIndex(1);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2) );
		System.out.println("First Option is:-"+select1.getFirstSelectedOption());
		select1.deselectAll();
		
		
	}
	@Test
	void linkcount()
	{
		driver.navigate().to("https://www.demoblaze.com/");
		int count=0;
		for(WebElement i:driver.findElements(By.tagName("a")))
		{
			System.out.println(i.getTagName());
			System.out.println(i.getText());
			System.out.println(i.getAttribute("href"));
			count++;
		}
		System.out.println("Total number of links are:-"+count);
	}
	@Test
	void checkbox_radio()
	{
		driver.get("https://formstone.it/components/checkbox/");
		driver.findElement(By.xpath("//input[@id='checkbox-2']/..")).click();
		driver.findElement(By.xpath("//input[@id='radio-2']/..")).click();
		ArrayList<Object> l1= new ArrayList<Object>();
		l1.add(driver.findElement(By.xpath("//input[@id='checkbox-2']/..")).isSelected());
		l1.add(driver.findElement(By.xpath("//input[@id='radio-2']/..")).isDisplayed());
		l1.add (driver.findElement(By.xpath("//input[@id='checkbox-3'][@disabled]/..")).isEnabled());
		l1.add(( driver.findElement(By.xpath("//input[@id='radio-3']/..")).isEnabled()));
		System.out.println(l1);
	}
	
	@Test
	void iframetest()
	{
		driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		System.out.println("test");
		driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]")).click();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		driver.switchTo().parentFrame();
	}
	
	@Test
	void alert()
	{
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
		System.out.println("test");
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Krishna");
		alert.accept();
		
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		driver.switchTo().parentFrame();
		
	}
	
	@Test
	void windowhandle()
	{
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']/..")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Set<String>Windowhandle=driver.getWindowHandles();
		Iterator<String> iterator=Windowhandle.iterator();
		String Parentwindow= iterator.next();
		String ChildWindow= iterator.next();
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.name("UserFirstName")).sendKeys("Krishna");
		driver.close();
		driver.switchTo().window(Parentwindow);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	}
	
	@Test
	void waitExm()
	{
		driver.get("https://www.salesforce.com/au/");
		driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']/..")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']/..")))).click();
		Wait<WebDriver> wait1= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).withMessage("finding the element");
		//wait.until(ExpectedConditions.visibilityOfElementLocated(driver.findElement(By.xpath("//a[@aria-label='Start free trial: Try Salesforce Starter Suite for free.']/.."))).click();
	}
	
	@Test
	void mouseclickdrag()
	{
		driver.navigate().to("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Actions action= new Actions(driver); 
		WebElement draggable=driver.findElement(By.cssSelector("div#draggable"));
		action.dragAndDropBy(draggable,50,50).perform(); 
	}
	
	@Test
	void mouseclickdragdrop()
	{
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Actions action=new Actions(driver);
		action.dragAndDrop(driver.findElement(By.cssSelector("div#draggable")), driver.findElement(By.cssSelector("div#droppable"))).perform();
		
	}
	
	@Test
	void selectall() throws InterruptedException
	{
		driver.get("https://jqueryui.com/selectable/#default");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Actions action= new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//ol[@id='selectable']//li[1]"))).moveToElement(driver.findElement(By.xpath("//ol[@id='selectable']//li[7]"))).release();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Thread.sleep(3000);
	}
	
	@Test
	void copypaste()
	{
		driver.navigate().to("https://easycodeforall.com/text-file-comparator-online.html");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		action.keyDown(driver.findElement(By.name("xmlInp")), Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		action.keyDown(driver.findElement(By.name("xsltInp")), Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
	}
	
	
	@AfterMethod
	void close()
	{
		driver.close();
	}

}
