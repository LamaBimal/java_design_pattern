## Java Design Pattern

 Design Patterns is a set of solutions to common problems we encounter in software design and development. They were first introduced in the book Design Patterns: Elements of Reusable Object-Oriented Software, published in 1994. The book was written by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides, who are collectively known as Gang of Four.

 There are 3 categories for design patterns.
 1. Creational
 2. Behavioral
 3. Structural

### Creational Design Pattern

Creational Design Patterns focus on the process of object creation in software development. These patterns make sure that we create things in a way that’s not only easy but also flexible, so we can change them later if we need too. They hide the complicated details of how we put pieces together.

1. Singleton :
    
2. Factory Design Pattern :

3. Prototype Design Pattern :

4. Builder Design Pattern :
   The Builder Pattern is a creational design pattern that separates the construction of complex objects 
   from their representation, offering a cleaner and more flexible approach to object creation.

5. Abstract Factory Pattern:
   Abstract Factory design pattern is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.
   It is useful when a  system needs to be independent of how its objects are created, composed, and represented.

   Key Components
   - Abstract Factory: Declares methods for creating abstract products.
   - Concrete Factory: Implements the creation methods defined in the abstract factory.
   - Abstract Product: Declares an interface for a type of product object.
   - Concrete Product: Implements the interface defined by the abstract product.
   - Client: Uses only the interfaces defined by the abstract factory and abstract product.

   

