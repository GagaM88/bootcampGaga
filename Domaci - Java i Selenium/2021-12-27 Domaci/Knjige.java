package DomaciDuplaPetljaIListe;

import java.util.ArrayList;

public class Knjige {
    public static void main(String[] args){

        //kreirala sam listu sa kapacitetom 5
        ArrayList<String> knjige = new ArrayList<>();

        knjige.add("Covek po imenu Uve");
        knjige.add("Put kojim se redje ide");
        knjige.add("Medvedgrad");
        knjige.add("Alhemicar");
        knjige.add("Fajront u Sarajevu");
        knjige.add("Uznemireni ljudi");
        System.out.println(knjige);

        //dohvatanje treceg elementa i ispis
        String a = knjige.get(3);
        System.out.println(a);

        //menjanje naziva prvog elementa
        knjige.set(1, "Zajedno sami");
        System.out.println(knjige);

        //uklanjanje 5-tog elementa
        knjige.remove(5);
        System.out.println(knjige);

        //Ispis velicine liste
        int s = knjige.size();
        System.out.println(s);

        //Pomocu for petlje ispisite elemente liste
        //I nacin
        System.out.println("Elementi liste su: ");
        for (int i = 0; i< knjige.size(); i++){
            System.out.println((i+1)+(".") + knjige.get(i) + " ");
            System.out.println();
        }
        //II nacin
        System.out.println("Elementi liste su: ");
        for (String i : knjige){
            System.out.println( i  + " ");
        }
        

    }
}
