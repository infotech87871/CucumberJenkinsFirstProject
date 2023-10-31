package org.stepdefinitionclass;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class Tsk01JavaString {

	public String name,name1;
	@Given("To Declare the String Manually and Print")
	public void toDeclareTheStringManuallyAndPrint() {
		
	   name = "  Computer Science Engineering degree  ";
	   name1 = "Civil Selenium Concepts";
	   System.out.println(name);
	}

	@Given("To print the Length of the String")
	public void toPrintTheLengthOfTheString() {
	    int length = name.length();
	    System.out.println(length);
	}

	@Given("To print the Char At particular index")
	public void toPrintTheCharAtParticularIndex() {
		char charAt = name.charAt(4);
	    System.out.println(charAt);
	    char charAt2 = name.charAt(9);
	    System.out.println(charAt2);
	    System.out.println(name.charAt(18));
	}
	
	@When("To Print Results Using All Methods")
	public void toPrintResultsUsingAllMethods() {
	    System.out.println(name.isEmpty());
	    //Assert.assertTrue(false);

	    String age1 = "JaVa";
	    String age2 = "java";
	    System.out.println(age1.equals(age2));
	    System.out.println(age1.equalsIgnoreCase(age2));
	    String upperCase = name.toUpperCase();
	    System.out.println(upperCase);
	    System.out.println(name.toLowerCase());
	    name.split("e");
	    System.out.println();
	    System.out.println(name.trim());
	    System.out.println(name.replaceAll("Science", "Technology"));
	    System.out.println(name.replace('e', 'a'));
	    System.out.println(name.compareTo("String"));
	    System.out.println(name.contains("science"));
	    System.out.println(name.startsWith("  Computer"));
	    System.out.println(name.endsWith("Engineering"));
	    
	    
	    
	    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
