package fr.umontpellier.iut.exo1;

public class Calculette {

    private double actualvalue;

    public Calculette(double value) {
        actualvalue = 0;
    }

    public void calculer(String operateur,double nombre){
       switch (operateur){
           case "+": actualvalue += nombre;
                    break;
           case "-": actualvalue -= nombre;
                    break;
           case "*": actualvalue *= nombre;
                    break;
           case "/": actualvalue /= nombre;
                    break;
           default : throw new ArithmeticException("opérateur non défini");
       }

    }

    @Override
    public String toString() {
        return "" + actualvalue;
    }
}
