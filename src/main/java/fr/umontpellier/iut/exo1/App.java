package fr.umontpellier.iut.exo1;

public class App {
    public static void main(String[] args) {

        Utilisateur utilisateur = new Utilisateur();


        for (int j = 0; j <= 100; j++) {
            utilisateur.effectuerOperation("+",j);
            System.out.println(utilisateur.toString());
        }


        for (int j = 0; j < 100; j++) {
            utilisateur.annulerOperation(1);
            System.out.println(utilisateur.toString());
        }
    }
}
