package fr.umontpellier.iut.exo2;

public class Command {

    private String operateur;

    private double operande;

    private Calculette calculette;

    public Command(String operateur, double operande, Calculette calculette) {
        this.operateur = operateur;
        this.operande = operande;
        this.calculette = calculette;
    }

    void executer(){
        calculette.calculer(operateur,operande);
    }

    public void annuler(){
        calculette.calculer(inverse(operateur),operande);
    }

    public String inverse(String operateur){
        switch (operateur) {
            case "+":
                return "-";

            case "-":
                return "+";

            case "*":
                return "/";

            case "/":
                return "*";
            default: return "";
        }
    }
}

