package PagesRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseRunner.BaseClass;

public class AmazonHome extends BaseClass {

	public AmazonHome() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement SearchBox;
	
	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement SearchClick;

	public WebElement getSearchBox() {
		return SearchBox;
	}

	public void setSearchclick() {
		SearchBox.click();
	}

	public WebElement getSearchClick() {
		return SearchClick;
	}

	public void setSearchBox(String data) {
		SearchBox.sendKeys(data);
	}
	
	
	
}
