package drugi_domaci_03_12;
/*Za uneti pozitivan ceo broj ispisati faktorijel tog broja.
Faktorijel se obelezava sa znakom uzvika "!" i racuna se kao: n! = n * (n-1) * (n-2) * ... * 2 * 1. Dakle, npr:
5! = 5 * 4 * 3 * 2 * 1 = 120
3! = 3 * 2 * 1 = 6 */

import java.util.Scanner;

public class Faktorijel {
    public static void main(String[] args) {

        int a = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uneti pozitivan ceo broj da se izracuna faktorijel: ");
        int n = scanner.nextInt();
            for (int i=2; i<=n; i++){
                a *= i;
        }
        System.out.println(a);

    }
}
