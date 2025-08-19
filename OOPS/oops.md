Perfect ✅ Let’s do a **Java OOP Refresher (30 mins)**. I’ll give you **short explanations + examples** for each concept so you can code along quickly.

---

## 1️⃣ Classes & Objects

* **Class** → Blueprint (like a template).
* **Object** → Instance of a class (real thing).

```java
class Car {
    String brand;
    int year;

    // constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void drive() {
        System.out.println(brand + " is driving...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 2024); // object
        car1.drive(); // Tesla is driving...
    }
}
```

✅ Key point: **Objects store state (fields) + behavior (methods).**

---

## 2️⃣ Inheritance

* **One class can inherit properties of another** using `extends`.
* Helps in **code reuse**.

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();  // inherited method
        d.bark(); // Dog barks!
    }
}
```

✅ Key point: Dog **inherits** `eat()` from `Animal`.

---

## 3️⃣ Polymorphism

* **Poly** = many, **morph** = forms.
* Methods behave differently based on context.
* Two types:

  * **Compile-time (Overloading)** → Same method name, different params.
  * **Runtime (Overriding)** → Child class redefines parent method.

```java
// Compile-time polymorphism (method overloading)
class MathUtils {
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

// Runtime polymorphism (method overriding)
class Animal {
    void sound() { System.out.println("Some sound"); }
}
class Cat extends Animal {
    @Override
    void sound() { System.out.println("Meow"); }
}

public class Main {
    public static void main(String[] args) {
        MathUtils m = new MathUtils();
        System.out.println(m.add(2, 3));        // 5
        System.out.println(m.add(2.5, 3.5));    // 6.0

        Animal a = new Cat(); // parent reference → child object
        a.sound(); // Meow (runtime polymorphism)
    }
}
```

✅ Key point: Same method name → different behaviors.

---

## 4️⃣ Encapsulation

* Wrapping data (fields) + methods inside a class.
* Fields are usually `private` → accessed using **getters & setters**.

```java
class BankAccount {
    private double balance; // private field

    // getter
    public double getBalance() {
        return balance;
    }

    // setter
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(1000);
        System.out.println("Balance: " + acc.getBalance()); // 1000.0
    }
}
```

✅ Key point: Protects data → no direct access, only through controlled methods.

---

### ⚡ Recap

* **Classes/Objects** → Blueprint + instances.
* **Inheritance** → Code reuse (`extends`).
* **Polymorphism** → Many forms (overloading & overriding).
* **Encapsulation** → Protect data with private fields + getters/setters.

---

