package ZadaciStrahinjaVezbanje;
//-//-. Ispisati svaki treci element u obrnutom redosledu.
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.

import java.util.Scanner;

public class DvadesetDevetiZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza: ");
        int[] niz = new int[sc.nextInt()];

        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        treciElement(niz);
    }

    public static void treciElement(int[] niz) {

        System.out.println("Svaki treci element niza sa obrnutim redosledom je: ");
        for (int i = niz.length-1; i >= 0; i-=3) {

            System.out.println(niz[i]);
        }



    }
}



