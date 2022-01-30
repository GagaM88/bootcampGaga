package ZadaciStrahinjaVezbanje;
//Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
//[a, b] = Od i zakljucno sa a, do i zakljucno sa b

import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti ceo pozitivan broj n: ");

        int n = sc.nextInt();



        for (int i = 0; i <=n; i++) {
            System.out.println(i);



        }
        System.out.println("Kraj programa");
    }
}

