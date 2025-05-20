package Latihan1;
	//Kelas Lingkaran merupakan turunan dari Bentuk yang merepresentasikan lingkaran
public class Lingkaran extends Bentuk {
	// Konstruktor untuk inisialisasi nilai jari-jari
    public Lingkaran(int jari2) {
        super(jari2);
    }

    // Implementasi method luas untuk menghitung luas lingkaran
    @Override
    public double luas() {
        return PI * jari2 * jari2;
    }

    // Method untuk mengambil nilai jari-jari (getter)
    public double getJari2() {
        return jari2;
    }

    // Method untuk mengubah nilai jari-jari (setter)
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}