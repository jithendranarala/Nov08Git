package com.git.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gitLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        //Creating a driver object referencing WebDriver interface
        WebDriver driver;
        
        //Setting the webdriver.chrome.driver property to its executable's location
        System.setProperty("webdriver.chrome.driver", "C:\\Apr13_2019\\Resources\\chromedriver.exe");
	
        //Instantiating driver object
        driver = new ChromeDriver();
        
        //Using get() method to open a webpage
        driver.get("https://artoftesting.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        
        //Closing the browser
        driver.quit();
 
    }


}
