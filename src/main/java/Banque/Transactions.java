package Banque;

/**
 * @author | mbp-de-zakaria
 **/
public class Transactions {
    public void deposer(CompteBancaire c , double montant) {
       if(c.getSolde()>=montant){
           c.setSolde(c.getSolde()+montant);
       }
    }

    public void retirer(CompteBancaire c , double montant) {
        if(c.getSolde()>=montant){
            c.setSolde(c.getSolde()-montant);
        }
    }
}
