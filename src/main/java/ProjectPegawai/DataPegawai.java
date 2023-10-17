package ProjectPegawai;
class pegawai {
    //atributes
    private String nip;
    private String nama;
    private String alamat;
    private double jumlahHariLembur;
    private double gaji_pokok;
    private double total_gaji;
    //methods
    public pegawai()
    { //constructor
        System.out.println("Konstruktor pegawai dijalankan...");
    }
    //fungsi-fungsi mutator

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getJumlahHariLembur() {
        return jumlahHariLembur;
    }

    public void setJumlahHariLembur(float jumlahHariLembur) {
        this.jumlahHariLembur = jumlahHariLembur;
    }

    public double getGaji_pokok() {
        return gaji_pokok;
    }

    public void setGaji_pokok(double gaji_pokok) {
        this.gaji_pokok = gaji_pokok;
    }

    //method overloading
    public void setTotalGaji(double Jmlh_hari_lembur, double Gaji_pokok)
    {
        jumlahHariLembur = Jmlh_hari_lembur;
        gaji_pokok = Gaji_pokok;
        total_gaji = gaji_pokok + (gaji_pokok * jumlahHariLembur *0.01);
    }
    public void setTotalGaji(double Gaji_pokok)
    {
        jumlahHariLembur = 12;
        gaji_pokok = Gaji_pokok;
        total_gaji = gaji_pokok + (gaji_pokok * jumlahHariLembur *0.01);
    }
    public void cetakKeLayar()
    {
        System.out.println("Nomor Pegawai : "+getNip());
        System.out.println("Nama Pegawai : "+getNama());
        System.out.println("Alamat Pegawai : "+getAlamat());
        System.out.println("Jumlah hari lembur : " + getJumlahHariLembur()+" hari");
        System.out.println("Gaji pokok : "+getGaji_pokok());
        System.out.println("Total gaji : "+total_gaji);

        System.out.println("");
    }
}