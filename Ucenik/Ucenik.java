package KlasePetaNedelja.Domaci.Ucenik;

import KlasePetaNedelja.BankovniRacun;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer>nizOcena;

    public Ucenik(String ime, String prezime, ArrayList<Integer> nizOcena) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = nizOcena;
    }

    public Ucenik(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        this.nizOcena = new ArrayList<Integer>();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public ArrayList<Integer> getNizOcena() {
        return nizOcena;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setNizOcena(ArrayList<Integer> nizOcena) {
        this.nizOcena = nizOcena;
    }

    public void dodajOcenu (int ocena) {
        nizOcena.add(ocena);
    }

    public double prosek () {
    double suma = 0;
    int ocena = 0;
    for (int i = 0; i < nizOcena.size(); i++) {
        suma = suma + ocena;
    }
    //ovo je prosek
    return suma / nizOcena.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ");
        sb.append(ime);
        sb.append(" i ");
        sb.append("Prezime: ");
        sb.append(prezime);
        sb.append("Ima ocene: " + "\n");
        sb.append(nizOcena);

        return toString();

    }
}
