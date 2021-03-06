# Sample Application for NY Times.
This repository contains a detailed NY Times sample app that implements MVP architecture.

The app basically fetch certain news feeds and list them in a recycler view

Prerequisites
--------------

- Android Studio 3.1
- Android SDK v27
- Latest Android Build Tools
- Android Support Repository

# Technology used
* Clean MVP architecture
* [Retrofit]
* [Dagger2]
* [picasso]
* [gson]
* [Butter Knife]
* [Espresso]


#### The app has following packages:
1. **model**: It contains all the data accessing and manipulating components.
2. **di** It contains dependency injuction components.
3. **utils** It contains supported classes.
4. **network**: Retrofit classes .
5. **businessmodules** It contains Business logic implementation.
6. **components** It contains Application Components and base Components.
7. **coremodules** It contains Generalized MVP Architecture components.
8. **customviews** It contains custom supported views implementations.

#### Steps to run the app & Test:
- Download the project code, preferably using `git clone`.
- Open the Android SDK Manager (*Tools* Menu | *Android*) and make sure you have installed the *Android testing support library Repository* under *Extras*.
- In Android Studio, select *File* | *Open...* and point to the `./build.gradle` file.
- Check out the relevant code:
    * The application under test is located in `src/main/java`
    * Tests are in `src/androidTest/java`
- Create the test configuration with a custom runner: `android.support.test.runner.AndroidJUnitRunner`
    * Open *Run* menu | *Edit Configurations*
    * Add a new *Android Tests* configuration
    * Choose a module
    * Add a *Specific instrumentation runner*: `android.support.test.runner.AndroidJUnitRunner`
- Connect a device or start an emulator
    * Turn animations off.
    (On your device, under Settings->Developer options disable the following 3 settings: "Window animation scale", "Transition animation scale" and "Animator duration scale")
- Run the newly created configuration

The application will be started on the device/emulator and a series of actions will be performed automatically.



License
--------


    Copyright 2018 Developer.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
