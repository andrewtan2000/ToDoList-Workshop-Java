package sg.edu.nus.iss.epat.tdd.workshop;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class ToDoListTest extends TestCase {
   // Define Test Fixtures
	private ToDoList todolist;
	private Task task;
	
   public ToDoListTest() {
      super();
   }

   @Before
   public void setUp() throws Exception {
      // Initialise Test Fixtures
	   todolist = new ToDoList();
	   task = new Task("Desc 1");

   }

   @After
   public void tearDown() throws Exception {
      // Uninitialised test Fixtures
   }

   @Test
   public void testAddTask() {
	   todolist.addTask(task);
	      assertTrue(todolist.getAllTasks().contains(task));
   }

   @Test
   public void testGetStatus() {
      fail("Not implemented yet");
   }

   @Test
   public void testRemoveTask() {
      fail("Not implemented yet");
   }

   @Test
   public void testGetCompletedTasks() {
      fail("Not implemented yet");
   }
}
