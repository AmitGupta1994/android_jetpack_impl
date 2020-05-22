About Android JetPack

Jetpack is broken up into four main areas: 
Architecture, 
Foundation,
Behavior and 
UI.

Jetpack: Architecture
The Architecture area of Jetpack includes eight(8) different libraries and tools that help you architect your app and manage the data used by and displayed in the app.
Most of these are existing libraries. However, there are three(3) new libraries: 
    Navigation, 
    Paging, and 
    WorkManager
    
Navigation
Navigating between activities and/or fragments has never been easy.
Using Navigation, you visually connect one screen to another using “destinations”.
The great thing about this is that you can define animations in the visual editor.
The library even handles deep linking into your app. 

It consists of three(3) parts:
Navigation Graph: It is an XML resource, which has all the information related to navigation in one centralized location. It comprises all the individual content areas within your app known as destinations.

NavHost: An empty container, showing destinations from the navigation graph. This component contains a default NavHost implementation and NavHostFragement that shows fragment destinations.

NavController: A single object which manages app navigation within a NavHost.


Benefits of Android Navigation Component
It handles fragment transactions easily with its available API.
It allows users to check the flow of the application through a navigation graph.
It provides standardized resources for animations and transitions.
It implements and handles deep linking.
It handles up and back actions correctly by default.

Adding Dependency
implementation "androidx.navigation:navigation-ui-ktx:$nav_version"

