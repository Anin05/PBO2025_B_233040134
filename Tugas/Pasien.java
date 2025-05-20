package Tugas;

//Kelas abstrak sebagai kerangka dasar pasien klinik
public abstract class Pasien {
 protected String nama;
 protected String jenisKelamin;

 // Konstruktor untuk menyimpan data awal pasien
 public Pasien(String nama, String jenisKelamin) {
     this.nama = nama;
     this.jenisKelamin = jenisKelamin;
 }

 // Setiap pasien wajib memiliki fungsi daftar dan ambil antrian
 public abstract void daftar();
 public abstract int ambilNomorAntrian();
}