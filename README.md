# UStoEU

<h3>Cooperation</h3>
Each of us had contributed 3 design patterns to the program, one from each category, thereby making
the contribution exactly equal.

<h3>Repository Link</h3>
<a>https://github.com/georgyHZ/UStoEU</a>

<h3>Code Explanation</h3>

<h4>Centimetre to Inch converter - Singleton</h4>

The Government class is a Singleton, ensuring that only one instance of the class exists 
throughout the application. It provides a single source of truth for converting between 
centimeters and inches using a fixed conversion factor (cmToInchRatio), which is set to
0.3937 and initialized only once. By making the constructor private, the class prevents direct 
instantiation, and the static getInstance() method manages the single instance, creating it only 
if it doesn’t already exist.

<h4>Car Driveability Checker - Adapter</h4>

This implementation of the Adapter design pattern allows an AmericanCar, which provides its 
top speed in miles per hour, to be used in a system that operates in kilometers per hour.
The Speed interface defines a method getSpeedInKm() for retrieving speed in kilometers. 
The SpeedAdapter class implements this interface and bridges the gap by converting the speed 
from miles (provided by an AmericanCar instance) to kilometers using a conversion factor of 1.6. 
This makes the AmericanCar compatible with the Speedometer class, which checks whether a speed is
below a maximum allowed value defined in kilometers. The Adapter pattern enables seamless 
integration of incompatible units, ensuring flexibility and reusability.

<h4>USD Printer - Template</h4>

This implementation demonstrates the Template Method design pattern, where the Banknote abstract 
class defines a template for initializing and printing banknote attributes. The initialize() 
method, which is final and cannot be overridden, ensures a specific sequence of steps for 
setting attributes like name, color, dimensions, monetary value, and country. Subclasses, 
such as USD, implement the abstract methods (setName, setColour, setWidth, setHeight, setValue, 
and setCountry) to provide specific details for their respective banknotes. This pattern enforces 
a consistent structure for creating and managing banknote objects while allowing subclasses to 
define their unique details, promoting code reusability and maintainability.



