## Bridge Design Pattern

- Structural Design Pattern
- Decouples an abstraction from its implementation
- Allowing the two to vary independently
- Useful when abstraction and implementation may change frequently

### components:
* **Abstraction:** Contains a reference to an instance of the implementer.
* **Refined Abstraction:** Extends the interface defined by Abstraction.
* **Implementer:** Declares the interface for the concreteImplementer.
* **Concrete Implementer:** Implements the implementer interface and defines the concrete implementation.