package fr.umontpellier.iut.exo2;

public class App {
    public static void main(String[] args) {

       Formule formule = new Formule("(200+50)*5+9/3");
        System.out.println(formule.toString());
        System.out.println(formule.getValeur());


        Formule formulelongue = new Formule("21-9+5*20/(947  - 6 - 891)+18");
        System.out.println(formulelongue.toString());
        System.out.println(formulelongue.getValeur());
    }
}
