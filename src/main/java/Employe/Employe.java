package Employe;

/**
 * @author | mbp-de-zakaria
 **/
public class Employe {
    private Icalculer ic ;
    private String nom;
    private double salaireBase;
    public Employe(String nom, double salaireBase) {
        this.nom = nom;
        this.salaireBase = salaireBase;

    }

    public Icalculer getIc() {
        return ic;
    }

    public void setIc(Icalculer ic) {
        this.ic = ic;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public double calculSal() {
       return ic.calculer(this);
    }
}
