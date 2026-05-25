/**
 * Classe représentant un compte courant.
 * Hérite de la classe BankAccount et ajoute une limite de découvert autorisé.
 * 
 * @author BankManager App
 * @version 1.0
 */
public class CheckingAccount extends BankAccount {

    /** Limite de découvert autorisé pour le compte courant */
    private double limit;

    /**
     * Constructeur de la classe CheckingAccount.
     * 
     * @param account Le numéro du compte courant
     * @param balance Le solde initial
     * @param limit   La limite de découvert autorisé
     */
    public CheckingAccount(String account, double balance, double limit) {
        // Appel au constructeur de la classe parente BankAccount
        super(account, balance);
        this.limit = limit;
    }

    /**
     * Retourne la limite de découvert autorisé.
     * 
     * @return La limite de découvert
     */
    public double getLimit() {
        return limit;
    }

    /**
     * Modifie la limite de découvert autorisé.
     * 
     * @param limit La nouvelle limite de découvert
     */
    public void setLimit(double limit) {
        this.limit = limit;
    }

    /**
     * Affiche les informations du compte courant, y compris la limite de découvert.
     * 
     * @return Une chaîne formatée avec les détails du compte courant
     */
    @Override
    public String displayInfo() {
        return super.displayInfo() + " | Type: Compte Courant | Limite de découvert: " + String.format("%.2f", limit) + " FCFA";
    }
}
