package ZadaciStrahinjaVezbanje;

//Napisati program koji racuna dupli faktorijel unetg broja n. Dupli faktorijel broja n je:
//n!! = n * (n-2) * (n-4) * ... * (2 ili 1)

import java.util.Scanner;

public class DupliFaktorijel {
    public static void main(String[] args) {

        System.out.println("Uneti neki broj n: ");
        Scanner scanner= new Scanner(System.in);

        int n = scanner.nextInt();
        int f = 1;
        if ( n % 2 == 0){
           for ( int i = n; i>= 2; i -=2 ){
               f *= i;
           }
        }else{
            for ( int i = n; i >= 1; i -= 2){
                f *= i;
            }
            System.out.println("Dupli faktorijel broja" + " " + n + " " + "je: " + f);
        }

    }
}
