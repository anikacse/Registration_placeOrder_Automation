package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	private WebDriver driver;
	
	//1. By Locators:
	
	private By password = By.id("passwd");
	private By registerbutton = By.id("SubmitLogin");
	private By forgotPwdLink = By.linkText("Forgot your password?");
	private By userName = By.id("firstName" + "lastName");
	private By msg = By.id("msg");
	private By dob = By.id("dob");
	private By email = By.id("dynamicemail");
	private By status = By.id("status");
	private By companyName = By.id("companyname");
	
	//2. Constructor of the page class:
	public Login(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public String getLoginTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPwdLink).isDisplayed();
	}
	
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(registerbutton).click();
	}

	public void enterMsg(String msg) {
		driver.findElement(msg).sendKeys(msg);
		
	}

	public void enterUserName(String firstName, String lastName) {
		driver.findElement(userName).sendKeys(firstName,lastName);		
	}

	public void dob(String dob) {
		driver.findElement(dob).sendKeys(dob);
		
	}

	public void email(String dynamicemail) {
		driver.findElement(email).sendKeys(dynamicemail);
		
	}

	public void companyName(String companyname) {
		driver.findElement(companyName).sendKeys(companyname);		
	}

	public void status(String status) {
		driver.findElement(status).sendKeys(status);
		
	}
	
	

}
