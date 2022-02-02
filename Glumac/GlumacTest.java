package KlasePetaNedelja.Domaci.Glumac;

import KlasePetaNedelja.Domaci.Glumac.Glumac;

public class GlumacTest {
    public static void main(String[] args) {

        Glumac muskarac = new Glumac ("Dragan","Bjelogrlic", 'm', 54, 8.3, true);
        Glumac zena = new Glumac ("Monika","Beluci", 'z', 54, 9.1, false);

        System.out.println("Glumac" + "\n" + muskarac);
        System.out.println("Glumica" + "\n" + zena);

        zena.setOcena(9.8);
        System.out.println("Ocena glumice je: " + zena.getIme() + " " + zena.getPrezime() + " " + zena.getOcena());

        muskarac.setOcena(9.9);
        System.out.println("Ocena glumca je: " + muskarac.getIme() + " " + muskarac.getPrezime() + " " + muskarac.getOcena());

    }
}
