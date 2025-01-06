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

### Example:

**Implementer Interface**
```java
// Implementer interface
interface DrawAPI {
    void drawCircle(int radius, int x, int y);
}
```
**Concrete Implementer1**
```java
// Concrete Implementer 1
class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: red, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
```
**Concrete Implementer2**
```java
// Concrete Implementer 2
class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[color: green, radius: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}
```
**Abstraction**
``` java
// Abstraction
abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
```
**Refined Abstraction**
```Java
// Refined Abstraction
class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
```
**Client Code**
```Java
// Client code
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}

```
