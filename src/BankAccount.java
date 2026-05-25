/**
 * Classe parente représentant un compte bancaire générique.
 * 
 * @author BankManager App
 * @version 1.0
 */
public class BankAccount {

    /** Numéro du compte bancaire */
    protected String account;
    
    /** Solde du compte bancaire */
    protected double balance;

    /**
     * Constructeur de la classe BankAccount.
     * 
     * @param account Le numéro du compte bancaire
     * @param balance Le solde initial du compte
     */
    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    /**
     * Retourne le numéro du compte bancaire.
     * 
     * @return Le numéro du compte
     */
    public String getAccount() {
        return account;
    }

    /**
     * Modifie le numéro du compte bancaire.
     * 
     * @param account Le nouveau numéro de compte
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * Retourne le solde actuel du compte bancaire.
     * 
     * @return Le solde du compte
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Modifie le solde du compte bancaire.
     * 
     * @param balance Le nouveau solde
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Affiche les informations du compte bancaire.
     * 
     * @return Une chaîne formatée avec les détails du compte
     */
    public String displayInfo() {
        return "Compte: " + account + " | Solde: " + String.format("%.2f", balance) + " FCFA";
    }
}
