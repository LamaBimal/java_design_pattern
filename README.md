## Java Design Pattern

 Design Patterns is a set of solutions to common problems we encounter in software design and development. They were first introduced in the book Design Patterns: Elements of Reusable Object-Oriented Software, published in 1994. The book was written by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides, who are collectively known as Gang of Four.

 There are 3 categories for design patterns.
 1. Creational
 2. Behavioral
 3. Structural

### Creational Design Pattern

Creational Design Patterns focus on the process of object creation in software development. These patterns make sure that we create things in a way that’s not only easy but also flexible, so we can change them later if we need too. They hide the complicated details of how we put pieces together.

1. Singleton:

## Intent
Ensures that a class has only one instance and provides a global point of access to it.

---

## Key Features
- Restricts instantiation of a class to one object.
- Provides a global point of access to the instance.
- Controls concurrent access in multi-threaded environments.

---

## Implementation in Java

### Eager Initialization
```java
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
```

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


| **Pattern**         | **Key Features**                                       | **Examples**                                  |
|----------------------|-------------------------------------------------------|----------------------------------------------|
| Singleton            | Single instance, global access                        | Logger, Configuration Manager                |
| Factory Method       | Interface for creating objects, subclass decides type | Shape creation, Database connections         |
| Abstract Factory     | Families of related objects, no concrete classes      | GUI Toolkits, Cross-platform applications    |
| Builder              | Step-by-step object construction                      | Document generators, Configurations          |
| Prototype            | Object cloning                                        | Shape editing tools, Game object spawning    |

   
# Behavioral Design Patterns

Behavioral design patterns are concerned with communication between objects, focusing on how they interact and delegate responsibilities.

### 1. Chain of Responsibility:
 
 Pass a request along a chain of handlers until one of them processes it. It allows an object to send a request to
 other objects without knowing who is going to handle it.
 #### Components of Chain of Responsibility
* Handler Interface or Abstract class:

   > This is the base class that defines the interface for handling requests and, in many cases, for chaining to the next
   handler of the sequence.
* Concrete Handlers:
   > These are the classes that implement how the requests are going to handled. They can handle the request or pass it to the
   next handler in the chain if it is unable to handle that request.
* Client:
   > The request is first send by the client, who then forwards it to the chain's first handler, which hanlder will finally
   handle the request is unknown to the client.
   
    
### Command Design Pattern:
The command Design Pattern is a behavioral design pattern that encapsulates a request as an object thereby allowing you to parameterize clients with queues, requests, and operations. This pattern is
particularly useful in scenarios where you need to decouple the sender and receiver of a request.

**Key Concepts:**
* Command Interface: Declares the execute() method
* Concrete Command: Implements the command interface and defines the binding between the 
  receiver and an action.
* Receiver: The object that performs the actual work.
* Invoker: Sends the command to execute
* Client: Creates the command and associates it with the invoker.
  

