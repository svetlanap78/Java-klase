package KlasePetaNedelja.Domaci.Sportista;

import KlasePetaNedelja.Domaci.Sportista.Sportista;

public class SportistaTest {
    public static void main(String[] args) {

        Sportista igrac1 = new Sportista("Petar","Petrovic","odbojka", "Zvezda", 7);
        Sportista igrac2 = new Sportista("Marko","Markovic","odbojka", "Partizan", 9);
        Sportista igrac3 = new Sportista("Darko","Borozan","odbojka", "Partizan", 4);

        System.out.println();
        System.out.println("Igrac 1 " + "\n" + igrac1);
        System.out.println();
        System.out.println("Igrac 2 " + "\n" + igrac2);
        System.out.println();
        System.out.println("Igrac 3 " + "\n" + igrac3);

        igrac1.setBrojDresa(10);
        System.out.println("Igrac jedan je promenio broj dresa sa 7 na 10" + "\n"+ igrac1);

        igrac2.setKlub("Dinamo");
        System.out.println("Igrac dva je promenio klub iz Partizana u Dinamo" + "\n" + igrac2);

        System.out.println("Trazimo broj dresa igraca 3: " + igrac3.getBrojDresa());

        igrac3.setBrojDresa(1);
        System.out.println("Igrac tri je promenio broj dresa sa 4 na 1" + "\n"+ igrac3);

    }
}
