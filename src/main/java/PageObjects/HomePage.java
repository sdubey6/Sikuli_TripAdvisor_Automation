package PageObjects;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sikuli.script.Pattern;

public class HomePage {

	
	private static WebElement element = null;
	
	
	
	public static Pattern Flights_Btn(WebDriver driver){
		
		Pattern Flights_Btn = new Pattern("C:\\Users\\neelk\\workspace\\TripAdvisor_Automation\\Screenshots\\Flights_Btn.JPG");
		
	
		
		return Flights_Btn;
	}
	
	
	
	public static Pattern Persons_Btn(WebDriver driver){
		
		Pattern Persons_Btn = new Pattern("C:\\Users\\neelk\\workspace\\TripAdvisor_Automation\\Screenshots\\Persons_Btn.JPG");
		
		
		return Persons_Btn;
	}
	
	public static Pattern FindFlights_Btn(WebDriver driver){
		
		Pattern FindFlights_Btn = new Pattern("C:\\Users\\neelk\\workspace\\TripAdvisor_Automation\\Screenshots\\FindFlights_Btn.JPG");
		
		
		return FindFlights_Btn;
	}
	
	
	public static Pattern Class_Btn(WebDriver driver){
		
		Pattern Class_Btn = new Pattern("C:\\Users\\neelk\\workspace\\TripAdvisor_Automation\\Screenshots\\Class_Btn.JPG");
		
		return Class_Btn;
	}
	
	public static Pattern BusinessClass_Btn(WebDriver driver){
		
		Pattern BusinessClass_Btn = new Pattern("C:\\Users\\neelk\\workspace\\TripAdvisor_Automation\\Screenshots\\BusinessClass_Btn.JPG");
		
		return BusinessClass_Btn;
	}
	
public static Pattern AirCanada(WebDriver driver){
		
		Pattern AirCanada = new Pattern("C:\\Users\\neelk\\workspace\\TripAdvisor_Automation\\Screenshots\\AirCanada.JPG");
		
		return AirCanada;
	}

}
