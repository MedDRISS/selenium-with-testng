package com.todos.tests;

import java.io.IOException;

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
		todoPage.sendToDo(prop.getProperty("todo1"));
	}

}
