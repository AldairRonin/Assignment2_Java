A.Project Overview
The Vehicle Management System is java program demonstrating object-oriented programming principles such as inheritance, abstraction, encapsulation.
The system includes different types of vehicles ((Car), (Motorcycle), (Truck()) and a (Driver)) class. Each vehicle can be assigned a driver, and the program simulates starting and stopping engines, displaying vehicle and driver information.


B.Class Hierarchy

Vehicle (abstract class) //parentclass
   Fields: (brand), (year),(driver)
   Abstract Methods: (startEngine()), (stopEngine())
   Concrete Methods: (displayInfo()), (displayDriverInfo())

 Car (extends Vehicle) //childclass
   Additional Fields: (doors), (fuelType)
   Overrides (startEngine()) and (stopEngine())
   Overrides (displayInfo()) to include doors and fuel type

Motorcycle (extends Vehicle) //childclass
   Additional Field: (hasSidecar)
   Overrides (startEngine()) and (stopEngine())
   Overrides (displayInfo()) to include sidecar information

Truck (extends Vehicle) //childclass
   Additional Fields: (capacity), (numAxles)
   Overrides (startEngine()) and (stopEngine())
   Overrides (displayInfo()) to include capacity and number of axles

Driver
   Fields: (name), (licenseNumber)
   Method: (displayDriverInfo())

Relationships
 Each (Vehicle) object has a (Drive) object 
 One (Driver) can be assigned to multiple (Vehicle) objects



C.Instructions to Compile and Run
javac *.java
java Main

D.Screenshots
![image alt](https://github.com/AldairRonin/Assignment2_Java/blob/main/docs/%D0%A1%D0%BD%D0%B8%D0%BC%D0%BE%D0%BA%20%D1%8D%D0%BA%D1%80%D0%B0%D0%BD%D0%B0%202025-12-28%20163345.png?raw=true)

E.Reflection
This project demonstrates the advantages of inheritance by allowing subclasses (Car, Motorcycle, Truck) to share common functionality from the Vehicle class.
Method overriding was used to customize behaviors of startEngine() and stopEngine() for each vehicle type.

Using protected and private access modifiers helped practice encapsulation and safe handling of object fields. One challenge was deciding when to use protected versus private to balance subclass access and data protection.

Overall, this assignment helped me understand how abstract classes, composition, aggregation work together in a real Java application.