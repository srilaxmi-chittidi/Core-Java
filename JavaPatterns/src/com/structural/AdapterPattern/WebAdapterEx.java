package com.structural.AdapterPattern;

public class WebAdapterEx {
	public static void main(String[] args) {
		ChromeDriver c = new ChromeDriver();
		c.getElement();
		c.selectElement();
		IEDriver i = new IEDriver();
		WebDriverAdapter w = new WebDriverAdapter(i);
		w.getElement();
		w.selectElement();
	}
}
interface WebDriver{
	void getElement();
	void selectElement();
}
class ChromeDriver implements WebDriver{
	@Override
	public void getElement() {
		System.out.println("Chrome Driver getElement");
	}
	@Override
	public void selectElement() {
		System.out.println("Chrome Driver selectElement");
	}
}
class IEDriver {
	void findElement() {
		System.out.println("ieDriver find element through getElement");
	}
	void clickElement() {
		System.out.println("ieDriver click element through clickElement");
	}
}
class WebDriverAdapter implements WebDriver {

	public IEDriver ieDriver;
	public WebDriverAdapter(IEDriver ieDriver) {
		this.ieDriver = ieDriver;
	}
	
	@Override
	public void getElement() {
		ieDriver.findElement();
	}

	@Override
	public void selectElement() {
		ieDriver.clickElement();
	}
	
}