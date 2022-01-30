package ZadaciStrahinjaVezbanje;

//Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.

import java.util.Scanner;

public class CetvrtiZadatak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi negativan broj n: ");

        int n = scanner.nextInt();

        for (int i = n; i <= 0; i++) {

            System.out.println(i);
        }
    }
}
