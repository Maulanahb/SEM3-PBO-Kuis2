public abstract class PerangkatRumah {
    protected String nama;
    protected int daya;

    public PerangkatRumah(String nama, int daya) {
        this.nama = nama;
        this.daya = daya;
    }

    public void hidupkan() {
        System.out.println(nama + " dihidupkan. Daya: " + daya + " Watt");
    }

    public void matikan() {
        System.out.println(nama + " dimatikan.");
    }

    public abstract void fungsiUtama();
}
