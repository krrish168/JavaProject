package com.google.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames_Handling 
{
	static 
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException
	{
	//WebDriver driver =new FirefoxDriver();
	WebDriver  driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.MINUTES);
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.seleniumhq.org");
	Thread.sleep(2000);
	WebElement dwnd=driver.findElement(By.xpath("//a[.='Download']"));
	dwnd.click();
	Thread.sleep(1000);
	WebElement src=driver.findElement(By.xpath("//a[contains(text(),'source')]"));
	Thread.sleep(2000);
	src.click();
	WebElement java=driver.findElement(By.xpath("//a[.='Java']"));
	java.click();
	Thread.sleep(2000);

	//driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	driver.switchTo().frame("packageFrame");
	WebElement btn=driver.findElement(By.xpath("//span[.='Action']"));
	btn.click();
	Thread.sleep(2000);
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	driver.switchTo().frame("packageListFrame");
	WebElement pack=driver.findElement(By.xpath("//a[.='org.openqa.selenium']"));
	pack.click();
	Thread.sleep(1000);
	//driver.switchTo().frame("classFrame");
	driver.switchTo().defaultContent();
	driver.switchTo().frame("classFrame");
	Thread.sleep(2000);
	WebElement classes=driver.findElement(By.xpath("//a[.='Frames']"));
	classes.click();
	}
}

