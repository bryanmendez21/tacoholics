# 🌮 Tacoholics — Point of Sale System

A custom taco shop ordering application built with object-oriented design principles. Tacoholics allows customers to fully customize their taco orders and gives staff a streamlined way to manage the entire order process — replacing the old paper-based system with a fast, scalable solution.

---

## About the Project

At Tacoholics, every order is personal. Customers build their tacos exactly how they want them — shell, protein, toppings, and all. This POS system was built to match that flexibility.
---

## Features

- Fully customizable taco orders
- In-store order management (replacing paper orders)
- Cash and card payment processing
- Automatic receipt generation
- Menu management for easy item updates

---

## Tech Stack

- **Language:** Java
- **Paradigm:** Object-Oriented Programming (OOP)
- **Architecture:** Class-based design with interfaces and abstract classes

---

## OOP Concepts Used

| Concept | Where Applied |
|---|---|
| Encapsulation | All classes use private fields with public methods |
| Inheritance | `CashPayment` and `CardPayment` extend abstract `Payment` class |
| Abstraction |  |
| Polymorphism |  |

---

## Project Structure

```
tacoholics/
├── com.pluralsight/
│   ├── ui/
│   │   ├── AddBurrito.java
│   │   ├── AddChipsAndSalsa.java
│   │   ├── AddDrink.java
│   │   ├── AddOns.java
│   │   ├── AddTaco.java
│   │   ├── Checkout.java
│   │   ├── HomeScreen.java
│   │   ├── OrderScreen.java
│   │   ├── Payment.java
│   │   └── Screen.java
│   ├── models/
│   │   ├── Taco.java
│   │   ├── Burrito.java
│   │   ├── ChipsAndSalsa.java
│   │   ├── Drink.java
│   │   ├── Ingredients.java
│   │   ├── MenuItem.java
│   │   ├── SignatureTacoPlate.java
│   │   ├── SingleTaco.java
│   │   ├── Taco.java
│   │   └── Taco.java
│   │ 
│   └── util/
│       ├── AnsiCode.java
│       └──  ReceiptWriter.java
│       
├── Main.java
│  
└── README.md
```

---

## Class Diagram



---

## Getting Started

1. Clone the repository
```bash
   git clone https://github.com/bryanmendez21/tacoholics.git
   cd tacoholics
```

2. Build the project with Maven
```bash
   mvn compile
```
3. Run tests
```bash
   mvn test
```


---

## Future Plans

- Signature tacos menu
- Customer payment processing


