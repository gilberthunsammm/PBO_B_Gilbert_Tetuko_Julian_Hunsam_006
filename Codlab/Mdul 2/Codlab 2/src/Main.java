// Kelas RekeningBank yang merepresentasikan rekening nasabah
class RekeningBank {
    // Atribut untuk menyimpan informasi rekening
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Konstruktor untuk inisialisasi objek RekeningBank
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Metode untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    // Metode untuk menyetor uang ke rekening
    public void setorUang(double jumlah) {
        saldo += jumlah; // Menambah saldo
        System.out.println(namaPemilik + " menambah uang Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
    }

    // Metode untuk menarik uang dari rekening
    public void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        } else {
            saldo -= jumlah; // Mengurangi saldo
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        }
    }
}

// Kelas utama yang berisi metode main
public class Main {
    public static void main(String[] args) {
        // Membuat dua objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("2023107911129", "Maharan", 500000);
        RekeningBank rekening2 = new RekeningBank("2023107911307", "Amelia", 700000);

        // Menampilkan informasi awal rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Simulasi transaksi untuk rekening1
        rekening1.setorUang(200000);
        rekening1.tarikUang(800000); // Gagal karena saldo tidak mencukupi
        rekening1.tarikUang(500000); // Berhasil

        System.out.println(); // Pemisah output

        // Simulasi transaksi untuk rekening2
        rekening2.setorUang(100000);
        rekening2.tarikUang(300000); // Berhasil

        // Menampilkan informasi rekening setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        System.out.println("\nProcess finished with exit code 0");
    }
}