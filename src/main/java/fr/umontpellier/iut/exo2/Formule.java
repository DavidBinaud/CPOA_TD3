package fr.umontpellier.iut.exo2;

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
}
