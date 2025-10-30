package com.mystore.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.mystore.testcases.BaseClass.driver;

public class SearchResultPage {

	WebDriver ldriver;

	//2. Create constructor
	public SearchResultPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);//driver that will be used to lookup the web element

	}

	//Identify the elements present in search result page



	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
	WebElement searchResultProduct ;
	
	@FindBy(linkText="More")
	WebElement more;
	@FindBy(css="ul.product_list.grid.row li.ajax_block_product")
	WebElement first_product;
	
	//action methods on web elements of search result page
	
	public String getSearchResultProductName()
	{
		return(searchResultProduct.getText());
	}
	
	public void ClickOnMoreLink()
	{
		more.click();
	}
	public void mouseHoverResult()
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(first_product).perform();
	}
}
