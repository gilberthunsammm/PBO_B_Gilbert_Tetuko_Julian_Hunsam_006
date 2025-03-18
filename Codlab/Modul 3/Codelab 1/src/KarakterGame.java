class KarakterGame {
        private final String nama;
        private int kesehatan;

        // Constructor
        public KarakterGame(String nama, int kesehatan) {
            this.nama = nama;
            this.kesehatan = kesehatan;
        }
                                
        // Getter dan Setter
        public String getNama() {
            return nama;
        }

        public void setKesehatan(int kesehatan) {
            this.kesehatan = kesehatan;
        }

        public int getKesehatan() {
            return kesehatan;
        }

        // Method serang (bisa di-override)
        public void serang(KarakterGame target) {
            System.out.println(nama + " menyerang " + target.getNama());
        }
}


