
# Day 10 – Offer Calculator 💡 (Java If-Else, Conditions Practice)

This Java program simulates a real-world **offer calculator system** where users enter their details and receive custom discounts or greetings based on **age**, **gender**, and **shopping amount**.

---

## 📘 Concepts Covered

- `if`, `else if`, `else` for condition handling
- `equalsIgnoreCase()` for safe string comparison
- `printf("%.2f")` for formatted currency output
- User input via `Scanner` class
- Decision-making logic for real-time use

---

## 🧑‍💻 Program Features

| Condition                  | Output Behavior                                      |
|----------------------------|-------------------------------------------------------|
| Age ≥ 60                   | Senior citizen offer message                          |
| Amount > ₹1000             | 10% discount shown with correct formatting            |
| Gender = F/f               | Greet Ma’am and apply 5% bonus gift 🎁                |
| Gender = M/m               | Greet Sir – no bonus gift                             |
| Invalid Gender             | "Invalid gender entered." message shown               |

---

## 🧪 Sample Output

### ✅ Positive Test Case:
```
Enter userName: Arthi
Enter userAge: 70
Enter userGender(M/F): F
Enter userShopping Amount: ₹1500

Hello Arthi!
Senior Citizen Offer Applied.
You get a 10% discount on ₹1500.00 = ₹150.00
Welcome Ma'am! 🎀
Also, you get a 5% bonus gift! 🎁
```

### ❌ Negative Test Case:
```
Enter userName: Megha
Enter userAge: 25
Enter userGender(M/F): M
Enter userShopping Amount: ₹800

Hello Megha!
No senior citizen offer.
No discount applied on ₹800.00
Welcome Sir! Enjoy your shopping. 🛍️
```

---

## 🚀 How to Run

1. Save as `Day10_OfferCalculator.java`
2. Compile and run:
```bash
javac Day10_OfferCalculator.java
java Day10_OfferCalculator
```

---

## ✨ Author

**Arthi Gurumoorthi** – Exploring Java decision logic & real-world conditions as part of SDET career journey.
