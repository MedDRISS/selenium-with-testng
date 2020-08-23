package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;



public class ToDoPage extends BasePage {

	public ToDoPage() throws IOException {
	PageFactory.initElements(driver,this);
	}
	
	/* Locators */

	final static String INPUT_TEXT = "//input[@ng-model= 'newTodo']";
	final static String ELEMENT_1 = "/html/body/ng-view/section/section/ul/li[1]/div/label";
	final static String CHECKBOX = "//input[@type= 'checkbox']";
	

/* @FindBy */

	@FindBy(how = How.XPATH, using = INPUT_TEXT)
	public static WebElement inputText;
	@FindBy(how = How.XPATH, using = ELEMENT_1)
	public static WebElement element1;
	@FindBy(how = How.XPATH, using = CHECKBOX)
	public static WebElement chechkbox;
	
	/* add method */
	
	public void submitTodo(String todo) {
		
		writeText(inputText, todo);
		inputText.sendKeys(Keys.ENTER);
		
	}
	
	public Boolean isElementDisplayed(WebElement element) {
		
		Boolean isElementDisplayed=element.isDisplayed();
		return isElementDisplayed;
	}
	
	public String checkElementContain(WebElement element) {
		
		String elementTodo=element.getText();
		return elementTodo;
	}
	
	public Boolean isCheckboxSelected(WebElement element) {
		
		Boolean isCheckboxSelected=element.isSelected();
		return isCheckboxSelected;
	}
	
}
