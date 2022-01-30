package ZadaciStrahinjaVezbanje;
//27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati svaki drugi element tog niza
//Primer: [1, 2, 3, 4, 5] -> 1 3 5
//27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

import java.util.Scanner;

public class DvadesetSedmiZadatak {
    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza: ");
    int[] niz = new int[sc.nextInt()];

        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < niz.length; i++) {
        niz[i] = sc.nextInt();
    }
    svakiDrugi(niz);
}

        public static void svakiDrugi(int[] niz) {

        System.out.println("Svaki drugi element Vaseg niza je: ");
        for (int i = 0; i < niz.length; i += 2) {

            System.out.println(niz[i]);
        }
    }
}


