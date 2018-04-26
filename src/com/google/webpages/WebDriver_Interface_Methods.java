package com.google.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Interface_Methods
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.MINUTES);
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().to("http://www.samsyst.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.techmahindra.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();

	}

}
