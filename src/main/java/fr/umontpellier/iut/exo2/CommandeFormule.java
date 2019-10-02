package fr.umontpellier.iut.exo2;

public class CommandeFormule {

    private Formule formule;

    private Command delegue;


    public CommandeFormule(String operateur,String formule, Calculette calculette) {
        this.formule = new Formule(formule);
        delegue = new Command(operateur,this.formule.getValeur(),calculette);
    }


    void executer(){
        delegue.executer();
    }

    public void annuler(){
        delegue.annuler();
    }

}
