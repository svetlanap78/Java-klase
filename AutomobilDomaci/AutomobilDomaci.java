package KlasePetaNedelja.Domaci.AutomobilDomaci;

import KlasePetaNedelja.Osoba1;

public class AutomobilDomaci {

    private String marka;
    private String model;
    private int serijskiBroj;
    private Osoba1 vlasnik;

    // postavljam konstruktor sa vlasnikom
    AutomobilDomaci(String marka, String model, int serijskiBroj, Osoba1 vlasnik){
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        if (vlasnik == null) {
            System.out.println("Nema vlasnika");
        } else {
            this.vlasnik = vlasnik;
        }
    }

    AutomobilDomaci(String marka, String model, int serijskiBroj){
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        if (vlasnik == null) {
            System.out.println("Nema vlasnika");
        } else {
            this.vlasnik = vlasnik;
        }
    }

    //postavljam getere
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj(){
        return serijskiBroj;
    }

    public Osoba1 getVlasnik() {
        return vlasnik;
    }

    // postavljam setter samo za vlasnika

    public void setVlasnik(Osoba1 vlasnik) {
        if (vlasnik == null) {
            System.out.println("Nema vlasnika");
        } else {
            this.vlasnik = vlasnik;
        }
    }


    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append ("Marka automobila je: ");
        sb.append (marka);
        sb.append ("\n");

        sb.append ("Model automobila je: ");
        sb.append (model);
        sb.append ("\n");

        sb.append ("Serijski broj automobila je: ");
        sb.append (serijskiBroj);
        sb.append ("\n");

        if (vlasnik == null) {
            sb.append("Automobil nema vlasnika");
        } else {
            sb.append ("Vlasnik automobila je: ");
            sb.append (vlasnik.getIme());
            sb.append(" ");
            sb.append(vlasnik.getPrezime());
            sb.append ("\n");
        }


        return sb.toString();

    }


    /*    vozilo  - Napisati klasu Automobil. Automobil ima
1) marku (polje tipa String) koje moze da se dohvati, ali ne i postavi;
2) model (polje tipa String) koje moze da se dohvati ali ne i postavi;
3) serijski broj (neka u ovom zadatku bude polje tipa int) koje moze da se dohvati ali ne i postavi;
4) Automobil moze da ima vlasnika, i vlasnik moze da se dohvati i postavi u svakom trenutku
    Napisati klasu Voznja iz koje ce program moci da se pokrene. U njoj ce se kreirati najmanje dva automobila.
     Iskoristiti (proizvoljan broj puta) sve tipove metoda napisanih u klasi Automobil.

        */

}
