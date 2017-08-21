package ie.sw.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserinvocation {

	public static void main(String[] args) {
		
		//selenium 3.5
		//gecko driver has a abality to invoke the browser 
		System.setProperty("webdriver.gecko.driver","C:/Users/sarab singh/Desktop/myCourses/SeleniumTesting/seleniumDriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//how can i give a browser a address to navigate to certain page
		//get method is used to hit the url
		driver.get("http://www.qaclickacademy.com");
		
		//how can i get the title of the page which is on top of the page
		System.out.println(driver.getTitle());
		
		//how can i get the page source as well rather going and doing the right click and all that 
		System.out.println(driver.getPageSource());
		
		
		//how can i get the url where my browser is ..
		//foreg : - i put http://www.qaclickacedemy.com
		System.out.println(driver.getCurrentUrl());

		//i am done my all the test now i want to close my browser
		driver.close();
		
	}

}
