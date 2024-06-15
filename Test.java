package automation_1st_mav_test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.TakesScreenshot;
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
import org.openqa.selenium.print.PrintOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {
	//private static final String  = null;
	public static WebDriver driver;
	public static String browser="other";

	@SuppressWarnings("deprecation")
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Driver\\chromedriver.exe");
		if(browser.equals("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			
			
		}
		else
		{
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		}
		
		// TODO Auto-generated method stub
//		driver.get("https://www.saucedemo.com/v1/");
		/*
		 * driver.manage().window().fullscreen(); String currenturl=
		 * driver.getCurrentUrl(); System.out.println(currenturl); String
		 * title=driver.getTitle(); System.out.println(title);
		 * 
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * driver.findElement(By.id("user-name")).clear();
		 * driver.findElement(By.id("user-name")).sendKeys("standard_user");
		 * System.out.println(driver.findElement(By.id("user-name")).getAttribute("id"))
		 * ; driver.findElement(By.id("password")).sendKeys("secret_sauce");
		 * System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).
		 * getCssValue("text-transform"));
		 * System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).
		 * getSize());
		 * System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).
		 * getLocation());
		 * System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).
		 * getText());
		 * System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).
		 * getTagName());
		 * System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).
		 * isDisplayed());
		 * System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).
		 * isEnabled());
		 * System.out.println(driver.findElement(By.xpath("//input[@type='submit']")).
		 * isSelected());
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 * System.out.println("Logged in successfully");
		 * 
		 * List<WebElement> webelements=
		 * driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		 * System.out.println(webelements.size());
		 * 
		 * String windowhandle=driver.getWindowHandle();
		 * System.out.println(windowhandle);
		 */
		//driver.navigate().to("http://google.com");
		//driver.close();
		//select dropdown
		/*
		 * driver.get("https://formstone.it/components/dropdown/demo/");
		 * driver.manage().window().maximize(); WebElement dddown=
		 * driver.findElement(By.name("demo_multiple")); Select select=new
		 * Select(dddown); select.selectByValue("1"); Thread.sleep(2000);
		 * select.selectByVisibleText("Two");
		 * //System.out.println("Selected 2nd value"); Thread.sleep(2000);
		 * 
		 * select.deselectByIndex(1); Thread.sleep(2000); select.selectByValue("4");
		 * Thread.sleep(2000); WebElement firstop=select.getFirstSelectedOption();
		 * System.out.println(firstop); List<WebElement> allitems=
		 * select.getAllSelectedOptions(); System.out.println(allitems.size());
		 * select.selectByValue("3"); Thread.sleep(2000); select.deselectAll();
		 * List<WebElement> allitems_empty= select.getAllSelectedOptions();
		 * System.out.println(allitems_empty.size()); driver.close();
		 */
		//count the link presnt on the page
		/*
		 * driver.navigate().to("https://www.demoblaze.com/");
		 * driver.manage().window().maximize(); List<WebElement>
		 * hlink=driver.findElements(By.tagName("a"));
		 * System.out.println("Total no. of links are:" +hlink.size()); for(WebElement i
		 * :hlink ) { System.out.println("Links on the page are:"
		 * +i.getAttribute("href")); System.out.println("Text of the links are:"
		 * +i.getText()); }
		 */
		/*
		 * driver.navigate().to(
		 * "https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		 * driver.manage().window().maximize(); List<WebElement>
		 * ddown=driver.findElements(By.tagName("Option"));
		 * System.out.println("Total country in the dropdown are:" +ddown.size());
		 * for(WebElement i:ddown) { System.out.println("Countries are:"
		 * +i.getAttribute("Option")); System.out.println("Value of the options are:"
		 * +i.getText()); }
		 */
//		driver.navigate().to("http://google.com");
//		WebElement searchresult=driver.findElement(By.xpath("//textarea[@title='Search']"));
//		searchresult.sendKeys("Delhi");
//		List<WebElement> ndresult=driver.findElements(By.xpath("//ul[@role='listbox']//li//div"));
//		System.out.println(ndresult.size());
//		
//		for(WebElement i:ndresult)
//		{
//			System.out.println("div value are:" +i.getAttribute("div"));
//		
//		}
//		while(driver.findElement(By.xpath("//ul[@role='listbox']//li//div[@aria-label='delhi']")).isDisplayed()!=true)
//		{
//			searchresult.sendKeys(Keys.ARROW_DOWN);
//			
//		}
//		
//		searchresult.sendKeys(Keys.ENTER);
//		System.out.println("Found the required result");
		//List<WebElement> searchresult=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		//int i=0;
//		System.out.println(searchresult.size());
//		for(int i=0;i<searchresult.size();i++)
//		{
//			((WebElement) searchresult).sendKeys(Keys.ARROW_DOWN);
//			if(driver.findElement(By.xpath("//ul[@role='listbox']//li//div[@aria-label='delhi']")).isDisplayed())
//			{
//				System.out.println("Found the required result");
//				((WebElement) searchresult).sendKeys(Keys.ENTER);
//				break;
//			}
//			
//		}

		//Checkbox
//		driver.navigate().to("https://formstone.it/components/checkbox/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//label[@for='checkbox-2']/parent::div")).click();
//		Thread.sleep(3000);
//		System.out.println(driver.findElement(By.xpath("//label[@for='checkbox-2']/parent::div")).isSelected());
//		//driver.findElement(By.xpath("//label[@for='checkbox-3']/parent::div")).isEnabled();
//		System.out.println("No. of checkbox is:" +driver.findElements(By.xpath("//input[@type='checkbox']")).size());
//		driver.findElement(By.xpath("//label[@for='radio-2']")).click();
//		System.out.println(driver.findElement(By.xpath("//label[@for='radio-2']")).isDisplayed());
//		Thread.sleep(2400);
//		System.out.println(driver.findElements(By.name("radio-group")).size());
		
		//I-frame
//		driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
//		driver.manage().window().maximize();
//		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
//		driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]")).click();
//		String text =driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time.')]/following-sibling::p")).getText();
//		System.out.println("Current Date & Time is:" +text);
//		driver.switchTo().parentFrame();
//		System.out.println(driver.getTitle());
//		
		//Alert & Prompt handling
//		driver.navigate().to("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
//		driver.manage().window().maximize();
//		driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
//		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
//		Thread.sleep(2000);
		//Alert alert = driver.switchTo().alert();
//		alert.sendKeys("Krishna");
//		alert.accept();
		
//		String text =driver.findElement(By.xpath("//button[contains(text(),'Try it')]/following-sibling::p")).getText();
//		System.out.println("The message displayed is:" +text);
		
		//Handle Multiple Window
//		driver.get("https://www.salesforce.com/au/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//a[contains(text(),'Register Now')]")).click();
//		Thread.sleep(2000);
//		Set<String> windowhandle= driver.getWindowHandles();
//		System.out.println(windowhandle);
//		Iterator<String> Iterator=windowhandle.iterator();
//		String parentwindow=Iterator.next();
//		String childwindow=Iterator.next();
//		System.out.println("Parent window id is:" +parentwindow+  "Child window is:" +childwindow);
//		driver.switchTo().window(childwindow);
//		//System.out.println(Iterator.toString());
//		System.out.println("Inside child window");
//		driver.findElement(By.xpath("//a[contains(text(),'Register today')]")).click();
//		driver.findElement(By.xpath("//span[contains(text(),'Register now')]/parent::a")).click();
//		driver.switchTo().window(parentwindow);
//		System.out.println(driver.getTitle());
		
		//Mouse Action and implicit wait
//		driver.navigate().to("https://www.ebay.com/");
//		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//action.moveToElement(element).perform();
		
		//Explicit wait
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		//fluent wait
//		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
//				.withTimeout(Duration.ofSeconds(10))
//			       .pollingEvery(Duration.ofSeconds(2))
//			       .withMessage("testing");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Apple']"))).click();
		
		//drag and drop action
//		driver.navigate().to("https://jqueryui.com/resizable/");
//		driver.manage().window().maximize();
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
//		WebElement drag=driver.findElement(By.cssSelector("div#draggable"));
//		WebElement drop=driver.findElement(By.cssSelector("div#droppable"));
//		WebElement resize=driver.findElement(By.xpath("//div[@id='resizable']/child::div[3]"));
//		Actions action=new Actions(driver);
//		//for drag and drop
//		action.dragAndDrop(drag, drop).perform();
//		//for resize any resizable object
//		action.dragAndDropBy(resize, 50, 60).perform();
		
		
//		Thread.sleep(2000);
//		//action.dragAndDropBy(resize, 330, 235).perform();)
//		//action.dragAndDrop(drag, drop).perform();
		//Slider
//		driver.navigate().to("https://jqueryui.com/slider/");
//		driver.manage().window().maximize();
//		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
//		WebElement slider=driver.findElement(By.xpath("//div[@id='slider']//span"));
//		Actions action=new Actions(driver);
//		action.dragAndDropBy(slider, 120, 50).perform();
//		Thread.sleep(2000);
//		action.dragAndDropBy(slider, -60, 0).perform();
//		action.contextClick().perform();
		//Keyboard action
//		driver.navigate().to("https://easycodeforall.com/text-file-comparator-online.html");
//		driver.manage().window().maximize();
//		WebElement source=driver.findElement(By.name("xmlInp"));
//		WebElement destiny=driver.findElement(By.name("xsltInp"));
//		Actions action=new Actions(driver);
//		Thread.sleep(2000);
//		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
//		Thread.sleep(2000);
//		action.keyDown(destiny, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
//		Thread.sleep(2000);
		
		//Table handling
//		driver.navigate().to("http://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
//		driver.manage().window().maximize();
//		List<WebElement> totalrow=driver.findElements(By.xpath("//table[@id='customers']//tr"));
//		int rownum=totalrow.size();
//		int headnum=(driver.findElements(By.xpath("//table[@id='customers']//th"))).size();
//		
//			for(int j=1;j<headnum+1;j++)
//			{
//				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//th[" + j + "]//span")).getText()+" ");
//			}
//			System.out.println();
//		for(int i=2;i<rownum+1;i++)
//		{
//			for(int j=1;j<headnum+1;j++)
//			{
//				System.out.print(driver.findElement(By.xpath("//table[@id='customers']//tr[" + i + "]//td[" + j + "]//span")).getText()+" ");
//			}
//			System.out.println();
//		}
		
		//Java Script Executor and screenshot
//		long currentime=System.currentTimeMillis() ;
//		driver.navigate().to("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
//		driver.manage().window().maximize();
	//	File screenshot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(screenshot, new File(".//screenshot//" + currentime +".png"));
//		JavascriptExecutor jexec=(JavascriptExecutor) driver;
//		String script="return document.title;";
//		System.out.println((String)jexec.executeScript(script));
//		driver.switchTo().frame("iframeResult");
//		jexec.executeScript("myFunction()");
//		Thread.sleep(2000);
//		driver.switchTo().alert().accept();
		
		
		//to print
		

	    driver.get("https://www.selenium.dev");
	    PrintsPage printer = (PrintsPage) driver;

	    PrintOptions printOptions = new PrintOptions();
	    printOptions.setPageRanges("1-2");

	    Pdf pdf = printer.print(printOptions);
	    String content = pdf.getContent();
	    System.out.println(content);
		
		
		driver.close();
		
	}
	
	

}
