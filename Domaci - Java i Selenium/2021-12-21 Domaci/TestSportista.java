package DomaciSport;

public class TestSportista {
    public static void main(String[] args) {

        Sportista sp1 = new Sportista("Dragana Mitrovic", "tenis", "Partizan", 15);
        Sportista sp2 = new Sportista("Nikola Jovanovic", "kosarka", 22);

        Sportista sp3 = new Sportista("Bojan Petrovic", "fudbal","Crvena Zvezda", 10);

        //Bojan je promenio klub iz Crvena Zvezda u Jagodina
        sp3.setKlub("Jagodina");

        System.out.println(sp1.toString());
        System.out.println(sp2.toString());
        System.out.println(sp3.toString());

}
}
