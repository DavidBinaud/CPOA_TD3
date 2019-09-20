package fr.umontpellier.iut.exo1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Utilisateur {

    private Calculette macalculette = new Calculette();
    private ArrayDeque<Command> historique= new ArrayDeque<>();


    public void effectuerOperation(String operation, double operande){
        macalculette.calculer(operation,operande);
        Command c = new Command(operation,operande,macalculette);
        historique.add(c);
    }

    public void annulerOperation(int nboperations){

    }

    @Override
    public String toString() {
        return macalculette.toString();
    }
}
