public class Main {// Kelas utama yang berisi metode main
        public static void main(String[] args) {

            Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyan~"); // Membuat objek hewan1 dengan nama "Kucing", jenis "Mamalia", dan suara "Nyan~"
            Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!"); // Membuat objek hewan2 dengan nama "Anjing", jenis "Mamalia", dan suara "Woof-Woof!!"

            // Memanggil metode untuk menampilkan informasi masing-masing hewan
            hewan1.tampilkanInfo();
            hewan2.tampilkanInfo();
        }
    }

