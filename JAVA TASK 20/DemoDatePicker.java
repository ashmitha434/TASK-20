package org.SeleniumWebComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoDatePicker {
	
	public DemoDatePicker(){
		  System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");
		
	}
	
	String url = " https://jqueryui.com/datepicker/";
	String day = "22";
	
	WebDriver driver = new FirefoxDriver();
	public void launchSite() {
		driver.get(url);
		driver.manage().window().maximize();
		WebElement frameElement = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frameElement);
		
	}
	public void pickDate() {
		driver.findElement(By.cssSelector("input#datepicker")).click();
		//driver.findElement(By.cssSelector("a.ui-state-highlight")).click();
		driver.findElement(By.xpath("//span[contains(@class,'ui-icon ui-icon-circle-triangle-e')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'"+day+"')]")).click();
		
	}
	public static void main(String[] args) {
		DemoDatePicker datePick = new DemoDatePicker ();
		datePick.launchSite();
		datePick.pickDate();
		System.out.println("Selected date: 22");
	}
			

}
