package ZadaciStrahinjaVezbanje;
//Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je strogo manji od 0 ili "Neutralan" ako je tacno 0.

import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite neki broj N: ");
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println("Pozitivan");
        } else if (n < 0) {
            System.out.println("Negativan");
        } else {
            System.out.println("Neutralan");
        }
    }


}




