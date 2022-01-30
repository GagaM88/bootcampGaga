package ZadaciStrahinjaVezbanje;
//Ispisati proizvod prvih n celih brojeva [1, n]

import java.util.Scanner;

public class SestiZadatak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uneti do kog broja ispisati proizvod: ");
        long proizvod = 1;
        long n = scanner.nextLong();
//        if ( n > 15) {
//            System.out.println("Nije moguce racunati celih proizvod brojeva vecih od 15");
//        } else {
            for (long i = 1; i <= n; i++){
                proizvod = proizvod * i;
            }
            System.out.println("Proizvod celih n brojeva je: " + proizvod);
        }
    }
//}
