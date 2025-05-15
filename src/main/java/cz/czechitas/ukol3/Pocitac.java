package cz.czechitas.ukol3;

import javax.swing.*;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor procesor;
    private Pamet pamet;
    private Disk pevnyDisk;


    //  public void setNazevPocitace(String nazevPocitace) {
    //    this.nazevPocitace = nazevPocitace;
    //}

    private String nazevPocitace;

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public Pamet getPamet() {
        return pamet;
    }

    public void setPamet(Pamet pamet) {
        this.pamet = pamet;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }


    public Pocitac(String nazevPocitace) {
        this.nazevPocitace = nazevPocitace;
        // this.jeZapnuty = true;
    }


    public void zapniSe() {
        if (this.jeZapnuty) { // nebo (jeZapnuty == true)
            System.err.println(nazevPocitace + " pocitac je jiz zapnuty, nelze zapnout znovu");
        } else {
            if (this.procesor == null) {
                System.err.println(nazevPocitace + " pocitac nema procesor.");
                return;
            }
            if (this.pamet == null) {
                System.err.println(nazevPocitace + " pocitac nema pamet.");
                return;
            }
            if (this.pevnyDisk == null) {
                System.err.println(nazevPocitace + " pocitac nema pevnyDisk.");
                return;
            }
            jeZapnuty = true;
            System.out.println(nazevPocitace + " pocitac se zapnul.");
        }
    }

    public void vypniSe() {
        if (this.jeZapnuty) {
            jeZapnuty = false;
            System.out.println(nazevPocitace + " počítač se vypnul");
        } //else {
        //System.out.println(nazevPocitace + " počítač je vypnutý");
    }

    public boolean jeZapnuty() {
        return this.jeZapnuty;
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if  (!this.jeZapnuty) {
            System.err.println("Nemas zapnuty pocitac.");
            return;
        }
        pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);

    }
    public void vymazSouborOVelikosti(long velikost) {
        if  (!this.jeZapnuty) {
            System.err.println("Nemas zapnuty pocitac.");
            return;
        }
        pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);

    }
}
