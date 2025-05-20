package Tugas;

//Pasien umum hanya perlu daftar tanpa verifikasi tambahan
public class PasienUmum extends Pasien {
 private static int nomorAntrian = 100;

 public PasienUmum(String nama, String jenisKelamin) {
     super(nama, jenisKelamin);
 }

 // Proses pendaftaran untuk pasien umum
 public void daftar() {
     System.out.println("Pasien umum " + nama + " telah mendaftar.");
 }

 // Nomor antrian otomatis bertambah
 public int ambilNomorAntrian() {
     return ++nomorAntrian;
 }
}
