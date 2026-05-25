/**
 * Classe représentant un certificat de dépôt (COD).
 * Hérite de la classe BankAccount.
 * 
 * @author BankManager App
 * @version 1.0
 */
public class COD extends BankAccount {

    /**
     * Constructeur de la classe COD.
     * 
     * @param account Le numéro du certificat de dépôt
     * @param balance Le montant du dépôt
     */
    public COD(String account, double balance) {
        // Appel au constructeur de la classe parente BankAccount
        super(account, balance);
    }

    /**
     * Affiche les informations du certificat de dépôt.
     * 
     * @return Une chaîne formatée avec les détails du certificat de dépôt
     */
    @Override
    public String displayInfo() {
        return super.displayInfo() + " | Type: Certificat de Dépôt (COD)";
    }
}
