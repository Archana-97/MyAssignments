package week2.day1;

public class Browser {
	
	
	public String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;

	}
	public String loadUrl(String Url) {
		System.out.println("Application url loaded successfully /" + Url);
		return Url;
	}

	public static void main(String[] args) {
		
		Browser browserObject = new Browser();
		browserObject.launchBrowser("Test");
		browserObject.loadUrl("https://platform.testleaf.com/#/");


	}

}
