## Decorator Design Pattern

- Structural Design Pattern allows behavior to be added to individual objects individually, without affecting the behavior of the other objects from the same class.
- Adhere the Single Responsibility Principle by allowing functionality to be divided between classes with unquie area of concern.

**Key Concepts**:
1. Component:
   - An interface or abstract class that defines the methods that will be implemented or extended by concrete components and decorators.
2. Concrete Component:
   - The base implementation of the component interface. This is the class that will have additional responsibilities added to it by decorators. 
3. Decorator:
   - An abstract class that implements the component interface and contains a reference to a component object. It can be used to define wrapper methods that enhance or override the behavior of the component.
     
4. Concrete Decorator:
   -  Extends the decorator class and adds additional functionality to the component.
