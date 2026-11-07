/** Subclass: kamar ICU, biaya lebih mahal karena peralatan medis. */
public class KamarICU extends Kamar implements Billable {

    private static final double BIAYA_ALAT = 500000;

    public KamarICU(String nomorKamar) {
        super(nomorKamar, 1, 1500000);
    }

    @Override
    public void checkIn() {
        if (getTerisi() < getKapasitas()) {
            setTerisi(getTerisi() + 1);
            System.out.println("Pasien masuk ICU " + getNomorKamar());
        } else {
            System.out.println("ICU " + getNomorKamar() + " penuh, cari ICU lain.");
        }
    }

    @Override
    public double hitungBiaya(int hari) {
        return super.hitungBiaya(hari) + BIAYA_ALAT;
    }

    @Override
    public void tampilkanInfo() {
        System.out.print("[ICU] ");
        super.tampilkanInfo();
    }
}
