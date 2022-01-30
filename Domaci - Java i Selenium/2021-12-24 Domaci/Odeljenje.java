package Ucenik;
//Napisati klasu Odeljenje koja ima sledeca polja:
//	- String oznaka
//	- ArrayList dnevnik
//
//Napisati 2 konstruktora, opet na isti nacin.
//Napisati gettere i settere za sva polja.

import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList <Ucenik> dnevnik; // stavljamo ucenik u listu

    //prvi konstruktor sa listom

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }
    // drugi konstruktor bez liste

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
    }

    public String getOznaka() {
        return oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }
    //Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.
    public void upisUcenika(Ucenik u){
        dnevnik.add(u);
    }
    //Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u dnevnik na redni broj {redniBroj}
    public void upisUcenika(Ucenik u, int redniBroj){
        dnevnik.add(redniBroj, u);
    }
    //Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.
    public void ispisUcenika(Ucenik u){
        dnevnik.remove(u);
    }
    //Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.
    public void ispisUcenika(int redniBroj){
        dnevnik.remove(redniBroj);
    }
    //Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.
    public void pogledajOcene (Ucenik u){
        System.out.println(u.getOcene());
    }
    //Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.
    public void pogledajOcene(int redniBroj){
        System.out.println(dnevnik.get(redniBroj).getOcene());
    }
    //Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.
    public void prosecnaOcena(Ucenik u){
        System.out.println(u.prosekUcenika());
    }
    //Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.
    public void prosecnaOcena(int redniBroj){
        System.out.println(dnevnik.get(redniBroj).prosekUcenika());
    }
    //Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja (0, ako nema ucenika u odeljenju).
    public double prosecnaOcenaOdeljenja(){
        if (dnevnik.isEmpty()){
            return 0;
        }
        double suma = 0;
        for (Ucenik ucenik:dnevnik){
            suma += ucenik.prosekUcenika();
        }
        return suma / dnevnik.size();
    }
    //Napisati metod opisnaOcena(Ucenik u) koja ispisuje:
    //	- "Odlican"; ako je prosek ucenika {u} 4.5 ili vise
    //	- "Vrlo dobar"; ako je prosek ucenika {u} [3.5, 4.5)
    //	- "Dobar"; ako je prosek ucenika {u} [2.5, 3.5)
    //	- "Dovoljan"; ako je prosek ucenika {u} [1.5, 2.5)
    //	- "Nedovoljan"; ako ucenik {u} ima barem jednu jedinicu
    public void opisnaOcena(Ucenik u){
        if (u.prosekUcenika() >= 1){
            System.out.println("Nedovoljan.");
        } else if(u.prosekUcenika() >= 4.5){
            System.out.println("Odlican.");
        } else if (3.5 <= u.prosekUcenika() || u.prosekUcenika() < 4.5){
            System.out.println("Vrlo Dobro.");
        } else if (2.5 <= u.prosekUcenika() || u.prosekUcenika()< 3.5){
            System.out.println("Dobar.");
        }else if(1.5 <= u.prosekUcenika() || u.prosekUcenika()< 2.5){
            System.out.println("Dovoljan");
        }

    }
    //Napisati metod izlistajDnevnik() koja vraca String oblika:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    //za sve ucenike.
    public String izlistajDnevnik(){
        StringBuilder sb = new StringBuilder();
        for (Ucenik ucenik:dnevnik){
            sb.append(ucenik.getIme());
            sb.append("i");
            sb.append(ucenik.getPrezime());
            sb.append("ima ocene:");
            sb.append("\n");
            sb.append(ucenik.getOcene());
            sb.append("\n");
        }
        return sb.toString();
    }
    //Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:
    //	- "Veliko odeljenje"; ako ima vise od 25 ucenika
    //	- "Srednje odeljenje"; ako ima ucenika izmedju 15 i 25
    //	- "Malo odeljenje"; ako ima ucenika manje od 15
    public String velicinaOdeljenja(){

        String velicinaOdeljenja = " ";
        if (dnevnik.size() > 25){
            velicinaOdeljenja = "Veliko odeljenje";
        }else if (dnevnik.size() < 15 || dnevnik.size() < 25){
            velicinaOdeljenja = "Srednje odeljenje";
       } else if (dnevnik.size() < 15){
            velicinaOdeljenja = "Malo odeljenje";
        }
        return velicinaOdeljenja;
    }
    //Napisati toString() metod:
    //	{Oznaka} odeljenja ima djake:
    //	{Ime1} {Prezime1}
    //	{Ime2} {Prezime2}
    //	.
    //	.
    //	.
    //	{ImeN} {PrezimeN}
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append("Odeljenje ima djake:");
        for (Ucenik ucenik: dnevnik){
            sb.append(ucenik.getIme());
            sb.append(" ");
            sb.append(ucenik.getPrezime());
        }
        return sb.toString();
    }



}
