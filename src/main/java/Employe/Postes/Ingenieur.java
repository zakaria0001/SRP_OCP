package Employe.Postes;

import Employe.Employe;
import Employe.Icalculer;

/**
 * @author | mbp-de-zakaria
 **/
public class Ingenieur implements Icalculer {
    public double calculer(Employe E) {
        return E.getSalaireBase()*2.75;
    }
}
