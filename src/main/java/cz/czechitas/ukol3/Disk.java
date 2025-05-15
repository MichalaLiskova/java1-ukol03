package cz.czechitas.ukol3;

public class Disk {
    /**
     * kapacita v bajtech
     */
    private long kapacita;
    /**
     * vyuziteMisto v bajtech
     */
    private long vyuziteMisto;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        if (vyuziteMisto < 0) {
            System.err.println("Vyuzite misto nesmi byt mensi nez 0.");
            return;
        }
        if (kapacita < vyuziteMisto) {
            System.err.println("Přesáhl jste kapacitu disku.");
            return;
        }
        this.vyuziteMisto = vyuziteMisto;
    }
}

