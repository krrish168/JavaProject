package com.google.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators_name_id_classname_etc 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	//WebDriver driver=new FirefoxDriver();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.MINUTES);
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.co.in");
	WebElement search=driver.findElement(By.id("lst-ib"));
	search.sendKeys("Lord Hanuman");
	WebElement click=driver.findElement(By.name("btnK"));
	click.submit();
	//click.click();
	Thread.sleep(2000);
	WebElement link=driver.findElement(By.xpath("(//a[.='Hanuman - Wikipedia'])[1]"));
	link.click();
	Thread.sleep(2000);
	WebElement wiki=driver.findElement(By.className("mw-wiki-logo"));
	wiki.click();
	WebElement text=driver.findElement(By.id("searchInput"));
	text.sendKeys("Ancient India");
	WebElement button=driver.findElement(By.id("searchButton"));
	button.click();
	Thread.sleep(2000);
	WebElement tag=driver.findElement(By.tagName("a"));
	String tags=tag.getTagName();
	System.out.println(tags);
	WebElement linkT=driver.findElement(By.linkText("Outlines"));
	System.out.println(driver.getTitle());
	linkT.click();
	driver.navigate().back();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().back();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().back();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().back();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().back();
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	WebElement search1=driver.findElement(By.id("lst-ib"));
	search1.sendKeys(Keys.CLEAR);
	
	//driver.close();
	}

}
