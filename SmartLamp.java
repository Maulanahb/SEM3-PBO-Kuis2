public class SmartLamp extends PerangkatRumah implements IConnectable {

    public SmartLamp(String nama, int daya) {
        super(nama, daya);
    }

    @Override
    public void fungsiUtama() {
        System.out.println(nama + " menyala dengan terang hangat.");
    }

    @Override
    public void connectToWiFi() {
        System.out.println(nama + " terhubung ke WiFi untuk kontrol jarak jauh.");
    }
}
