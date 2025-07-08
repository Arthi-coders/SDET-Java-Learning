
# BillingSystem – Java Mini Project (Tax + Discount + Multi-Item Support)

This Java program simulates a real-world **Billing System** for a retail store. It accepts user input for multiple items, calculates total, applies tax and discounts, and prints a formatted invoice using Java's core features.

---

## 📘 Concepts Covered
- `Scanner` class for user input
- `while` loop for adding multiple items
- `switch` case for item selection
- `printf()` formatting for professional invoice display
- Conditional logic for tax (5%) and discount (10%)

---

## 🧑‍💻 Program Features

| Feature              | Description                                                |
|----------------------|------------------------------------------------------------|
| Item Selection       | Choose items by number (e.g., 1 → Pen, 2 → Notebook)       |
| Quantity Input       | Enter quantity per item                                    |
| Multi-item Support   | Loop allows adding multiple items                          |
| Tax Logic            | Adds 5% tax if subtotal > ₹500                             |
| Discount Logic       | Applies 10% discount if subtotal > ₹1000                   |
| Final Bill           | Clean breakdown of subtotal, tax, discount, total          |

---

## 🧪 Sample Output

```
Welcome to Java Mart!
Enter customer name: Arthi

Available Items:
1. Pen - ₹10
2. Notebook - ₹50
3. Bag - ₹500
4. Bottle - ₹150

Enter item number: 2
Enter quantity: 3
Do you want to add another item? (yes/no): yes

Enter item number: 1
Enter quantity: 5
Do you want to add another item? (yes/no): no

========== INVOICE ==========
Customer: Arthi

Items:
Notebook x 3 = ₹150
Pen x 5 = ₹50

Subtotal: ₹200.00
Tax (5%): ₹10.00
Discount (10%): ₹0.00
Final Total: ₹210.00
==============================
```

---

## 🚀 How to Run

1. Save as `BillingSystem.java`
2. Compile and run:
```bash
javac BillingSystem.java
java BillingSystem
```

---

## ✨ Author
Arthi Gurumoorthi – Practicing real-world logic and formatting as part of SDET learning track.
