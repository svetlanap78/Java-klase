package KlasePetaNedelja.Domaci.Sportista;

public class Sportista {

    private String ime;
    private String prezime;
    private String sport;
    private String klub;
    private int brojDresa;

    public Sportista(String ime, String prezime, String sport, String klub, int brojDresa) {
        this.ime = ime;
        this.prezime = prezime;
        this.sport = sport;
        this.klub = klub;
        this.brojDresa = brojDresa;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getSport() {
        return sport;
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public int getBrojDresa() {
        return brojDresa;
    }

    public void setBrojDresa(int brojDresa) {
        this.brojDresa = brojDresa;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Ime: ");
        sb.append(ime);
        sb.append("\n");

        sb.append("Prezime: ");
        sb.append(prezime);
        sb.append("\n");

        sb.append("Sport: ");
        sb.append(sport);
        sb.append("\n");

        sb.append("Klub: ");
        sb.append(klub);
        sb.append("\n");

        sb.append("Broj dresa: ");
        sb.append(brojDresa);
        sb.append("\n");

        return sb.toString();
    }



    /* sport - Napisati klasu Sportista. Sportista ima
1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da promeni klub za koji igra.
            4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi.
    Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta)
    sve tipove metoda napisanih u klasi Sportista.*/
}
