/** Subclass: kamar kelas 1 (kapasitas 2 pasien). */
public class KamarKelas1 extends Kamar implements Billable {

    // Overloaded #1: memakai tarif default dari Kamar(String, int)
    public KamarKelas1(String nomorKamar) {
        super(nomorKamar, 2);
    }

    // Overloaded #2: tarif ditentukan sendiri
    public KamarKelas1(String nomorKamar, double tarifPerHari) {
        super(nomorKamar, 2, tarifPerHari);
    }

    @Override
    public void checkIn() {
        if (getTerisi() < getKapasitas()) {
            setTerisi(getTerisi() + 1);
            System.out.println("Check-in berhasil di kamar Kelas 1 " + getNomorKamar());
        } else {
            System.out.println("Kamar Kelas 1 " + getNomorKamar() + " penuh.");
        }
    }

    @Override
    public void tampilkanInfo() {
        System.out.print("[Kelas 1] ");
        super.tampilkanInfo();
    }
}
