package ProjectMobil;
public class Mobil { //Deklarasi untuk membuat sebuah kelas mobil
    String warna; // Variabel string yang mewakili warna mobil
    int tahunProduksi; //Variabel int yang mewakili tahun produksi mobil
    public Mobil(String warna, int tahunProduksi) {
        this.warna = warna; // Mengatur Warna mobil
        this.tahunProduksi = tahunProduksi; // Mengatur tahun produksi mobil
    }
    public void info() { // deklarasi metod info yang mencetak informasi dari mobil
        System.out.println("Warna: " + warna); //Untuk menampilkan teks pada warna mobil
        System.out.println("Tahun: " + tahunProduksi); // Untuk menampilkan tahun produksi mobil
    }
}
