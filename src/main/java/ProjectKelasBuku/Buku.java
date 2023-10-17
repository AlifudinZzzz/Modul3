package ProjectKelasBuku;

public class Buku{ //Deklarasi untuk membuat sebuah kelas Buku
    private String judul; // Untuk Mendeklarasikan variabel judul
    private String pengarang; // UntukMendeklarasikan variabel pengarang
    private String penerbit; //  UntukMendeklarasikan variabel penerbit
    private int tahun; // Untuk Mendeklarasikan variabel tahun
    public Buku(String judul, String pengarang, String penerbit,
                int tahun){// Konstruktor untuk kelas Buku
        this.judul=judul; // Menginisialisasi atribut judul dengan nilai
        this.pengarang=pengarang; // Menginisialisasi atribut pengarang dengan nilai
        this.penerbit=penerbit; // Menginisialisasi atribut penerbit dengan nilai
        this.tahun=tahun; // Menginisialisasi atribut tahun dengan nilai
    }
    public void cetakBuku(){// Menampilkan informasi buku ke layar
        System.out.println("Judul =" + this.judul); //Untuk menampilkan judul
        System.out.println("Pengarang =" + this.pengarang); //Untuk menampilkan pengarang
        System.out.println("Penerbit =" + this.penerbit); //Untuk menampilkan penerbit
        System.out.println("Tahun =" + this.tahun); //Untuk menampilkan tahun
    }
}
