package ZadaciStrahinjaVezbanje;
//Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite neki broj N: ");
        int n = scanner.nextInt();

        if ( n % 2 == 0){
            System.out.println("Paran");
        } else {
            System.out.println("Neparan");


        }
}
    }
