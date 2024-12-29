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

