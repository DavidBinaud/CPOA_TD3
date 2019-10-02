package fr.umontpellier.iut.exo2;

public class App {
    public static void main(String[] args) {

        Utilisateur u = new Utilisateur();
        Calculette calculette = new Calculette();

        u.effectuerOperation(new CommandeNombre("+", 5,calculette));

        u.effectuerOperation(new CommandeNombre("*",3,calculette));

        u.effectuerOperation(new CommandeFormule("+","(100*3.2-(100+50*(2-1)))",calculette));


        u.effectuerOperation(new CommandeNombre("+",13, calculette));
        Formule formule2 = new Formule("(21-9+5*20/(947 - 6 - 891)+18)");
        u.effectuerOperation(new CommandeFormule("-","(21-9+5*20/(947 - 6 - 891)+18)",calculette));

        //devrait afficher 166
        System.out.println(calculette.toString());

        u.annulerOperation(3);

        //devrait afficher 15
        System.out.println(calculette.toString());

        u.refaireOperation(1);


        //devrait afficher 185
        System.out.println(calculette.toString());

        u.effectuerOperation(new CommandeNombre("+",1,calculette));


        //devrait afficher 186
        System.out.println(calculette.toString());

        // ne refait aucune operation
        u.refaireOperation(1);


        //devrait afficher 186
        System.out.println(calculette.toString());
    }
}
