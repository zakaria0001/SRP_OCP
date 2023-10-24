package Employe;

import Employe.Postes.*;

/**
 * @author | mbp-de-zakaria
 **/
public class Main {
    public static void main(String[] args) {
        Employe e = new Employe("Said",20000);
        Employe e1 = new Employe("Amine",9880);
        Employe e2 = new Employe("Ali",1500);
        Employe e3 = new Employe("Random",3500);
        Ingenieur ing = new Ingenieur();
        Technicien tc = new Technicien();
        Manager m = new Manager();
        e.setIc(ing);
        e1.setIc(tc);
        e2.setIc(m);
        e3.setIc(m);
        System.out.println("Nom : "+e.getNom()+"\nStatus : "+e.getIc().getClass().getSimpleName()+"\nSalaire De Base : "+e.getSalaireBase()+" DHS \nSalaire Avec Augementation :"+e.calculSal()+" DHS");

        System.out.println("------------------------------------------------");
        System.out.println("Nom : "+e1.getNom()+"\nStatus : "+e1.getIc().getClass().getSimpleName()+"\nSalaire De Base : "+e1.getSalaireBase()+" DHS \nSalaire Avec Augementation :"+e1.calculSal()+" DHS");

        System.out.println("------------------------------------------------");
        System.out.println("Nom : "+e2.getNom()+"\nStatus : "+e2.getIc().getClass().getSimpleName()+"\nSalaire De Base : "+e2.getSalaireBase()+" DHS \nSalaire Avec Augementation :"+e2.calculSal()+" DHS");

        System.out.println("------------------------------------------------");
        System.out.println("Nom : "+e3.getNom()+"\nStatus : "+e3.getIc().getClass().getSimpleName()+"\nSalaire De Base : "+e3.getSalaireBase()+" DHS \nSalaire Avec Augementation :"+e3.calculSal()+" DHS");
    }
}
