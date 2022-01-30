package ZadaciStrahinjaVezbanje;
//Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2n.

import java.util.Scanner;

public class PetiZadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Uneti pozitivan broj n: ");
        int n = scanner.nextInt();

        for (int i = -14; i <= 2*n; i++){
            System.out.println(i);

    }
}
    }