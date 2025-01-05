## Java Design Pattern

 Design Patterns is a set of solutions to common problems we encounter in software design and development. They were first introduced in the book Design Patterns: Elements of Reusable Object-Oriented Software, published in 1994. The book was written by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides, who are collectively known as Gang of Four.

 There are 3 categories for design patterns.
 1. Creational
 2. Behavioral
 3. Structural

### Creational Design Pattern

Creational Design Patterns focus on the process of object creation in software development. These patterns make sure that we create things in a way that’s not only easy but also flexible, so we can change them later if we need too. They hide the complicated details of how we put pieces together.

1. Singleton:

#### Intent
Ensures that a class has only one instance and provides a global point of access to it.

---

#### Key Features
- Restricts instantiation of a class to one object.
- Provides a global point of access to the instance.
- Controls concurrent access in multi-threaded environments.

---
#### Implementation in Java

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

## 1. Chain of Responsibility:
 
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
   
    
## Command Design Pattern:
The command Design Pattern is a behavioral design pattern that encapsulates a request as an object thereby allowing you to parameterize clients with queues, requests, and operations. This pattern is
particularly useful in scenarios where you need to decouple the sender and receiver of a request.

**Key Concepts:**
* Command Interface: Declares the execute() method
* Concrete Command: Implements the command interface and defines the binding between the 
  receiver and an action.
* Receiver: The object that performs the actual work.
* Invoker: Sends the command to execute
* Client: Creates the command and associates it with the invoker.

#### Real-World Application
1. **Restaurant Systems:** To manage food orders.
2. **Home Automation:** Turning devices on/off with remote controls (e.g., lights, AC).
3. **Banking Systems:** Managing customer transactions like withdrawals and deposits.
4. **Game Development:** Implementing undo/redo operations for player actions

### Example: Restaurant Ordering System

#### Scenario
- **Waiter**: Acts as the **Invoker**, receiving orders and passing them to the kitchen.
- **Order**: Each command (e.g., "Make Pizza," "Make Pasta").
- **Kitchen**: The **Receiver**, which executes the commands.
- **Customer**: The client who specifies the orders.

---

### Implementation in Java

#### 1. Command Interface
Defines the structure for commands.
```java
public interface Order {
    void execute();
}
```
#### 2. Receiver
```java
class Kitchen {
    public void makePizza() {
        System.out.println("Making a Pizza!");
    }

    public void makePasta() {
        System.out.println("Making Pasta!");
    }
}
```
#### 3. Command concrete class
```java
class PizzaOrder implements Order {
    private Kitchen kitchen;

    public PizzaOrder(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.makePizza();
    }
}

class PastaOrder implements Order {
    private Kitchen kitchen;

    public PastaOrder(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    @Override
    public void execute() {
        kitchen.makePasta();
    }
}
```
#### 4. Invoker
```java
class Waiter {
    private Order order;

    public void takeOrder(Order order) {
        this.order = order;
    }

    public void placeOrder() {
        if (order != null) {
            order.execute();
        }
    }
}
```
### 5. Demo Class

```java
public class Restaurant {
    public static void main(String[] args) {
        // Receiver: Kitchen
        Kitchen kitchen = new Kitchen();

        // Commands
        Order pizzaOrder = new PizzaOrder(kitchen);
        Order pastaOrder = new PastaOrder(kitchen);

        // Invoker: Waiter
        Waiter waiter = new Waiter();

        // Customer orders pizza
        waiter.takeOrder(pizzaOrder);
        waiter.placeOrder();

        // Customer orders pasta
        waiter.takeOrder(pastaOrder);
        waiter.placeOrder();
    }
}
```
## Iterator Design Pattern
It is the behaviour design pattern that provide access to it's elements of collection sequentially without exposing the underlying representation. This pattern is used to iterate over the collections like array, list and custom data structures.

**Key Components**
1. **Iterator Interface:** Defines methods like hasNext() and next() for traversing the elements
2. **Concrete Iterator:** Implements the iterator interface for a specific collection.
3. **Aggregate Interface:** Defines a method to create an iterator Object.
4. **Concrete Aggregate:** Implements the aggregate interface and provides an implementation to return an iterator for its collection.

## Mediator Design Pattern

The Mediator Pattern is a behavioral design pattern that promotes loose coupling between components (colleagues) by introducing a mediator object. Instead of components communicating directly with each other, they interact with the mediator, which manages the communication. This pattern simplifies the dependencies between objects, making the system more maintainable and scalable.

### Key Concepts

**Mediator:**
- The central object that facilitates communication between other objects.
- Encapsulates how a set of objects interact.

**Colleagues:**

- The objects that communicate indirectly through the mediator.
- Do not interact directly with one another.

## Memento Design Pattern
This is a behavior design pattern that provides the ability to restore the state of an object to previous state. It is particulary useful when an object state needs to be saved and restored without violating encapsulation.

### Key Components

1. Originator
- The object whose state is being saved and restored.
- Create a Memento object to capture it's current state.
- Uses the Memento to restore them.

2. Momento
- Store the state of Originator
- Provides no methods for modifying the state to ensure encapsulation
- Can be two types: narrow (accessed only by caretaker) and wide (accessed by Originator)

3. CareTaker
- Manages the Memento Objects
- Requests the Originator to save its state and later use the memento to restore it's state.
- Doesn't modify or inspect the content of Memento

### Structure
1. The **Originator** generates and consumes **Memento** Objects
2. The **Caretaker** request **Memento** from the Originator and store it for the later use.
3. The **Caretaker** passes the **Memento** back to the **Originator** to restore the state.

### Applications of Memento Pattern in Java
1. Undo/Redo functionality (e.g., text editors).
2. Checkpoint systems (e.g., games or transactional systems).
3. State restoration for error recovery in applications.

## Observer Design Pattern
This is a behavioral design pattern that establishes the one-to-many dependency between objects. When one object (subject) changes its state, it will notify to all dependent objects and update automatically.

### Key Concepts

1. **Subject**
 > Maintain a list of observer
 >  provides methods to attach, detach and notify observers.

2. **Observer**
 > An interface or abstract class that defines the method for updating the observers state based on the change in the subject.

### Implementation in Java

1. Observer
``` java
  // Observer interface
public interface Observer {
    void update(String message);
}
```
2. Concrete Class

``` java
// Concrete Observer
public class EmailNotifier implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Email Notifier received message: " + message);
    }
}

// Another Concrete Observer
public class SMSNotifier implements Observer {
    @Override
    public void update(String message) {
        System.out.println("SMS Notifier received message: " + message);
    }
}
```

3. Subject class

```java
// Subject interface
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

```

4. Demo Class:

```java
 public class Demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        // Create observers
        Observer emailObserver = new EmailNotifier();
        Observer smsObserver = new SMSNotifier();

        // Attach observers to subject
        subject.attach(emailObserver);
        subject.attach(smsObserver);

        // Notify observers
        subject.notifyObservers("An important event has occurred!");

        // Detach one observer
        subject.detach(smsObserver);

        // Notify observers again
        subject.notifyObservers("Another event has occurred!");
    }
}

```
## Strategy Design Pattern
It is a behavioral design pattern that allows to define a family of algorithms or behaviors, put each of them in a separate class, and make them interchangable in runtime.
This pattern is useful when you want to dynamically change the behavior of class without modifying its class.

### Components
1. **Strategy Interface**:
  - Defines a common interface for all concrete strategies.

``` java
    interface DiscountStrategy {
       double applyDiscount(double price);
     }
```
   
2. **Concrete Strategy**:
 - Implement the Strategy interface with specific algorithm logic.

 Concrete Strategy 1: No Discount
  ``` java
     class NoDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price; // No discount applied
    }
}
  ```
Concrete Strategy 2: Regular Customer Discount
 ``` java
   class RegularCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.9; // 10% discount
    }
}
```
Concrete Strategy 3: VIP Customer Discount

``` java
 class VIPCustomerDiscount implements DiscountStrategy {
    @Override
    public double applyDiscount(double price) {
        return price * 0.8; // 20% discount
    }
}

```

3. **Context Class**:
 - Maintains a reference to a Strategy object and delegates behavior to it.

``` java
class ShoppingCart {
    private DiscountStrategy discountStrategy;

    // Constructor
    public ShoppingCart(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    // Set a new strategy
    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    // Calculate final price
    public double calculatePrice(double price) {
        return discountStrategy.applyDiscount(price);
    }
}

```

4. **Demo Class**:
``` java
public class StrategyPatternExample {
    public static void main(String[] args) {
        double price = 100.0;

        // Using No Discount
        ShoppingCart cart = new ShoppingCart(new NoDiscount());
        System.out.println("Price with No Discount: $" + cart.calculatePrice(price));

        // Using Regular Customer Discount
        cart.setDiscountStrategy(new RegularCustomerDiscount());
        System.out.println("Price with Regular Customer Discount: $" + cart.calculatePrice(price));

        // Using VIP Customer Discount
        cart.setDiscountStrategy(new VIPCustomerDiscount());
        System.out.println("Price with VIP Customer Discount: $" + cart.calculatePrice(price));
    }
}

```

## Template Design Pattern

This is a behavioral design pattern that defines the skeletion of an algorithms in super class but lets subclasses override specific steps of an algorithm without 
changing its structure. This promotes code reuse and enforces a standard way of executing steps.

### Components

1. **Abstract Class**
   - Defines the template method (the skeleton of an algorithm) and provide default implementations for some steps.
   - Declars abstract methods for steps that subclass should implement.
  
  ``` java
     // Abstract Class (Template)
abstract class DataProcessor {
    // Template method (final to prevent overriding)
    public final void processData() {
        loadData();
        process();
        saveData();
    }

    // Common steps
    private void loadData() {
        System.out.println("Loading data...");
    }

    private void saveData() {
        System.out.println("Saving processed data...");
    }

    // Abstract method for processing data
    protected abstract void process();
}

```
     
2. **Concrete Classes**
   - Implement the abstract methods and provide specific behavior for those steps.

``` java
// Concrete Class: CSV Data Processor
class CSVDataProcessor extends DataProcessor {
    @Override
    protected void process() {
        System.out.println("Processing CSV data");
    }
}

// Concrete Class: JSON Data Processor
class JSONDataProcessor extends DataProcessor {
    @Override
    protected void process() {
        System.out.println("Processing JSON data");
    }
}
```

3. Client Code
   
``` java
 // Client Code
public class TemplatePatternExample2 {
    public static void main(String[] args) {
        System.out.println("Processing CSV File:");
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.processData();

        System.out.println("\nProcessing JSON File:");
        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.processData();
    }
}
```

## Visitor Design Pattern

The Visitor Design Pattern is a behavioral design pattern which allows additional functionality to objects without modifying them.  It is commonly used when you have a structure of objects, such as a tree or a composite object, and you want to perform various unrelated operations on these objects without changing their structure or classes

### Components
1. **Visitor:** An interface or abstract class that declares the methods for visiting each type of concrete element.
```java
   interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
   }
```
2. **Concrete Visitor:** A class implementing the visitor interface containing the logic of the operations peformed on elements.
```java
class AreaCalculator implements Visitor {
    @Override
    public void visit(Circle circle) {
        double area = Math.PI * Math.pow(circle.getRadius(), 2);
        System.out.println("Circle Area: " + area);
    }

    @Override
    public void visit(Rectangle rectangle) {
        double area = rectangle.getWidth() * rectangle.getHeight();
        System.out.println("Rectangle Area: " + area);
    }
}

```   
3. **Element:** An interface or abstract class that declares an accept method, which takes visitor as an argument.
```java
   interface Shape {
    void accept(Visitor visitor);
   }
```
4. **Concrete Element:** The concrete classes are the implementation class of Element. They represents the objects in the structure.
```java
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

```   
5. **Object Structure:** A collection of elements that can be iterated and visited by the visitor.
```java
import java.util.ArrayList;
import java.util.List;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        // List of shapes
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(4, 6));

        // Create a visitor
        Visitor areaCalculator = new AreaCalculator();

        // Apply the visitor to each shape
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }
    }
}

```

## State Design Pattern

The State Design Pattern is the hehavioral design pattern that allows an object to alter its behavior when its internal state changes. The object appears to change its class by delegating state-specific behavior
to different state objects.

### Key Features:
1. Encapsulation of States:
- state specific behavior is encapsulated in a separate classes.
  
2. Dynamic Behavior
- The object behavior changes dynamically as it transition between two states.
  
3. Open/Closed Principle
- Adding new state doesn't require modifying the existing states or the context.

### Components

1. State Interface:
- Define the behavior that each state must implement.

2. Concrete Classes:
- Implement the behavior specific to a particular state.

3. Context
- Maintains a reference to the current state and allows state transitions.

  # Structural Design Pattern
  Structural design pattern is the design pattern that focus on the composition of classes or object. They help to simplify the design by structuring the relationship between components in a way that makes the system more flexible and scalable.
  
  ## Adapter Design Pattern

  The Adapter design pattern is a structural design pattern that allows you to adapt one interface to another, making classes with incompatible interfaces work
  together. This pattern is used when you want to use the an existing class but its interface doesn't compatible with the one you need.

  ### Components
  1. Target: This is the interface that client expects.
  ```java
  interface Charger {
    void chargeWithUSBTypeC();
  }
  ```
  2. Adapter: This class implements the target interface and works as a bridge between the client and adaptee.
  ```java
  class ChargerAdapter implements Charger {
    private OldCharger oldCharger;

    public ChargerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithUSBTypeC() {
        // Adapting the old charger to use with USB-C
        oldCharger.chargeWithMicroUSB();
    }
  }
  ```
  3. Adaptee: This is the class with the exisiting interface, which is incompatible with the clients desired interface.
  ```java
  class OldCharger {
    public void chargeWithMicroUSB() {
        System.out.println("Charging with Micro USB.");
    }
  }
  ```
  4. Client: The class that uses the adapter to interact with Adaptee.
   ```java
    public class Client {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();
        Charger charger = new ChargerAdapter(oldCharger); // Adapter is used here

        // The client uses the adapter to charge with USB-C
        charger.chargeWithUSBTypeC();
    }
  }
   
  ```  
