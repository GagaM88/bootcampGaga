package prvi_domaci_sintaksa_grananje;//Napisati program koji proverava da li je uneti broj paran.
// Ukoliko jeste, program treba da ispise poruku: Broj je paran! Ukoliko nije, program treba da ispise poruku: Broj je neparan!

import java.util.Scanner;

public class Grananja1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Unesite neki ceo broj: ");

        int a = scanner.nextInt();

        if ( a % 2 == 0){
            System.out.println("Broj je paran!");
        } else {
            System.out.println("Broj je neparan!");

    }
        System.out.println("Program je zavrsen!");
}
    }