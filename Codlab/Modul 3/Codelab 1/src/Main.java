public class Main {
    public static void main(String[] args) {
        // Membuat tiga objek sesuai spesifikasi
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan pahlawan = new Pahlawan("Brimstone", 150);
        Musuh musuh = new Musuh("Viper", 200);

        System.out.println("Status Awal: ");
        System.out.println(pahlawan.getNama() + " memiliki kesehatan: " + pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + " memiliki kesehatan: " + musuh.getKesehatan());
        // Contoh interaksi
        pahlawan.serang(musuh);  // Brimstone menyerang Viper menggunakan pedang!
        musuh.serang(pahlawan);  // Viper menyerang Brimstone menggunakan sihir!
    }
}