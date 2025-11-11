public class MainSmartHome {
    public static void main(String[] args) {
        SmartSpeaker speaker = new SmartSpeaker("Google Home", 20);
        SmartLamp lamp = new SmartLamp("Philips Hue", 10);
        SmartOven oven = new SmartOven("Smart Oven LG", 800);

        System.out.println("=== Sistem Rumah Pintar Dihidupkan ===\n");

        speaker.hidupkan();
        lamp.hidupkan();
        oven.hidupkan();

        System.out.println();

        speaker.connectToWiFi();
        lamp.connectToWiFi();

        System.out.println();

        speaker.fungsiUtama();
        lamp.fungsiUtama();
        oven.fungsiUtama();

        System.out.println();

        speaker.naikkanVolume();
        speaker.turunkanVolume();

        System.out.println();

        speaker.matikan();
        lamp.matikan();
        oven.matikan();

        System.out.println("\n=== Semua perangkat dimatikan ===");
    }
}
