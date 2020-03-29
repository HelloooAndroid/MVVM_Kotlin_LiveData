# MVVM with Kotlin and LiveData

## MVVM_Architecture
This repository explains the use of MVVM design pattern with DataBinding and Observable fields. It will also show the data flow diagram of  MVVM.

# MVVM - Model View Viewmodel
MVVM pattern supports two-way data binding between View and View-Model. The View-Model utilizes the observer pattern to inform changes in the View-Model to the Model.

Model-View-ViewModel (MVVM) is a structural design pattern that separates objects into three distinct groups:
### Models 
hold application data. They’re usually structs or simple classes.
### Views 
display visual elements and controls on the screen. They’re typically subclasses of UIView.
### View models 
transform model information into values that can be displayed on a view. They’re usually classes, so they can be passed around as references.

![MVVM design pattern](https://camo.githubusercontent.com/ed52bf7b4c8b0b18c988587c46ba3daaa86470a6/68747470733a2f2f707265766965772e6962622e636f2f6964444b6d652f332e706e67)

## What is LiveData?
 LiveData is an observable data holder class. Unlike a regular observable, LiveData is lifecycle-aware, meaning it respects the lifecycle of other app components, such as activities, fragments, or services. This awareness ensures LiveData only updates app component observers that are in an active lifecycle state.
 
## Type of LiveData
### MutableLiveData 
This is the most simplest LiveData, where it would just get updated and notify it’s observer.

### MediatorLiveData
Main interesting part of MediatorLiveData is the ability to add source to it, and the code that change the content of the data. This means we could have multiple LiveData feed to one destination through the MediatorLiveData.

## Advantages of using LiveDat  
1. <b>Ensures your UI matches your data state:</b> LiveData follows the observer pattern. LiveData notifies Observer objects when the lifecycle state changes. You can consolidate your code to update the UI in these Observer objects. Instead of updating the UI every time the app data changes, your observer can update the UI every time there’s a change.
2. <b>No memory leaks:</b> Observers are bound to Lifecycle objects and clean up after themselves when their associated lifecycle is destroyed.
3. <b>No crashes due to stopped activities:</b> If the observer’s lifecycle is inactive, such as in the case of an activity in the back stack, then it doesn’t receive any LiveData events.
4. <b>No more manual lifecycle handling:</b> UI components just observe relevant data and don’t stop or resume observation. LiveData automatically manages all of this since it’s aware of the relevant lifecycle status changes while observing.
5. <b>Always up to date data:</b> If a lifecycle becomes inactive, it receives the latest data upon becoming active again.
6. <b>Handle configuration changes:</b> If an activity or fragment is recreated due to a configuration change, like device rotation, it immediately receives the latest available data.
