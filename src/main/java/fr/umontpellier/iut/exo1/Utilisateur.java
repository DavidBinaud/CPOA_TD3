package fr.umontpellier.iut.exo1;

import java.util.ArrayDeque;
import java.util.Deque;

public class Utilisateur {

    private Calculette macalculette = new Calculette();
    private ArrayDeque<Command> historique= new ArrayDeque<>();


    public void effectuerOperation(String operation, double operande){
        Command cmd = new Command(operation,operande,macalculette);
        cmd.executer();
        historique.push(cmd);
    }

    public void annulerOperation(int nboperations){

        while (!historique.isEmpty() && nboperations > 0){
            historique.pop().annuler();
            nboperations--;
        }

    }

    @Override
    public String toString() {
        return macalculette.toString();
    }
}
