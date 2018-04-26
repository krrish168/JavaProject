package com.google.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Close_and_Quit_methods 
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
	driver.get("https://www.naukri.com");
	Thread.sleep(2000);
	driver.close();
	Thread.sleep(2000);
	driver.quit();
	}

}
