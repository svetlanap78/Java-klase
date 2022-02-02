package KlasePetaNedelja.Domaci.AutomobilDomaci;

import KlasePetaNedelja.Domaci.AutomobilDomaci.AutomobilDomaci;
import KlasePetaNedelja.Osoba1;

public class Voznja {
    public static void main(String[] args) {

        Osoba1 vlasnik = new Osoba1("Pera", "Peric", 2002, 568);
       // Osoba1 vlasnik2=  new Osoba1 ("Marko", "Markovic", 2000, 189);


        AutomobilDomaci automobil1 = new AutomobilDomaci ("Ford", "Mondeo", 123456, vlasnik);
        System.out.println(automobil1);
        AutomobilDomaci automobil2 = new AutomobilDomaci ("Audi", "Audi 4", 568449);
        System.out.println(automobil2);



        System.out.println (automobil1.getMarka());
        System.out.println (automobil2.getMarka());

        System.out.println(automobil1.getModel());
        System.out.println(automobil2.getModel());

        System.out.println( automobil1.getSerijskiBroj());
        System.out.println(automobil2.getSerijskiBroj());

        System.out.println(automobil1.getVlasnik().getIme());
        System.out.println(automobil1.getVlasnik().getPrezime());


        vlasnik.setIme("Marko");
        vlasnik.setPrezime("Markovic");

        System.out.print("Vlasnik drugog automobila je: " + automobil1.getVlasnik().getIme() + " " + automobil1.getVlasnik().getPrezime());














    }
}
