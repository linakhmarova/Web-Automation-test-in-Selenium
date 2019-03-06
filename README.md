Web Automation test with Selenium
=======
This project is automation sanity test for BuyMe.co.il

**Website adress:** https://buyme.co.il/  
**Language:** Java  
**Platform:** Linux (ubuntu)  
**Browser:** Chrome  
**IDE:** IntelliJ idea  
**Third-Party usage:** Selenium web-driver, JUnit, ExtentReports  

# What is covered by this test:
1. Registration screen:  
open website --> press on SignUp --> enter credentials --> check-box confirmation --> Submit   
  
2. Home Screen:  
choose price, area, category in drop-boxes --> Search  
  
3. Choose gift screen:  
pick a business --> pick amount inside  
  
4. Send Gift details:  
enter sender & receiver name --> upload an image --> add blessing --> pick delivery options (radio buttons) --> Submit  


# How to run:  
1. Download all the files (jars, sources, xml file..) 
2. Open it with IntelliJ  
3. In Constants.java change REPORTER_PATH, PROPERTY_2, XML_FILE, IMAGE_PATH, MY_IMAGE on your relevant paths  
4. Run the project 
 
