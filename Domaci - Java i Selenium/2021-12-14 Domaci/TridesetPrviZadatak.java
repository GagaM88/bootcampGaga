package ZadaciStrahinjaVezbanje;
//Napisati funkciju koja racuna proizvod 3 broja.
//Hint kako citati ove zadatke:
//- ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
//- funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)

import java.util.Scanner;

public class TridesetPrviZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tri broja: ");
        System.out.println(proizvod(sc.nextInt(), sc.nextInt(),sc.nextInt()));

    }

    public static int proizvod(int x,int y,int z){
        int p = x * y * z;
        return p;
    }
}




