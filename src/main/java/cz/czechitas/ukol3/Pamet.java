package cz.czechitas.ukol3;

public class Pamet {
    /**
     * kapacita je v bajtech
     */
    private long kapacita;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    @Override
    public String toString() {
        return "Pamet{" +
                "kapacita=" + kapacita +
                '}';
    }
}
