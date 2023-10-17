package ProjectMatematika;

public class Matematika { //Deklarasi untuk membuat sebuah kelas Matematika
    int penambahan = 0; // Variabel int yang mewakili penambahan nilai awal mulai dari 0
    int pengurangan = 0; // Variabel int yang mewakili pengurangan nilai awal mulai dari 0
    double hasil = 0; // Variabel double yang mewakili hasil nilai awal mulai dari 0

    void penambahanMtk(int a, int b) {// Deklrasai Metod untuk melakukan operasi penambahan
                penambahan = a + b; // Untuk Menyimpan hasil penambahan a dan b ke variabel penambahan
        System.out.println("Penambahan : " + a + " + " + b + " = " + penambahan); //Menampilkan hasil penambahan
    }


    void penguranganMtk(int a,int b){// Deklrasai Metod untuk melakukan operasi pengurangan
                pengurangan= a - b; // Untuk menyimpan hasil pengurangan a dan b ke variabel pengurangan
        System.out.println("Pengurangan :"+a+ " - "+b+" = "+pengurangan); //Menampilkan hasil pengurangan
    }
}
