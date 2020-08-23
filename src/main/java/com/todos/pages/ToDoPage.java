package com.todos.pages;

import java.io.IOException;

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

/* @FindBy */

	@FindBy(how = How.XPATH, using = INPUT_TEXT)
	public static WebElement inputText;
	
	/* add method */
	
	public void sendToDo(String todo) {
		
		writeText(inputText, todo);
	}
}
