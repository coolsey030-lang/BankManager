/**
 * Classe représentant un compte d'épargne.
 * Hérite de la classe BankAccount.
 * 
 * @author BankManager App
 * @version 1.0
 */
public class SavingsAccount extends BankAccount {

    /**
     * Constructeur de la classe SavingsAccount.
     * 
     * @param account Le numéro du compte d'épargne
     * @param balance Le solde initial
     */
    public SavingsAccount(String account, double balance) {
        // Appel au constructeur de la classe parente BankAccount
        super(account, balance);
    }

    /**
     * Affiche les informations du compte d'épargne.
     * 
     * @return Une chaîne formatée avec les détails du compte d'épargne
     */
    @Override
    public String displayInfo() {
        return super.displayInfo() + " | Type: Compte Épargne";
    }
}
