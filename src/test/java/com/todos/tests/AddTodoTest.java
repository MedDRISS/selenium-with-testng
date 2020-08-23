package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.ToDoPage;
import com.todos.utils.Setup;

public class AddTodoTest extends Setup {
	
	public AddTodoTest() throws IOException {
		super();
		
	}
	
	ToDoPage todoPage;
	
	@Test()
	public void iCanAddTodo() throws IOException {
		todoPage = new ToDoPage();
		boolean elementText=todoPage.isElementDisplayed(ToDoPage.inputText);
		Assert.assertTrue(elementText);
		todoPage.submitTodo(prop.getProperty("todo1"));
		String elementTodo=todoPage.checkElementContain(ToDoPage.element1);
		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo1")));
		boolean checkbox=todoPage.isCheckboxSelected(ToDoPage.chechkbox);
		Assert.assertTrue(checkbox);
	}
	

}
