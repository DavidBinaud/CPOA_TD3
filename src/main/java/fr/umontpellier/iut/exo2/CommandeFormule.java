package fr.umontpellier.iut.exo2;

public class CommandeFormule implements Commande{

    private Formule formule;

    private CommandeNombre delegue;


    public CommandeFormule(String operateur,String formule, Calculette calculette) {
        this.formule = new Formule(formule);
        delegue = new CommandeNombre(operateur,this.formule.getValeur(),calculette);
    }


    public void executer(){
        delegue.executer();
    }

    public void annuler(){
        delegue.annuler();
    }

}
