package com.bridgelabz.selenieumscenarios.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Note {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/Users/rahi/Downloads/chromedriver_win32 (1)/chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();		
		driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("iamshaiksha2019@gmail.com");
		driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("Shaiksha@123");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div/mat-card/div[3]/button[1]/span")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@id='noteclick ']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//textarea[@id='title']")).click();
		driver.findElement(By.xpath("//textarea[@id='title']")).sendKeys("cucumber testcase passed");
		driver.findElement(By.xpath("//textarea[@id='description']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys("selenieum testcase passed");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("tapnote")).click();

		/**
		 * Setting color to note
		 */

		//			driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/mat-sidenav-container/mat-sidenav-content/app-note/app-note-com/div/div[10]/div/span/mat-card/form/address/div[2]/app-icon/div[1]/button[3]/span/mat-icon")).click();
		//			Thread.sleep(5000);
		//			driver.findElement(By.id("//button[@id='colorsetting']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/**
		 * Archeving notes
		 */
		driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/mat-sidenav-container/mat-sidenav-content/app-note/app-note-com/div/div[8]/div/span/mat-card/form/address/div[2]/app-icon/div[1]/button[5]/span/mat-icon")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//		driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/mat-sidenav-container/mat-sidenav-content/app-note/app-note-com/div/div[10]/div/span/mat-card/form/address/div[2]/app-icon/div[1]/button[6]/span/mat-icon")).click();
		//		Thread.sleep(5000);
		//		driver.findElement(By.id("trashsend")).click();


	}

}
