package com.bridgelabz.selenieumscenarios.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author Shaik Shaiksha vali
 *
 */

public class Dashboard {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rahi/Downloads/chromedriver_win32 (1)/chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		
		driver.get("localhost:4200/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("iamshaiksha2019@gmail.com");
		 driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Shaiksha@123");
		 driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/div[3]/button[1]/span")).click();
		 try{
				Thread.sleep(5000);
			}catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			 driver.findElement(By.xpath(("/html/body/app-root/app-dashboard/div/div[1]/mat-toolbar/mat-toolbar-row/button/span/mat-icon"))).click();
			 try{
				Thread.sleep(5000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/mat-sidenav-container/mat-sidenav/div/div[1]/button[1]/span/span")).click();
			/**
			 * Dashboard onArchevied getting all archeivedNotes testing
			 */
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/mat-sidenav-container/mat-sidenav/div/div[3]/button[1]/span/span")).click();
			/**
			 * Dashboard on trash getting all trashNotes testing
			 */
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.id("trash")).click();

	}

}
