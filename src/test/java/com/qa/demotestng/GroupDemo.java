package com.qa.demotestng;
public class GroupDemo {
	WebDriver driver;
    // Saving the expected title of the Webpage
    String title = "ToolsQA - Demo Website For Automation";
    
   
    @Test
    public void starting_point(){
    	System.out.println("This is the starting point of the test");
    	//Initialize Chrome Driver
    	//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");

    	 driver = new ChromeDriver();
    	 driver.get("https://demoqa.com/");
    }
    
    
    @Test(groups = { "demo" })	
    public void checkTitle() {	
       String testTitle = "Free QA Automation Tools For Everyone";
       String originalTitle = driver.getTitle();
      Assert.assertEquals(originalTitle, testTitle);
    }	
    
    @Test(groups = { "demo" })	
    public void click_element() {	
       driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).click();
        System.out.println("Home Page heading is displayed");	
    }
