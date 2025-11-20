# SOLID Principles --- Simplified Analysis

## 1. Single Responsibility Principle (SRP)

**Respected.**\
Each class has one job: `Cours` holds data, `Decorator` adds features,
`Builder` constructs objects, `Gestionnaire` manages schedules,
observers receive updates.

## 2. Open/Closed Principle (OCP)

**Respected.**\
You extend features through new decorators or new observers without
modifying existing code.

## 3. Liskov Substitution Principle (LSP)

**Mostly respected, with one issue.**

Problem:\
`Cours` defines `getMatiere()` and `getEnseignant()` which are **not**
in `ICours`.\
If you store objects as `ICours`, you cannot call those methods without
downcasting.

Fix:\
- Add those methods to `ICours`, or\
- Remove them and keep everything inside `getDescription()`.

## 4. Interface Segregation Principle (ISP)

**Respected.**\
Interfaces are small and focused:\
`ICours` (2 methods), `Observer` (1 method), `Subject` (3 methods).

## 5. Dependency Inversion Principle (DIP)

**Partially respected.**

Good: - `Gestionnaire` depends on `Observer`/`Subject` interfaces. -
`Decorator` depends on `ICours`.

Issues: - `CoursBuilder` returns a concrete `Cours`. - `Gestionnaire`
uses `System.out.println()`.

Fix: - Make `build()` return `ICours`. - Use a logger instead of direct
printing.

## Summary

  Principle   Result   Notes
  ----------- -------- -----------------------------------------------
  SRP         ✔        Clear responsibilities
  OCP         ✔        Extensions via decorators/observers
  LSP         ⚠        Missing methods in `ICours` cause downcasting
  ISP         ✔        Interfaces are lean
  DIP         ⚠        Builder returns concrete type; direct output


