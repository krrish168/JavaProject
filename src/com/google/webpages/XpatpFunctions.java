package com.google.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpatpFunctions
{
	static 
	{
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	//WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	WebElement option=driver.findElement(By.xpath("//a[@class='gb_b gb_hc']"));
	option.click();
	Thread.sleep(2000);
	WebElement menu=driver.findElement(By.xpath("//li[@class='gb_Z'][last()-3]"));
	menu.click();
	Thread.sleep(2000);
	driver.navigate().back();
	WebElement option1=driver.findElement(By.xpath("//a[@class='gb_b gb_hc']"));
	option1.click();
	WebElement menu1=driver.findElement(By.xpath("//li[@class='gb_Z'][last()-5]"));
	menu1.click();
	driver.navigate().back();
	Thread.sleep(2000);
	}

}
