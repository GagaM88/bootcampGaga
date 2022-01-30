package ZadaciStrahinjaVezbanje;

import java.util.Scanner;

//  Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
//	"Dobrodosao u {x}. razred, {ime} {prezime}",
//	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
//    poruku od:
//	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"
// input ime
// input prezime
// input godina rodjenja
// if > 2021  "{ime} {prezime} tek treba da zapocne obrazovanje"
// if < 2010  "{ime} {prezime} je zavrsio skolu"
public class OsmiZadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = scanner.next();
        System.out.println("Unesite prezime: ");
        String prezime = scanner.next();
        System.out.println("Unesite godinu rodjenja: ");
        int godinaRodjenja = scanner.nextInt();
        int sadasnjaGodina = 2021;
        int godine = sadasnjaGodina - godinaRodjenja;

        if (godine < 7){
            System.out.println(ime + " " + prezime + " " + "tek treba da zapocne obrazovanje");
        } else if (godine > 19){
            System.out.println(ime + " " + prezime + " " + "je zavrsio skolu");
        } else {
            System.out.println(" Dobrodosao u " + (godine - 7 ) + " " + "razred");
        }

    }
}

