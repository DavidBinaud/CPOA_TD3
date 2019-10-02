package fr.umontpellier.iut.exo2;

public class App {
    public static void main(String[] args) {

        Utilisateur u = new Utilisateur();


        u.effectuerOperation("+",5);

        u.effectuerOperation("*",3);

        Formule formule1 = new Formule("(100*3.2-(100+50*(2-1)))");
        u.effectuerOperation("+",formule1.getValeur());


        u.effectuerOperation("+",13);
        Formule formule2 = new Formule("(21-9+5*20/(947 - 6 - 891)+18)");
        u.effectuerOperation("-",formule2.getValeur());

        //devrait afficher 166
        System.out.println(u.toString());

        u.annulerOperation(3);

        //devrait afficher 15
        System.out.println(u.toString());

        u.refaireOperation(1);


        //devrait afficher 185
        System.out.println(u.toString());

        u.effectuerOperation("+",1);


        //devrait afficher 186
        System.out.println(u.toString());

        // ne refait aucune operation
        u.refaireOperation(1);


        //devrait afficher 186
        System.out.println(u.toString());
    }
}
