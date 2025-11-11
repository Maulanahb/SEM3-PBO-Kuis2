public class SmartSpeaker extends PerangkatRumah implements IConnectable, IAudible {
    private int volume;

    public SmartSpeaker(String nama, int daya) {
        super(nama, daya);
        this.volume = 5;
    }

    @Override
    public void fungsiUtama() {
        System.out.println(nama + " memainkan musik favorit Anda.");
    }

    @Override
    public void connectToWiFi() {
        System.out.println(nama + " terhubung ke WiFi.");
    }

    @Override
    public void naikkanVolume() {
        if (volume < 10) volume++;
        System.out.println(nama + " volume naik ke " + volume);
    }

    @Override
    public void turunkanVolume() {
        if (volume > 0) volume--;
        System.out.println(nama + " volume turun ke " + volume);
    }
}
