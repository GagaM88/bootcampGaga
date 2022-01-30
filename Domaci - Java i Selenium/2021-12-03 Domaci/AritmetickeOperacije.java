package drugi_domaci_03_12;
/*Aritmeticke opracije1. Aritmeticke opracije
//Na standardni ulaz se unose dva cela broja. Ispisati na standardnom izlazu u zasebnim redovima zbir, razliku, proizvod, kolicnik i
ostatak deljenja prvog broja drugim
tim redom. */

import java.util.Scanner;

public class AritmetickeOperacije {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite prvi celi broj: ");
        int prviUnos = scanner.nextInt();
        System.out.println("Unesite drugi celi broj: ");
        int drugiUnos = scanner.nextInt();
        System.out.println("Zbir je: " + (prviUnos + drugiUnos));
        System.out.println("Razlika je: " + (prviUnos - drugiUnos));
        System.out.println("Proizvod je: " + (prviUnos * drugiUnos));
        System.out.println("Kolicnik je: " + (prviUnos / drugiUnos));
        System.out.println("Ostatak pri deljenju je: " + (prviUnos  % drugiUnos));

        System.out.println("Kraj programa!");
    }
}
