package com.google.webpages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpenbyUserChoice
{
	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the BRowser name: ");
		String browser=sc.nextLine();
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("ff"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(2000);
			driver.close();
		}
		else
			if(browser.equalsIgnoreCase("gc"))
			{
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.google.com");
				Thread.sleep(2000);
				driver.close();
			}
	}

}
