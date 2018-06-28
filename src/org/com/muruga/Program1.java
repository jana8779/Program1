package org.com.muruga;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jana\\eclipse-workspace\\GreensTechnology\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement txtFirstName = driver.findElement(By.id("email"));
		txtFirstName.sendKeys("jana");
		WebElement txtLastName = driver.findElement(By.id("pass"));
		txtLastName.sendKeys("sampath");
		WebElement btnlogin = driver.findElement(By.id("u_0_2"));
		btnlogin.click();
}
}

