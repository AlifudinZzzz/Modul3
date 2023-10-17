package ProjectKelasBuku;

public class bukuBeraksi { //Deklarasi untuk membuat sebuah kelas bukuBeraksi
    public static void main (String[]args){
        Buku buku_agus=
                new Buku("Pemrograman Berorientasi Objek Dengan Java ", "Indrajani",
                        "Elexmedia Komputindo",2007);
        buku_agus.cetakBuku();
    }
}
