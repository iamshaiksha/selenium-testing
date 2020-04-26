package com.bridgelabz.selenieumscenarios.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
	WebDriver driver;
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/Users/rahi/Downloads/chromedriver_win32 (1)/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("localhost:4200/login");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.equalsIgnoreCase("Fundoonotes"))
		{
			System.out.println("title :"+title);
			driver.get("localhost:4200/login");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("iamshaiksha2019@gmail.com");
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Shaiksha@123");
			driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/div[3]/button[1]/span")).click();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		}
		else
		{
			System.out.println(" plzz check your url");
		}

		
	}

}
