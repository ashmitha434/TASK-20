package org.SeleniumWebComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GuviAutomation {
    public static void main(String[] args) {
        // Set the path of ChromeDriver
    	System.setProperty("Webdriver.gecko.driver","C:\\Users\\Dell\\Downloads\\geckodriver-v0.34.0-win64.exe");

        // Initialize FirefoxDriver
        WebDriver driver = new FirefoxDriver();
     
        // Maximize to browser window
        driver.manage().window().maximize();
        
        // Launch the website
        driver.get("https://www.guvi.in/");

        // Locate and click on the Signup button
        WebElement signupButton = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
        signupButton.click();

        // Fill in the signup form
        WebElement nameInput = driver.findElement(By.id("name"));
        nameInput.sendKeys("Test User");

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys("testuser@test.com");

        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("#123&785");
        
        WebElement mobilenumber = driver.findElement(By.id("mobileNumber"));
        mobilenumber.sendKeys("1234567890");

        // Click on the Signup button to submit the form
        WebElement signupForm = driver.findElement(By.tagName("form"));
        signupForm.submit();

        // Wait for the page to load and verify successful registration (You can add more verification steps if needed)
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Thank you")) {
            System.out.println("Registration successful!");
        } else {
            System.out.println("Registration failed!");
        }

        // Locate and click on the Login button
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
        loginButton.click();

        // Fill in the login form
        WebElement loginEmailInput = driver.findElement(By.id("email"));
        loginEmailInput.sendKeys("testuser@test.com");

        WebElement loginPasswordInput = driver.findElement(By.id("password"));
        loginPasswordInput.sendKeys("#123&785");

        // Click on the Login button to submit the form
        WebElement loginForm = driver.findElement(By.tagName("form"));
        loginForm.submit();

        // Wait for the page to load and verify successful login (You can add more verification steps if needed)
        pageTitle = driver.getTitle();
        if (pageTitle.contains("Dashboard")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }

        // Close the browser
        driver.quit();
    }
}


