# MobileTesting
AutomationTest
Step 1 - Check if Node.js is installed and setup         
         node -v         npm -v
Step 2 - If not, download & install Node.js                
https://nodejs.org/en/download/ 


Step 3 - Check if appium is available on the system         
appium --version or appium -v


Step 4 - Install Appium via NPM                                  
npm install -g appium@latest
Installing Appium 2.0 only installs the Appium server, but not the drivers since all drivers have been isolated from the Appium server app
We will Install the Appium UiAutomator2 Driver for Android and Appium XCUITest Driver for iOS separately


Step 5 - Verify appium is available on the system                
appium -v         which appium        where appium        


Step 6 - Run command appium to get information on our installed appium  (CTRL + C to quit)


Step 7 - Install appium-doctor (optional)                        
npm install -g appium-doctor
Appium Doctor is a handy tool from Appium team that serves as a pre-flight check for Appium test environment
Attempts to diagnose and fix common Node, iOS and Android configuration issues         appium-doctor -h


Step 8 - Check and install required appium drivers as per the our testing needs

**Run command to see available drivers  **              

appium driver list        (works on appium 2.0 or later)

appium plugin list


Install Appium driver                        

Android:        appium driver install uiautomator2


Check:        appium driver list

Update:        appium driver list --updates



Step 9 : Run appium server :appium --allow-cors

      Press Ctrl+C to stop appium server


     ** Check missing dependencies on our system**
Step 1 : Run command                appium-doctor --android

Step 1 : Check Java JDK is present         java -version        javac -version

Install appium android drivers

Step 1 : Run command to see available drivers                appium driver list         (works on appium 2.0 or later)

Step 2 : Install Appium driver for Android                        appium driver install uiautomator2

Step 3 : To check for updates in existing drivers        appium driver list --updates

Step 4 : To update existing drivers                                appium driver update uiautomator2


