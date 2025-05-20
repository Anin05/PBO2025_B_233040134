package Tugas;

//Pasien BPJS wajib diverifikasi sebelum mendaftar
public class PasienBPJS extends Pasien implements Verifikasi {
 private static int nomorAntrian = 200;

 public PasienBPJS(String nama, String jenisKelamin) {
     super(nama, jenisKelamin);
 }

 // Proses verifikasi khusus untuk BPJS
 public void verifikasiBPJS() {
     System.out.println("BPJS pasien " + nama + " berhasil diverifikasi.");
 }

 // Pendaftaran hanya dilakukan setelah verifikasi
 public void daftar() {
     verifikasiBPJS();
     System.out.println("Pasien BPJS " + nama + " telah mendaftar.");
 }

 // Nomor antrian untuk pasien BPJS dimulai dari 200
 public int ambilNomorAntrian() {
     return ++nomorAntrian;
 }
}
