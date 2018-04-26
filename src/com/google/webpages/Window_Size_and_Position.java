package com.google.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Size_and_Position 
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
	//driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.SECONDS);
	Dimension d=new Dimension(450,550);
	driver.manage().window().setSize(d);
	Thread.sleep(2000);
	Point p=new Point(235,567);
	driver.manage().window().setPosition(p);
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Dimension k=new Dimension(0,0);
	driver.manage().window().setSize(k);
	Thread.sleep(2000);
	Point n=new Point(0,0);
	driver.manage().window().setPosition(n);
	Thread.sleep(2000);
	driver.close();
	}

}
