package KlasePetaNedelja.Domaci.Ucenik;

import java.net.Inet4Address;
import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik>dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

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
    // dodajem ucenika u dnevnik
    public void upisiUcenika (Ucenik u) {
    dnevnik.add(u);
    }
    //dodajem ucenika na odredjeno mesto u dnevniku (add(index, element))
    public void upisiUcenikaNaMesto (int mestoUDnevniku, Ucenik u) {
        dnevnik.add(mestoUDnevniku, u);
    }
    // brisem ucenika
    public void ispisiUcenika (Ucenik u){
        dnevnik.remove(u);
    }
    public void ispisiUcenikaSaMesta(int mestoUDnevnikku) {
        dnevnik.remove(mestoUDnevnikku);
    }
    // pogledaj ocene mislim da moze biti sout...ali ne znam da li je ovo ispravno
    public void pogledajOcene (Ucenik u){
        System.out.println("Ocene ucenika su: " + u.getNizOcena()); //
    }





}
