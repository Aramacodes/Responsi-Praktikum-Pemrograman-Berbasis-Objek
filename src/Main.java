/** Class Main: alur pengujian untuk membuktikan 10 persyaratan. */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== [2] Konstanta global ===");
        System.out.println("Biaya admin: Rp" + Kamar.BIAYA_ADMIN);

        System.out.println("\n=== [3] Overloaded constructor ===");
        Kamar k1 = new KamarKelas1("K1-01");            // tarif default
        Kamar k2 = new KamarKelas1("K1-02", 400000);    // tarif custom
        System.out.println("Tarif k1 (default): Rp" + k1.getTarifPerHari());
        System.out.println("Tarif k2 (custom) : Rp" + k2.getTarifPerHari());

        System.out.println("\n=== [4][5] Inheritance & super chaining ===");
        KamarVIP vip = new KamarVIP("VIP-01");
        KamarICU icu = new KamarICU("ICU-01");
        k1.tampilkanInfo();
        vip.tampilkanInfo();
        icu.tampilkanInfo();

        System.out.println("\n=== [7][8] Abstract method + logika if/else (state berubah) ===");
        vip.checkIn();   // berhasil
        vip.checkIn();   // penuh
        k1.checkIn();
        k1.checkIn();
        k1.checkIn();    // penuh
        vip.tampilkanInfo();

        System.out.println("\n=== [1] Method void & fungsi ===");
        vip.checkOut();
        vip.checkOut();  // sudah kosong
        System.out.println("Tagihan pasien VIP yang check-out (3 hari): Rp" + vip.hitungBiaya(3));

        System.out.println("\n=== [6] Overriding (biaya beda tiap subclass, 3 hari) ===");
        System.out.println("Kelas 1 : Rp" + k1.hitungBiaya(3));
        System.out.println("VIP     : Rp" + vip.hitungBiaya(3));
        System.out.println("ICU     : Rp" + icu.hitungBiaya(3));

        System.out.println("\n=== [9] Polimorfisme lewat interface ===");
        Billable b = new KamarVIP("VIP-02");
        System.out.println("Billable -> VIP 2 hari: Rp" + b.hitungBiaya(2));
        Billable b2 = new KamarICU("ICU-02");
        System.out.println("Billable -> ICU 2 hari: Rp" + b2.hitungBiaya(2));

        System.out.println("\n=== [10] Multiple interface (Billable & Cleanable) ===");
        Cleanable c = new KamarVIP("VIP-03");
        c.bersihkan();

        System.out.println("\n=== [3] Setter & getter ===");
        k1.setTarifPerHari(450000);
        System.out.println("Tarif baru Kelas 1: Rp" + k1.getTarifPerHari());
    }
}
