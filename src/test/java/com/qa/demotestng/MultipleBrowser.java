package com.qa.demotestng;


public class MultipleBrowser {
	static{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		}
		WebDriver driver;
		@Test
		@Parameters({"browser"})
		public void loginFFandCHROME(String browser) throws InterruptedException, IOException{
		//Reporter.log(browser, true);
		if (browser.equals("firefox")) {
			
		driver = new FirefoxDriver();
		} else {
		driver = new ChromeDriver();
		}
		//FileInputStream configPath = new FileInputStream(".\\config.properties");
		//Properties prop = new Properties();
		//prop.load(configPath);
	//	String url = prop.getProperty("URL");
		driver.get("https://www.facebook.com/");

		WebElement un = driver.findElement(By.name("email"));
		for (int i = 0; i < 10; i++) {
		un.sendKeys("abc@gmail.com" + i);
		Thread.sleep(2000);
		un.clear();
		}
		driver.close();
		}
