package Banque;

/**
 * @author | mbp-de-zakaria
 **/
public class Solde {
    public void afficherSolde(CompteBancaire c ) {
        System.out.println("Solde du compte de " + c.getTitulaire() + " : " + c.getSolde());
    }
}
