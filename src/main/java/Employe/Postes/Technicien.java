package Employe.Postes;

import Employe.Employe;
import Employe.Icalculer;

/**
 * @author | mbp-de-zakaria
 **/
public class Technicien implements Icalculer {
    public double calculer(Employe E) {
        return E.getSalaireBase()*1.25;
    }
}
