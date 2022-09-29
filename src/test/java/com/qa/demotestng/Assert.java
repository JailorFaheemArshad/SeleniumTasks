package com.qa.demotestng;

public class Assert {
	
WebDriver driver;
	
	@Test (priority = 0)
	public void CloseBrowser() {
		//WebDriver.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver= new ChromeD river();
		driver.close();
		Reporter.log("Driver Closed After Testing");
	}
	
	@Test (priority = -1)
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

	//	WebDriver.chromedriver().setup();
		driver= new ChromeDriver();
		Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
	        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
	        
	        driver.get("https://www.demoqa.com");
	        
	        Reporter.log("The website used was DemoQA for this test", true);
	        String expectedTitle = "Free QA Automation Tools For Everyone";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, expectedTitle);
  }
}