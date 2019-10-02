package fr.umontpellier.iut.exo2;

import java.util.ArrayDeque;

public class Utilisateur {

    private ArrayDeque<Commande> historique= new ArrayDeque<>();
    private ArrayDeque<Commande> historiqueannulation = new ArrayDeque<>();


    public void effectuerOperation(Commande cmd){
        cmd.executer();
        historique.push(cmd);
        historiqueannulation.clear();
    }

    public void annulerOperation(int nboperations){

        while (!historique.isEmpty() && nboperations > 0){
            Commande c = historique.pop();
            c.annuler();
            historiqueannulation.push(c);
            nboperations--;
        }

    }

    public void refaireOperation(int nboperations){

        while (!historiqueannulation.isEmpty() && nboperations > 0){
            Commande c = historiqueannulation.pop();
            c.executer();
            historique.push(c);
            nboperations--;
        }
    }

}
