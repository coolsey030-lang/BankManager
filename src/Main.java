/**
 * Classe principale de l'application BankManager.
 * 
 * Objectif : Démontrer l'héritage en Java en créant des instances
 * des classes CheckingAccount, SavingsAccount et COD, toutes héritant
 * de la classe parente BankAccount.
 * 
 * @author BankManager App
 * @version 1.0
 */
public class Main {

    /**
     * Point d'entrée de l'application BankManager.
     * 
     * @param args Les arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {

        System.out.println("+==========================================+");
        System.out.println("|        BIENVENUE DANS BANKMANAGER       |");
        System.out.println("+==========================================+\n");

        // ---------------------------------------------------------
        // 1. Création d'un compte courant (CheckingAccount)
        //    - Compte: "CC-001"
        //    - Solde initial: 1500.00 €
        //    - Limite de découvert: 500.00 €
        // ---------------------------------------------------------
        CheckingAccount checkingAccount = new CheckingAccount("CC-001", 1500.00, 500.00);
        System.out.println("[OK] Compte courant créé avec succès !");

        // ---------------------------------------------------------
        // 2. Création d'un compte d'épargne (SavingsAccount)
        //    - Compte: "CE-001"
        //    - Solde initial: 5000.00 €
        // ---------------------------------------------------------
        SavingsAccount savingsAccount = new SavingsAccount("CE-001", 5000.00);
        System.out.println("[OK] Compte épargne créé avec succès !");

        // ---------------------------------------------------------
        // 3. Création d'un certificat de dépôt (COD)
        //    - Compte: "COD-001"
        //    - Montant du dépôt: 10000.00 €
        // ---------------------------------------------------------
        COD cod = new COD("COD-001", 10000.00);
        System.out.println("[OK] Certificat de dépôt créé avec succès !\n");

        // ---------------------------------------------------------
        // Affichage des informations de tous les comptes
        // ---------------------------------------------------------
        System.out.println("========== RÉCAPITULATIF DES COMPTES ==========\n");

        // Affichage du compte courant
        System.out.println("  " + checkingAccount.displayInfo());
        System.out.println("  -> Accès aux attributs hérités :");
        System.out.println("    - Numéro de compte : " + checkingAccount.getAccount());
        System.out.println("    - Solde            : " + String.format("%.2f", checkingAccount.getBalance()) + " €");
        System.out.println("    - Limite découvert : " + String.format("%.2f", checkingAccount.getLimit()) + " €\n");

        // Affichage du compte d'épargne
        System.out.println("  " + savingsAccount.displayInfo());
        System.out.println("  -> Accès aux attributs hérités :");
        System.out.println("    - Numéro de compte : " + savingsAccount.getAccount());
        System.out.println("    - Solde            : " + String.format("%.2f", savingsAccount.getBalance()) + " €\n");

        // Affichage du certificat de dépôt
        System.out.println("  " + cod.displayInfo());
        System.out.println("  -> Accès aux attributs hérités :");
        System.out.println("    - Numéro de compte : " + cod.getAccount());
        System.out.println("    - Solde            : " + String.format("%.2f", cod.getBalance()) + " €\n");

        // ---------------------------------------------------------
        // Démonstration de la modification des attributs hérités
        // ---------------------------------------------------------
        System.out.println("========== MODIFICATION DES COMPTES ===========\n");

        // Modification du solde du compte courant via setBalance() (méthode héritée)
        checkingAccount.setBalance(2000.00);
        System.out.println("[OK] Solde du compte courant mis à jour : " + String.format("%.2f", checkingAccount.getBalance()) + " €");

        // Modification de la limite de découvert (propre à CheckingAccount)
        checkingAccount.setLimit(1000.00);
        System.out.println("[OK] Limite de découvert mise à jour    : " + String.format("%.2f", checkingAccount.getLimit()) + " €\n");

        // Affichage final des comptes après modifications
        System.out.println("========== ÉTAT FINAL DES COMPTES ============\n");
        System.out.println("  " + checkingAccount.displayInfo());
        System.out.println("  " + savingsAccount.displayInfo());
        System.out.println("  " + cod.displayInfo());

        System.out.println("\n+==========================================+");
        System.out.println("|     MERCI D'AVOIR UTILISÉ BANKMANAGER   |");
        System.out.println("+==========================================+");
    }
}
