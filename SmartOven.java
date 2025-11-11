public class SmartOven extends PerangkatRumah {

    public SmartOven(String nama, int daya) {
        super(nama, daya);
    }

    @Override
    public void fungsiUtama() {
        System.out.println(nama + " sedang memanggang makanan dengan suhu optimal.");
    }
}
