package com.structural.FacadeDesignPattern;

import java.sql.Driver;

public class PracticeFacade {

	public static void main(String[] args) {
		FacadeHelperClass.generateReports("IEExplorer", "HTML");
		FacadeHelperClass.generateReports("IEExplorer", "JUNIT");
		FacadeHelperClass.generateReports("Chrome", "HTML");
		FacadeHelperClass.generateReports("Chrome", "JUNIT");

	}

}
class FacadeHelperClass{
	public static void generateReports(String explorer,String report) {
		Driver driver = null;
		switch(explorer) {
		case "IEExplorer" : {
			driver = IEExplorer.getIEDriver();
			switch(report) {
			case "HTML" :
				IEExplorer.generateHTMLReport();break;
			case "JUNIT" : {
				IEExplorer.generateJunitReport();break;
			}
			}break;
		}
		case "Chrome" : {
			driver = ChromeExporer.getChromeDriver();
			switch(report) {
			case "HTML" :
				IEExplorer.generateHTMLReport();break;
			case "JUNIT" : {
				IEExplorer.generateJunitReport();break;
			}
			}break;
		}
		}
	}
}
class IEExplorer{
	public static Driver getIEDriver() {
		return null;
	}
	public static void generateHTMLReport() {
		System.out.println("Generating HTML report for InternetExplorer");
	}
	public static void generateJunitReport() {
		System.out.println("Generating Junit report for InternetExplorer");
	}
}

class ChromeExporer{
	public static Driver getChromeDriver() {
		return null;
	}
	public static void generateHTMLReport() {
		System.out.println("Generating HTML report for ChromeExplorer");
	}
	public static void generateJunitReport() {
		System.out.println("Generating Junit report for ChromeExplorer");
	}
}