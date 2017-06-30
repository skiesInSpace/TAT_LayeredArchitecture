package by.epam.barkou.tests;


import org.testng.annotations.Test;

import by.epam.barkou.controller.Controller;

import org.testng.annotations.DataProvider;

public class NewTest {


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "add_book&Alice in Wonderland", "Here will be response" },
    };
  }
  
  @Test(dataProvider = "dp")
  public void ControllerTest(String request, String response) {
	  Controller controller = new Controller();
	  controller.executeTask(request);
	  
  }
}