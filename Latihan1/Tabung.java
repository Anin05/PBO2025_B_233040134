package Latihan1;
//Kelas Tabung adalah subclass dari Bentuk yang merepresentasikan bentuk tabung
public class Tabung extends Bentuk {
    // Atribut tinggi menyimpan nilai tinggi tabung
    private int tinggi;

    // Konstruktor kelas Tabung
    // Memanggil konstruktor dari kelas induk (Bentuk) untuk inisialisasi jari-jari,
    // lalu menyimpan nilai tinggi
    public Tabung(int jari2, int tinggi) {
        super(jari2);
        this.tinggi = tinggi;
    }

 // Mengimplementasikan method luas untuk menghitung luas permukaan tabung
    @Override
    public double luas() {
        return 2 * PI * jari2 * (jari2 + tinggi);
    }

    // Getter dan setter untuk atribut tinggi
    // Mengambil nilai tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Mengubah nilai tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}