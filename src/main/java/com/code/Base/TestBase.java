package com.code.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javafx.beans.WeakListener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	public static WeakListener eventListener;
	
	public TestBase(){
		
		try {
			prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/code/Config/Config");
			prop.load(ip);
		
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch (IOException e) {
		e.printStackTrace();
		}	
		
	}
public static void initialization(){
	
	
}	
}
