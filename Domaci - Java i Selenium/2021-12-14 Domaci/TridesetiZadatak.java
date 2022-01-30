package ZadaciStrahinjaVezbanje;
//-//-. Izracunati proizvod elemenata tog niza.
//Primer: [2, 4] -> 8
//30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.

import java.util.Scanner;

public class TridesetiZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite velicinu niza: ");
        int[] niz = new int[sc.nextInt()];

        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }

        proizvodNiza(niz);}

    public static void proizvodNiza(int[] niz){

        int proizvod = 1;
        for (int i = 0; i < niz.length; i++) {
            proizvod = proizvod * niz[i];
        }
        System.out.println("Proizvod elemenata niza je: " + proizvod);

    }
}


