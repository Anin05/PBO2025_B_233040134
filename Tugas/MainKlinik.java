package Tugas;

//Program utama untuk menjalankan simulasi pendaftaran pasien
public class MainKlinik {
 public static void main(String[] args) {
     // Buat pasien umum
     Pasien pasien1 = new PasienUmum("Lala", "Perempuan");

     // Buat pasien BPJS
     Pasien pasien2 = new PasienBPJS("Budi", "Laki-laki");

     // Jalankan proses untuk pasien umum
     pasien1.daftar();
     System.out.println("Nomor antrian: " + pasien1.ambilNomorAntrian());

     // Jalankan proses untuk pasien BPJS
     pasien2.daftar();
     System.out.println("Nomor antrian: " + pasien2.ambilNomorAntrian());
 }
}
