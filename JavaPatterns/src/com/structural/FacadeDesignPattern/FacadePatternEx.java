package com.structural.FacadeDesignPattern;

import java.sql.Driver;

public class FacadePatternEx {

	public static void main(String args[]) {
		String test = "CheckElementPresent";
		WebExplorerHelperFacade.generateReports("firefox", "html", test);
		WebExplorerHelperFacade.generateReports("firefox", "junit", test);
		WebExplorerHelperFacade.generateReports("chrome", "html", test);
		WebExplorerHelperFacade.generateReports("chrome", "junit", test);
	}
}
class WebExplorerHelperFacade{
	public static void generateReports(String explorer, String report, String test) {
		Driver driver = null;
		switch(explorer) {
		
		case "firefox" :
			driver = Firefox.getFirefoxDriver();
			switch(report) {
				case "html" : Firefox.generateHTMLReport(test, driver);
					break;
				case "junit" : Firefox.generateJunitReport(test, driver);
					break;
			}
			break;
		case "chrome" :
			driver = Chrome.getChromeDriver();
			switch(report) {
				case "html" : Firefox.generateHTMLReport(test, driver);
					break;
				case "junit" : Firefox.generateJunitReport(test, driver);
					break;
			}
			break;
		}
	}
}
class Firefox{
	public static Driver getFirefoxDriver() {return null;}
	public static void generateHTMLReport(String test, Driver driver) { 
		System.out.println("Generating HTML report for Firefox Driver");
	}
	public static void generateJunitReport(String test, Driver driver) {
		System.out.println("Generating Junit report for Firefox Driver");
	}
}
class Chrome{
	public static Driver getChromeDriver() {return null;}
	public static void generateHTMLReport(String test, Driver driver) { 
		System.out.println("Generating HTML report for Chrome Driver");
	}
	public static void generateJunitReport(String test, Driver driver) {
		System.out.println("Generating Junit report for Chrome Driver");
	}
}


