package fr.umontpellier.iut.exo2;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Formule {
    private static final String DELIMITEUR = "((?<=\\%1$s)|(?=\\%1$s))";
    private String[] expression;


    public Formule(String expression) {
        this.expression = decouper(expression);
    }

    private String[] decouper(String valeur) {
        String noSpaces = valeur.replaceAll("\\s+", "");
        return noSpaces.split(String.format(DELIMITEUR, "*") + "|" + String.format(DELIMITEUR,
                "+") + "|" + String.format(DELIMITEUR, "-") + "|" + String.format(DELIMITEUR, "/") +
                "|" + String.format(DELIMITEUR, "(") + "|" + String.format(DELIMITEUR, ")"));
    }

    @Override
    public String toString() {
        return "{" + Arrays.toString(expression) + '}';
    }

    public double getValeur(){
        ArrayDeque<Double> pileOperandes = new ArrayDeque<>();
        ArrayDeque<String> pileOperateurs = new ArrayDeque<>();

        for (String o: expression) {

            if(o.equals("(")){
                pileOperateurs.push(o);
            }else if (o.matches("[-+*/]")) {
                    while (!pileOperateurs.isEmpty() && priority(o) <= priority(pileOperateurs.peek())){
                        update(pileOperandes,pileOperateurs);
                    }
                    pileOperateurs.push(o);
            } else if(o.equals(")")){
                        while (!pileOperateurs.peek().equals("(")){
                            update(pileOperandes,pileOperateurs);
                        }
                        pileOperateurs.pop();
            }else{
                            pileOperandes.push(Double.parseDouble(o));
            }
        }

        while (!pileOperateurs.isEmpty()){
            update(pileOperandes,pileOperateurs);
        }
        return pileOperandes.pop();
    }

    private void update(ArrayDeque<Double> pileOperandes, ArrayDeque<String> pileOperateurs){
        double membreDroit = pileOperandes.pop();
        String operateur = pileOperateurs.pop();
        double membreGauche = pileOperandes.pop();
        double resultat = 0;
        switch (operateur){
            case "/":resultat = membreGauche / membreDroit;
                break;
            case "*":resultat = membreGauche * membreDroit;
                break;
            case "+":resultat = membreGauche + membreDroit;
                break;
            case "-":resultat = membreGauche - membreDroit;
                break;
        }
        pileOperandes.push(resultat);
    }

    private int priority(String s){
        switch (s){
            case "/":case "*":return 2;
            case "+":case "-":return 1;
            default: return Integer.MIN_VALUE;
        }
    }
}
