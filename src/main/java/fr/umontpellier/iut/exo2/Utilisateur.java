package fr.umontpellier.iut.exo2;

import java.util.ArrayDeque;

public class Utilisateur {

    private Calculette macalculette = new Calculette();
    private ArrayDeque<Command> historique= new ArrayDeque<>();
    private ArrayDeque<Command> historiqueannulation = new ArrayDeque<>();


    public void effectuerOperation(String operation, double operande){
        Command cmd = new Command(operation,operande,macalculette);
        cmd.executer();
        historique.push(cmd);
        historiqueannulation.clear();
    }

    public void annulerOperation(int nboperations){

        while (!historique.isEmpty() && nboperations > 0){
            Command c = historique.pop();
            c.annuler();
            historiqueannulation.push(c);
            nboperations--;
        }

    }

    public void refaireOperation(int nboperations){

        while (!historiqueannulation.isEmpty() && nboperations > 0){
            Command c = historiqueannulation.pop();
            c.executer();
            historique.push(c);
            nboperations--;
        }
    }

    @Override
    public String toString() {
        return macalculette.toString();
    }
}
