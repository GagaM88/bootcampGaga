package prvi_domaci_sintaksa_grananje;//Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se ivice prostorije ucitavaju preko konzole.
// (za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).


import java.util.Scanner;

public class Sintaksa1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Unesite duzinu prvog zida");
        float x = scanner.nextFloat();

        System.out.println("Unesite duzinu drugog zida");
        float y = scanner.nextFloat();

        System.out.println("Unesite visinu zida");
        float z = scanner.nextFloat();

        System.out.println("Povrsina okrecene prostorije iznosi " + (2*(x*y + x*z + y*z) - x*y) + "m2");



    }







}
