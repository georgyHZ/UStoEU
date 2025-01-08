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

<h4> Factory Method Pattern (Creational) </h4>


The Factory Method pattern provides an interface for creating objects in a superclass but allows
subclasses to alter the type of objects that will be created.
This pattern is used to convert weights (pounds to kilograms, ounces to grams) 
by creating specific UnitConverter objects through subclassing the WeightConverter.
Classes: WeightConverter, PoundsToKilogramsConverter, OuncesToGramsConverter, UnitConverter

<h4> Command Pattern (Behavioral) </h4>

The Command pattern encapsulates a request as an object, thereby allowing users to parameterize
clients with different requests, queue or log requests, and support undoable operations.
This pattern is used for executing different conversion commands, such as converting temperature
and distance, by encapsulating the conversion actions within command objects.
Classes: Command, TemperatureConversionCommand, DistanceConversionCommand, Converter, ConversionInvoker

<h4> Decorator Pattern (Structural) </h4> 

The Decorator pattern allows behavior to be added to an individual object, dynamically,
without affecting the behavior of other objects from the same class.
This pattern is used to add additional functionalities such as logging and validation
to the unit conversion process by decorating the BasicConverter.\
Classes: Converter, BasicConverter, ConverterDecorator, LoggingConverterDecorator, ValidationConverterDecorator

