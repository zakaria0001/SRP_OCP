package Banque;

/**
 * @author | mbp-de-zakaria
 **/
public class Main {
    public static void main(String[] args) {
        Transactions TR = new Transactions();
        Solde s = new Solde();
        Virement v = new Virement();

        CompteBancaire C1 = new CompteBancaire("EMSI1", 300000);
        CompteBancaire C2 = new CompteBancaire("EMSI2", 0);

        s.afficherSolde(C1);
        v.effectuerVirement(C1,C2,500);
        s.afficherSolde(C2);
    }
}
