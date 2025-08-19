
# OOP Interview Questions

---

## 🔹 **Basic Level**

**Q1. What are the 4 pillars of OOP?**
👉 Encapsulation, Inheritance, Polymorphism, and Abstraction.

**Q2. Difference between class and object?**

* **Class**: Blueprint/template.
* **Object**: Instance of a class created at runtime.

**Q3. What is Encapsulation? Give an example.**
👉 Wrapping variables + methods inside a class, and restricting access using `private` + getters/setters.
Example: `private balance` in `BankAccount`.

**Q4. Difference between Overloading and Overriding?**

* **Overloading**: Same method name, different parameters (compile-time).
* **Overriding**: Subclass redefines parent method with same signature (runtime).

**Q5. Can we achieve multiple inheritance in Java?**
👉 Not with classes (to avoid ambiguity), but **yes with interfaces**.

---

## 🔹 **Intermediate Level**

**Q6. What is Polymorphism?**
👉 Ability of an object to take many forms.

* Compile-time → method overloading.
* Runtime → method overriding.

**Q7. What is the difference between `abstract class` and `interface`?**

* Abstract class: Can have both abstract + concrete methods, supports inheritance.
* Interface: Pure abstraction (Java 8+ allows default/static methods), supports multiple inheritance.

**Q8. Can a constructor be overridden?**
👉 No. Constructors are not inherited, so they cannot be overridden.

**Q9. Why do we use `super` keyword?**
👉 To call parent class constructor or parent method.

**Q10. What is `this` keyword?**
👉 Refers to the current object instance of the class.

---

## 🔹 **Advanced Level**

**Q11. Difference between Composition and Inheritance?**

* Inheritance → “is-a” relationship (Dog **is-an** Animal).
* Composition → “has-a” relationship (Car **has-an** Engine).
  👉 Prefer **Composition** to avoid tight coupling.

**Q12. Can we override a static method?**
👉 No. Static methods belong to the class, not the object.
You can **hide** them, but not truly override.

**Q13. Difference between `final`, `finally`, and `finalize()`?**

* `final`: Keyword (class can’t be extended, method can’t be overridden, variable constant).
* `finally`: Block used in exception handling.
* `finalize()`: Method called by GC before object destruction (deprecated in Java 9).

**Q14. Can a class be both abstract and final?**
👉 No. Abstract = must be extended. Final = cannot be extended. Contradiction.

**Q15. What is method hiding?**
👉 If a subclass defines a static method with the same name/signature as the parent, the parent method is hidden (not overridden).

---

## 🔹 **Best Practices**

👉 **Q\&A + Code Snippet + Analogy + Best Practice**

**Q16. What are the best practices in OOP?**
👉 Encapsulation, Inheritance, Polymorphism, and Abstraction.

---

## 🔹 Java OOP Interview Q\&A (with code + analogy + best practices)

---

### **Q1. What is Encapsulation?**

**Answer:**
Encapsulation is wrapping data (fields) and methods into a single unit (class) and restricting direct access to fields.

**Code Snippet:**

```java
class BankAccount {
    private double balance; // private field

    public void deposit(double amount) { balance += amount; }
    public double getBalance() { return balance; }
}
```

**Analogy:**
Like a **capsule** in medicine – it hides the internal ingredients but provides a safe interface.

**Best Practice:**
Always keep fields `private` and expose them using getters/setters → improves security.

---

### **Q2. What is Inheritance?**

**Answer:**
Inheritance allows a class to acquire properties and behaviors of another class.

**Code Snippet:**

```java
class Animal {
    void eat() { System.out.println("Animal eats"); }
}
class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}
```

**Analogy:**
A **child inherits traits** from parents.

**Best Practice:**
Use inheritance for **“is-a” relationships**. For “has-a”, use **composition** instead.

---

### **Q3. What is Polymorphism?**

**Answer:**
Polymorphism means “many forms” – same method name but different behavior.

**Code Snippet:**

```java
// Overloading (compile-time)
class MathUtils {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

// Overriding (runtime)
class Animal {
    void sound() { System.out.println("Some sound"); }
}
class Cat extends Animal {
    @Override void sound() { System.out.println("Meow"); }
}
```

**Analogy:**
A **person** is a student at school, employee at office, and customer at a shop → same person, different roles.

**Best Practice:**
Use polymorphism to make code **flexible & reusable**.

---

### **Q4. What is Abstraction?**

**Answer:**
Abstraction hides implementation details and shows only essential features.

**Code Snippet:**

```java
abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle {
    void start() { System.out.println("Car starts with key"); }
}
```

**Analogy:**
When you **drive a car**, you only use the steering, pedals, and gear – you don’t care about the engine’s inner details.

**Best Practice:**

* Use **abstract classes** when you need partial implementation.
* Use **interfaces** when you need multiple inheritance or contracts.

---

### **Q5. Difference: Composition vs Inheritance?**

**Answer:**

* **Inheritance**: “is-a” relationship.
* **Composition**: “has-a” relationship.

**Code Snippet:**

```java
// Inheritance
class Dog extends Animal { }

// Composition
class Car {
    Engine engine; // Car HAS-A Engine
}
```

**Analogy:**

* Inheritance: Dog **is-an** Animal.
* Composition: Car **has-an** Engine.

**Best Practice:**
👉 **Prefer composition over inheritance** to reduce tight coupling.



