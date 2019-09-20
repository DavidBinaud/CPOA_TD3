package fr.umontpellier.iut.exo1;

public class App {
    public static void main(String[] args) {

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.effectuerOperation("+",5);
        System.out.println(utilisateur);
    }
}
