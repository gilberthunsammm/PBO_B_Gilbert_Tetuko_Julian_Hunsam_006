import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Untuk mengInput nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Untuk MengInput jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Untuk MengInput tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Hitung umur berdasarkan tahun saat ini
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin dalam teks
        String jenisKelaminTeks;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminTeks = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminTeks = "Perempuan";
        } else {
            jenisKelaminTeks = "Tidak diketahui";
        }

        // Output data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminTeks);
        System.out.println("Umur         : " + umur + " tahun");

        scanner.close();
    }
}
