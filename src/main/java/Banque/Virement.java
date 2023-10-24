package Banque;

/**
 * @author | mbp-de-zakaria
 **/
public class Virement {
    public void effectuerVirement(CompteBancaire compteEmetteur,CompteBancaire compteDestinataire, double montant) {
        Transactions tr = new Transactions();
        if (compteEmetteur.getSolde() >= montant) {
            tr.retirer(compteEmetteur,montant);
            tr.deposer(compteDestinataire,montant);
        } else
            System.out.println("Solde insuffisant pour effectuer le virement.");
    }
}
