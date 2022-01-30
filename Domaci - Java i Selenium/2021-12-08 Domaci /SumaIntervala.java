package ZadaciStrahinjaVezbanje;
//Korisnik unosi cele brojeve m i n sa konzole, m <= n. Ispisati sumu brojeva [m, n].

import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {

        System.out.println("Unesi ceo broj m: ");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println("Unesi ceo broj n: ");
        int n = scanner.nextInt();
        int sum = 0;
        if (m < 0 || n < 0){
            System.out.println("Broj ne moze da bude negativan!");
        } else if (m == 0 && n==0){
            System.out.println("Zbir dve 0 daje 0");
        } else if (n < m){
            System.out.println("Drugi broj mora biti veci od prvog broja");
        } else {

        for (int i = m; i <= n; i++){
            
            sum += i;
        }
        System.out.println("Suma izmedju broja " + m + " i " + "broja " + n + " je " + sum);



    }
}
    }
