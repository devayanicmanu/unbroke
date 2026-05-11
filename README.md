# Unbroke 💸
A personal finance tracker built for students in Germany, because being broke and not knowing where the money went.. sucks.

## About
Built by Devayani — a 22 year old international student in Germany who got tired of not knowing where her money goes. This app is dedicated to  every student who has ever checked their bank account and immediately regretted it.

## Features (in progress)
- Salary input
- Fixed expenses tracker
- Grocery limit
- Shared savings
- Emergency fund calculator
- "Before you buy" calculator
- Broke date calculator

## Tech Stack
- Java (terminal version)
- HTML/CSS/JavaScript + Java backend (web version coming)

## Dev Log

### Day 1 - April 25 2026
- Set up project and Git
- Built salary input with Scanner
- Learned: Java project structure, basic Git workflow

### Day 2 - April 26 2026
- Added fixed expenses loop with ArrayList and do-while
- Hit InputMismatchException for the first time
- Learned: nextDouble() leaves a newline in the buffer, always flush with nextLine()

### Day 3 - April 27 2026
- Fixed Scanner buffer bug in the expenses loop
- Built full monthly summary — prints all expenses, savings, and remaining balance
- Learned: scanner.next() vs scanner.nextLine() and why consistency matters
- Learned: if and else must be directly connected, nothing in between
- Learned: variables declared inside an if block are not accessible outside it (scope)

### Day 4 - April 28 2026
- Added grocery limit, savings goals, reminders and emergency fund
- Added username personalisation — summary now greets you by name
- Refactored entire app into methods — collectExpenses, collectSavings, collectReminders
- Created first OOP classes — Expense.java and Savings.java
- Replaced two ArrayLists per feature with one ArrayList of objects
- Added exception handling with try-catch — app no longer crashes on bad input
- Learned the DRY principle — wrote one reusable getValidDouble() method instead of repeating try-catch everywhere
- Learned: static vs non-static, constructors, getters, private variables
- Learned: commit before big changes — it's a save point
- Milestone: terminal v2 complete — refactored, object oriented, handles bad input

### Day 5 - April 27 2026
- Added broke date calculator
- Built getValidYesNo() method with fuzzy matching — accepts "yep", "yeah", "y" etc
- Added exception handling for all yes/no inputs across the app
- Learned: .startsWith() vs .equals() for flexible input matching
- Learned: .toLowerCase() and .trim() for cleaner user input handling

### Day 6 - April 28 2026
- Built "before you buy" calculator
- Shows percentage of remaining budget, days worth of spending, and balance after purchase
- Learned: printf formatting with %.1f and %.2f for clean decimal output

### Day 7 - May 11 2026
- Back after a two week break
- Picking up where I left off — web version starts now