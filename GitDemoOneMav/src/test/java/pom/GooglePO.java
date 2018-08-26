package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class GooglePO extends BasePage {

	public GooglePO(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@title='Search']")
	private WebElement searchBx;
	public WebElement searchBx()
	{
		return searchBx;
	}
	
	@FindBy(xpath="//input[@value='Google Search']")
	private WebElement searchBtn;
	public WebElement searchBtn()
	{
		return searchBtn;
	}

	
	public void search(String src)
	{
		searchBx.sendKeys(src);
		searchBx.sendKeys(Keys.ENTER);	
		
	}
}
