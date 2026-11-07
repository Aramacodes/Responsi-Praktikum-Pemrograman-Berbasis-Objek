/** Subclass: kamar VIP, mengimplementasikan dua interface sekaligus. */
public class KamarVIP extends Kamar implements Billable, Cleanable { // [10]

    private static final double BIAYA_FASILITAS = 100000;

    public KamarVIP(String nomorKamar) {
        super(nomorKamar, 1, 750000); // [5] super(...)
    }

    // [6][8] Implementasi abstract method dengan if/else yang membaca & mengubah state
    @Override
    public void checkIn() {
        if (getTerisi() < getKapasitas()) {
            setTerisi(getTerisi() + 1);
            System.out.println("Check-in berhasil di kamar VIP " + getNomorKamar());
        } else {
            System.out.println("Kamar VIP " + getNomorKamar() + " penuh.");
        }
    }

    // [6] Overriding + [5] super.namaMethod()
    @Override
    public double hitungBiaya(int hari) {
        return super.hitungBiaya(hari) + BIAYA_FASILITAS;
    }

    @Override
    public void tampilkanInfo() {
        System.out.print("[VIP] ");
        super.tampilkanInfo(); // [5]
    }

    @Override
    public void bersihkan() {
        System.out.println("Kamar VIP " + getNomorKamar() + " dibersihkan (deep cleaning).");
    }
}
