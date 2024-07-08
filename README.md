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

Step 1 : Download command line tools from Android Studio downloads page
                                        https://developer.android.com/studio#command-tools


Step 5 : Create, Setup and Start Emulator (AVD - Android Virtual Device)

NOTE: The process is covered separately in the section -

How to create and start AVD (Emulator) without Android Studio GUI App


Note: On windows cmd you can use sdkmanager.bat on mac or linux sdkmanager in the commands

$ sdkmanager.bat --list

$ sdkmanager.bat "build-tools;33.0.0"  

$ sdkmanager.bat "platforms;android-33"

$ sdkmanager.bat "system-images;android-33;google_apis;x86_64"

$ sdkmanager.bat "sources;android-33"


Add path of folders platforms, platform-tools and emulator in Path env variable


Now use avdmanager available in cmdline-tools/bin (same place where sdkmanager is)

avdmanager

avdmanager list

avdmanager list avd

avdmanager create avd -n myavd1 -k “system-images;android-33;google_apis;x86_64”

Here

-n is the name of the AVD, we can give any name as you like, can also use --name

-k is the system image that we downloaded using sdkmanager above, can also use --package

(using this command - sdkmanager "system-images;android-33;google_apis;x86_64" )


Can also give the id in -d flag

avdmanager create avd -n myavd1 -d 17 -k “system-images;android-33;google_apis;x86_64”

The id for a specific device can be referred by running avdmanager list


After this create AVD using emulator (emulator executable file is present in emulator folder)

emulator -list-avds

emulator -avd myavd1

Can also start AVD with a specific resolution (size) using -skin option

emulator -avd myavd1 -skin 450x750

Step 1 - Download Android Studio https://developer.android.com/studio

Step 2 - Install on the system

Step 3 - Start Android Studio

Step 4 - Go to "Tools" -> "SDK Manager" (or click on the SDK Manager icon in the toolbar)

Step 5 - Select as per your testing needs

SDK Platforms: Select the desired Android API levels you want to target for your tests. You can choose multiple versions
SDK Tools: Choose the platform-tools, build-tools, emulators etc compatible with your targeted API level(s)
Step 6 - Click Apply and wait for setup to complete

Step 7 - Set the folder having platform-tools, build-tools as ANDROID_HOME and update Path env variable

Step 8 - Can run command appium-doctor --android to check all requirements for Android Testing are completed

How to create and start AVD (Emulator) without Android Studio
Step 1 : Install and setup JDK (JAVA_HOME). Check with commands  java --version      javac --version

Step 2 : Download and unzip command line tools from https://developer.android.com/studio#command-tools 

Step 3 : In the unzipped cmdline-tools directory, create a sub-directory called latest


Step 4 : Move the original cmdline-tools directory contents, including the lib directory, bin directory, NOTICE.txt file,

and source.properties file, into the newly created latest directory

You can now use the command-line tools from this location




Step 4 : Set path of the folder containing cmdline-tools in env variable ANDROID_HOME

        e.g. in this case it will be D:\android

Also add path until bin folder in the PATH env var
        For this you can add %ANDROID_HOME%\bin in the Path env variable







For Mac OS Users
Goto Terminal

Add path in .bash_profile (old macs)

Or .zshrc (new macs)

Starting with macOS Monterey (released in 2021), Apple did indeed switch the default shell from Bash to Zsh for new user accounts.        

Check what is our default Shell  echo $SHELL

For e.g. for command echo $SHELL you got response as /bin/zsh

that means your default shell is zsh (also called Z shell) and you will add env variables in file .zshrc


(Else your default shell will be bash and you will add all env variables in file .bash_profile. And if that is the case just replace .zshrc with .bash_profile in all below commands)


Now assuming the default shell is Zsh and we need to add env variables in .zshrc file

Open Terminal

Run command open .zshrc

In case the file does not already exist, create the file touch ~/.zshrc
This command creates the .zshrc file in your home directory (~ )


Now to edit .zshrc file we have 2 options

On terminal, run command open .zshrc
This should open the file in a text editor where you can edit and save it
Add the below mentioned env variables and save the file

If option 1 does not work, On terminal, run command cat .zshrc
This will show the contents of the file on the terminal itself
Now use vi editor to edit the file

Run command vi .zshrc this will open file in vi editor

Press i on keyboard to go into insert mode

Now add the env variables as shown below (make sure to update the paths as per your system)



export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home

export PATH=$PATH:$JAVA_HOME/bin

export ANDROID_HOME=/Users/raghavpal/Desktop/Projects/android

export PATH=$PATH:$ANDROID_HOME/bin


Now here you can also use $HOME in place of your home directory (e.g. /Users/raghavpal) so it will look like this:


export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home

export PATH=$PATH:$JAVA_HOME/bin

export ANDROID_HOME=$HOME/Desktop/Projects/android

export PATH=$PATH:$ANDROID_HOME/bin


Also notice to give path of bin folder instead of mentioning the complete path we can refer from env variable ANDROID_HOME that we have already set by using $ANDROID_HOME


After editing press escape key on the keyboard

Now write wq! and hit Enter. This will write and quit

To check the paths are set, open a new terminal and run commands

cat .zshrc

echo $ANDROID_HOME

echo $PATH



Step 5 : Open a new terminal or command prompt and run following commands:
        On windows cmd you can use sdkmanager.bat
        On mac or linux use sdkmanager in the commands

Also, you should be able to use the sdkmanager commands from any location on the cmd prompt as its path is already set in the Path env variable, but just in case it does not work, you can goto the folder of sdkmanager on the command prompt/terminal and then run these commands (sdkmanager is in cmdline-tools/bin folder)

$ sdkmanager.bat --list

Use sdkmanager to get required packages like platform-tools, platforms, build-tools

This can be done in a single command e.g.

$ sdkmanager.bat “platform-tools” "platforms;android-33" “build-tools;33.0.0”

// 33 is the API level of your android device os

 

Or can be done in separate commands, e.g.

$ sdkmanager.bat "build-tools;33.0.0"  

$ sdkmanager.bat "platforms;android-33"


Get the system image that you want to use for the AVD (Android Virtual Device)

$ sdkmanager.bat "system-images;android-33;google_apis;x86_64"

$ sdkmanager.bat "sources;android-33" (can skip this)



All these folders should automatically go in the ANDROID_HOME folder, else you can manually place them there

Add path of folders platforms, platform-Tools and emulator in Path env variable






Now use avdmanager available in cmdline-tools/bin (same place where sdkmanager is)

avdmanager

avdmanager list

avdmanager list avd

avdmanager create avd -n MyAVD1 -k “system-images;android-33;google_apis;x86_64”

Here

-n is the name of the AVD, we can give any name as you like, can also use --name

-k is the system image that we downloaded using sdkmanager above, can also use --package

(using this command - sdkmanager "system-images;android-33;google_apis;x86_64" )


Can also give the id in -d flag

avdmanager create avd -n MyAVD1 -d 17 -k “system-images;android-33;google_apis;x86_64”

The id for a specific device can be referred by running avdmanager list


After this create AVD using emulator (emulator executable file is present in emulator folder)

emulator -list-avds

emulator -avd MyAVD1

Can also start AVD with a specific resolution (size) using -skin option

emulator -avd MyAVD1 -skin 450x750
Step 1 - Start appium using command appium OR appium --allow-cors


Step 2 - Start Appium Inspector


