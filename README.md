# 🏦 BankManager

Application Java démontrant le concept d'**héritage** en Programmation Orientée Objet (POO).

## 📋 Description

**BankManager** est une application de gestion bancaire simple qui illustre l'héritage en Java. Une classe parente `BankAccount` sert de base à trois classes filles spécialisées.

## 🏗️ Structure du Projet

```
BankManager/
├── src/
│   ├── BankAccount.java      # Classe parente (compte bancaire générique)
│   ├── CheckingAccount.java  # Compte courant (hérite de BankAccount)
│   ├── SavingsAccount.java   # Compte d'épargne (hérite de BankAccount)
│   ├── COD.java              # Certificat de dépôt (hérite de BankAccount)
│   └── Main.java             # Point d'entrée de l'application
└── README.md
```

## 📚 Hiérarchie des Classes

```
        ┌───────────────┐
        │  BankAccount  │  ← Classe parente
        │  - account    │
        │  - balance    │
        └───────┬───────┘
                │
    ┌───────────┼───────────┐
    │           │           │
    ▼           ▼           ▼
┌────────┐ ┌────────┐ ┌────────┐
│Checking│ │Savings │ │  COD   │
│Account │ │Account │ │        │
│- limit │ │        │ │        │
└────────┘ └────────┘ └────────┘
```

## ✨ Fonctionnalités

- **BankAccount** : Classe de base avec les attributs `account` (numéro de compte) et `balance` (solde)
- **CheckingAccount** : Compte courant avec une `limit` de découvert autorisé
- **SavingsAccount** : Compte d'épargne
- **COD** : Certificat de Dépôt
- **Main.java** : Crée des instances de chaque type et démontre l'accès aux attributs hérités

## 🚀 Compilation et Exécution

```bash
# Se placer dans le dossier src
cd src

# Compiler tous les fichiers Java
javac Main.java

# Exécuter l'application
java Main
```

## 📊 Exemple de Sortie

```
╔══════════════════════════════════════════╗
║        BIENVENUE DANS BANKMANAGER       ║
╚══════════════════════════════════════════╝

✓ Compte courant créé avec succès !
✓ Compte épargne créé avec succès !
✓ Certificat de dépôt créé avec succès !

═══════════ RÉCAPITULATIF DES COMPTES ═══════════

  Compte: CC-001 | Solde: 1500,00 € | Type: Compte Courant | Limite de découvert: 500,00 €
  ...
```

## 🧪 Concepts POO Démontrés

- **Héritage** : Les classes filles héritent des attributs et méthodes de `BankAccount`
- **Encapsulation** : Attributs privés/protégés avec getters et setters
- **Polymorphisme** : Surcharge (`@Override`) de la méthode `displayInfo()`
- **Réutilisation** : Utilisation de `super()` pour appeler le constructeur parent

## 👨‍💻 Auteur

Projet réalisé dans le cadre de l'UE Projet Informatique 2.

## 📄 Licence

Ce projet est fourni à titre éducatif.
