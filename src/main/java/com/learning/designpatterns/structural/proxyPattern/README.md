## Proxy Design Pattern

- Structural Design Pattern
- Client and Actual Object are connected by the proxy client.
- client communicates with proxy, which manages access to the real object.
- Before sending the request to the real object, the proxy can take care of additional tasks like caching, security, logging, and lazy loading.

**Components**

1. **Subject:**
- Subject is an interface or an abstract class that defines the common interfaces shared by the RealSubject and Proxy classes.

2. **RealSubject:**
- Real subject is the actual object that the proxy represents.
3. **Proxy:**
- Proxy acts surrogate or placeholder for the Real Subject.