A.Project Overview
The Vehicle Management System is aJava program demonstrating object-oriented programming principles such as inheritance, abstraction, encapsulation.
The system includes different types of vehicles (`Car`, `Motorcycle`, `Truck`) and a `Driver` class. Each vehicle can be assigned a driver, and the program simulates starting and stopping engines, displaying vehicle and driver information.


B.Class Hierarchy

Vehicle (abstract class)
   Fields: `brand`, `year`, `driver`
   Abstract Methods: `startEngine()`, `stopEngine()`
   Concrete Methods: `displayInfo()`, `displayDriverInfo()`

 Car (extends Vehicle)
   Additional Fields: `doors`, `fuelType`
   Overrides `startEngine()` and `stopEngine()`
   Overrides `displayInfo()` to include doors and fuel type

Motorcycle (extends Vehicle)
   Additional Field: `hasSidecar`
   Overrides `startEngine()` and `stopEngine()`
   Overrides `displayInfo()` to include sidecar information

Truck (extends Vehicle)
   Additional Fields: `capacity`, `numAxles`
   Overrides `startEngine()` and `stopEngine()`
   Overrides `displayInfo()` to include capacity and number of axles

Driver
   Fields: `name`, `licenseNumber`
   Method: `displayDriverInfo()`

Relationships
 Each `Vehicle` object has a `Driver` object 
 One `Driver` can be assigned to multiple `Vehicle` objects



C.Instructions to Compile and Run
javac *.java
java Main

D.Screenshots
