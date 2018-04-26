package com.google.webpages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath_locator 
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
		driver.manage().timeouts().pageLoadTimeout(2,TimeUnit.MINUTES);
		driver.manage().deleteAllCookies();
		//driver.manage().window().fullscreen();
		driver.get("https://www.google.co.in");
		WebElement menu=driver.findElement(By.xpath("//a[@class='gb_b gb_hc']"));
		menu.click();
		Thread.sleep(2000);
		WebElement more=driver.findElement(By.xpath("//a[@class='gb_ja gb_0f']"));
		more.click();
		Thread.sleep(2000);
		WebElement book=driver.findElement(By.xpath("//a[@id='gb10']"));
		book.click();
		WebElement search=driver.findElement(By.xpath("//input[@id='oc-search-input']"));
		search.sendKeys("Immortals of Meluha");
		Thread.sleep(2000);
		WebElement click=driver.findElement(By.xpath("//input[@type='submit']"));
		click.click();
		WebElement sbook=driver.findElement(By.xpath("//a[.='The Immortals of Meluha: The Shiva Trilogy']"));
		sbook.click();
		
	}

}
