package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac fibi = new Pocitac("Fibi");
        Procesor procesor = new Procesor();
        Pamet pamet = new Pamet();
        Disk disk = new Disk();

        procesor.setRychlost(4888);
        procesor.setVyrobce("Intel");
        pamet.setKapacita(1000000000);
        disk.setKapacita(100000);
        disk.setVyuziteMisto(900000);


        fibi.setPevnyDisk(disk);
        fibi.setPamet(pamet);
        fibi.setProcesor(procesor);

        // fibi.setNazevPocitace("fibi");

        fibi.zapniSe();
        fibi.vypniSe();
        fibi.vymazSouborOVelikosti(255555);
        fibi.vytvorSouborOVelikosti(500);
        fibi.zapniSe();
        fibi.vymazSouborOVelikosti(2555555);
        fibi.vytvorSouborOVelikosti(50000000);
    }

}
