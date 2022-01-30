package drugi_domaci_03_12;

/*Za uneti celobrojni nenegativan broj n, ispisati za sve brojeve od 1 do i zakljucno sa n nisku "Fizz" ako je on deljiv sa 3,
nisku "Buzz" ako je on deljiv sa 5, a nisku
"FizzBuzz" ako je on deljiv i sa 3 i sa 5.*/

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int n = scanner.nextInt();
        int a = 3;
        int b = 5;
        for (int i = 1; i <= n; i++) {


            if (i % a == 0 && i % b == 0){
                System.out.println( i + ": FizzBuzz");
            }  if (i % a == 0){
                System.out.println( i + ": Fizz");
            } else if (i % b == 0){
                System.out.println( i + ": Buzz");
            } else {
                System.out.println(i + ":");
            }

        }

    }
}

