package Ucenik;
//Napisati klasu Ucenik koja ima sledeca polja:
//	- String ime
//	- String prezime
//	- ArrayList ocene
//
//Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime, a ocene postavlja na praznu listu.
//Napisati gettere i settere za sva polja.
//Napisati toString() metod:
//	{ime} i {prezime} ima ocene:
//	{ocene}
//Napisati metod proske koji racuna prosek Ucenika.

    import java.util.ArrayList;

    public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene; ////ako ne prosledi nista onda je prazan niz

    // pravimo prvi konstruktor sa nizom

     public Ucenik(String ime, String prezime) {
         this.ime = ime;
         this.prezime = prezime;
     }
     // pravimo drugi konstruktor bez niza
     public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;

    }
        // Getteri i setteri za sva polja

    public String getIme() {
            return ime;
        }

    public String getPrezime() {
            return prezime;
        }

    public ArrayList<Integer> getOcene() {
            return ocene;
        }

    public void setIme(String ime) {
            this.ime = ime;
        }

    public void setPrezime(String prezime) {
            this.prezime = prezime;
        }

    public void setOcene(ArrayList<Integer> ocene) {
            this.ocene = ocene;
        }

        // metod koji racuna prosek ucenika:

    public double prosekUcenika(){
        double suma = 0;
        for (int ocena : ocene) {
            suma += ocena;
        }
        return suma/ ocene.size();
        }

        //toString metoda sa StringBuilder
        public String toString(){
        StringBuilder sb = new StringBuilder();

            sb.append("Ime: ");
            sb.append(ime);
            sb.append("i");
            sb.append("Prezime");
            sb.append(prezime);
            sb.append("\n");
            sb.append("Ima ocene: ");
            sb.append(ocene);
            sb.append("\n");

            return sb.toString();

        }
    }
