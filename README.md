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
- Learned: always declare variables before the if block if you need them in the summary
- Learned: commit before big changes — it's a save point
- Milestone: terminal v2 complete — refactored, object oriented, handles bad input