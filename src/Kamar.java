/** Superclass abstract untuk semua jenis kamar rawat inap. */
public abstract class Kamar {

    // [2] Konstanta global
    public static final double BIAYA_ADMIN = 50000;

    // [2] Atribut instans kekal, [3] semua atribut private
    private final String nomorKamar;
    private int kapasitas;
    private int terisi;
    private double tarifPerHari;

    // [3] Overloaded constructor #1 (tarif default)
    public Kamar(String nomorKamar, int kapasitas) {
        this(nomorKamar, kapasitas, 200000);
    }

    // [3] Overloaded constructor #2
    public Kamar(String nomorKamar, int kapasitas, double tarifPerHari) {
        this.nomorKamar = nomorKamar;
        this.kapasitas = kapasitas;
        this.tarifPerHari = tarifPerHari;
        this.terisi = 0;
    }

    // [7] Abstract method
    public abstract void checkIn();

    // [1] Method prosedur (void)
    public void checkOut() {
        if (terisi > 0) {
            terisi--;
            System.out.println("Pasien check-out dari kamar " + nomorKamar);
        } else {
            System.out.println("Kamar " + nomorKamar + " sudah kosong.");
        }
    }

    // [1] Method fungsi (return value)
    public double hitungBiaya(int hari) {
        return (tarifPerHari * hari) + BIAYA_ADMIN;
    }

    public void tampilkanInfo() {
        System.out.println("Kamar " + nomorKamar + " | terisi " + terisi + "/" + kapasitas
                + " | tarif/hari Rp" + tarifPerHari);
    }

    // [3] Getter dan setter
    public String getNomorKamar() { return nomorKamar; }
    public int getKapasitas() { return kapasitas; }
    public void setKapasitas(int kapasitas) { this.kapasitas = kapasitas; }
    public int getTerisi() { return terisi; }
    public void setTerisi(int terisi) { this.terisi = terisi; }
    public double getTarifPerHari() { return tarifPerHari; }
    public void setTarifPerHari(double tarifPerHari) { this.tarifPerHari = tarifPerHari; }
}
