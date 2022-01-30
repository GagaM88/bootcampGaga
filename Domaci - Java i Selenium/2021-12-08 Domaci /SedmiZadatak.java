package ZadaciStrahinjaVezbanje;
//Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

import java.util.Scanner;

public class SedmiZadatak {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Uneti mesec rodjenja: ");
        int mesec = scanner.nextInt();
        if(mesec < 1 || mesec > 12) {
            System.out.println("Uneli ste pogresan broj. Godina moze imati od 1 do 12 meseci");
            return;
        };
        System.out.println("Uneti dan rodjenja");
        int dan = scanner.nextInt();
        if(dan < 1 || dan > 31) {
            System.out.println("Uneli ste pogresan broj. Mesec moze imati od 1 do 31 dan");
            return;
        };
        switch (mesec){
            case 1:
                if ( dan <= 20 ){
                    System.out.println("Vi ste Jarac u horoskopu");
                }else {
                    System.out.println("Vi ste Vodolija u horoskopu");
                }
                break;
            case 2:
                if ( dan <= 19 ){
                    System.out.println("Vi ste Vodolija u horoskopu");
                }else {
                    System.out.println("Vi ste Riba u horoskopu");
                }
                break;
            case 3:
                if ( dan <= 20 ){
                    System.out.println("Vi ste Riba u horoskopu");
                }else {
                    System.out.println("Vi ste Ovan u horoskopu");
                }
                break;
            case 4:
                if ( dan <= 20 ){
                    System.out.println("Vi ste Ovan u horoskopu");
                }else {
                    System.out.println("Vi ste Bik u horoskopu");
                }
                break;
            case 5:
                if ( dan <= 21 ){
                    System.out.println("Vi ste Bik u horoskopu");
                }else {
                    System.out.println("Vi ste Blizanac u horoskopu");
                }
                break;
            case 6:
                if ( dan <= 21 ){
                    System.out.println("Vi ste Blizanac u horoskopu");
                }else {
                    System.out.println("Vi ste Rak u horoskopu");
                }
                break;
            case 7:
                if ( dan <= 22 ){
                    System.out.println("Vi ste Rak u horoskopu");
                }else {
                    System.out.println("Vi ste Lav u horoskopu");
                }
                break;
            case 8:
                if ( dan <= 22 ){
                    System.out.println("Vi ste Lav u horoskopu");
                }else {
                    System.out.println("Vi ste Devica u horoskopu");
                }
                break;
            case 9:
                if ( dan <= 22 ){
                    System.out.println("Vi ste Devica u horoskopu");
                }else {
                    System.out.println("Vi ste Vaga u horoskopu");
                }
                break;
            case 10:
                if ( dan <= 23 ){
                    System.out.println("Vi ste Vaga u horoskopu");
                }else {
                    System.out.println("Vi ste Skorpija u horoskopu");
                }
                break;
            case 11:
                if ( dan <= 22 ){
                    System.out.println("Vi ste Skorpija u horoskopu");
                }else {
                    System.out.println("Vi ste Strelac u horoskopu");
                }
                break;
            case 12:
                if ( dan <= 21 ){
                    System.out.println("Vi ste Strelac u horoskopu");
                }else {
                    System.out.println("Vi ste Jarac u horoskopu");
                }
                break;
            default:
                    System.out.println("Nemam default stanje");
                break;

        }


    }
}
/*System.out.println("Unesi cifru dana u nedelji");
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();
        String p = "Unet dan je "; // napravimo placeholder, lakse je nego da pisemo svaki put

// koju promenljivu ja dodeljujem switchu
        switch (dan) { // Switchu prosledjujemo sta ce da  uporedjuje
            case 1: // kod koji se izvrsava
                System.out.println(p + "ponedeljak");
                break; // ne nastavlja dalje,obavezno posle svakog case
            case 2:
                System.out.println(p + "utorak");
                break; // ne nastavlja dalje,obavezno posle svakog case
            case 3:
                System.out.println(p + "sreda");
                break; // ne nastavlja dalje,obavezno posle svakog case
            case 4:
                System.out.println(p + "cetvrtak");
                break; // ne nastavlja dalje,obavezno posle svakog case
            case 5:
                System.out.println(p + "petak");
                break; // ne nastavlja dalje,obavezno posle svakog case
            case 6:
                System.out.println(p + "subota");
                break; // ne nastavlja dalje,obavezno posle svakog case
            case 7:
                System.out.println(p + "nedelja");
                break; // ne nastavlja dalje,obavezno posle svakog case
            //sta god da unesemo da ne spada u ove slucajeve, kod koji se ne izvrsava
            default:
                System.out.println("Potrebno je uneti broj od 1 do 7 ");
                break;
        }*/